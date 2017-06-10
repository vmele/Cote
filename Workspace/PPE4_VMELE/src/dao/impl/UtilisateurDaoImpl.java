package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dao.UtilisateurDao;
import dao.requete.CommandeRequete;
import dao.requete.UtilisateurRequete;
import business.Client;
import business.Commande;
import business.EtatCommande;
import business.MoyenContact;
import business.TypeCommande;
import business.Utilisateur;
import dao.ConnexionBDD;
import dao.requete.UtilisateurRequete;

public class UtilisateurDaoImpl implements UtilisateurDao {

	private Connection connexion = ConnexionBDD.getConnection();

	public UtilisateurDaoImpl() throws Exception {
		super();
		System.out.println("Constructeur UtilisateurDaoImpl");
	}

	@Override
	public Utilisateur findUtilisateurById(int idUtilisateur) {
		ResultSet resultat = null;
		PreparedStatement preparedStatement = null;

		int id_Personne;
		String identifiant;
		String motDePasse;
		String mail;
		int id_Droit;
		String nom;
		String prenom;
		Utilisateur utilisateur = null;

		try {
			preparedStatement = connexion.prepareStatement(UtilisateurRequete.FIND_UTILISATEUR_BY_ID);
			preparedStatement.setInt(1, idUtilisateur);

			System.out.println("REQUETE findUserByID : " + preparedStatement);
			resultat = preparedStatement.executeQuery();

			if (resultat != null) {
				while (resultat.next()) {
					id_Personne = resultat.getInt(1);
					identifiant = resultat.getString(2);
					motDePasse = resultat.getString(3);
					mail = resultat.getString(4);
					id_Droit = resultat.getInt(5);
					nom = resultat.getString(6);
					prenom = resultat.getString(7);

					utilisateur = new Utilisateur(identifiant, motDePasse, mail, id_Droit, id_Personne, nom, prenom);
				}
			} else {
				utilisateur = null;
			}

		} catch (SQLException e) {
			System.out.println("UtilisateurDaoImpl/findUtilisateurById - Erreur SQL : " + e.getMessage());
		} finally {
			ConnexionBDD.close(null, preparedStatement, resultat);
		}
		return utilisateur;
	}

	@Override
	public List<Utilisateur> findUtilisateursByName(String prenomUtilisateur) {
		ResultSet resultat = null;
		PreparedStatement preparedStatement = null;

		List<Utilisateur> listeUtilisateurs = new ArrayList<Utilisateur>();

		int id_Personne;
		String identifiant;
		String motDePasse;
		String mail;
		int id_Droit;
		String nom;
		String prenom;
		Utilisateur utilisateur = null;

		try {
			preparedStatement = connexion.prepareStatement(UtilisateurRequete.FIND_UTILISATEUR_BY_NAME);
			preparedStatement.setString(1, prenomUtilisateur + "%");
			preparedStatement.setString(2, prenomUtilisateur + "%");
			resultat = preparedStatement.executeQuery();

			if (resultat != null) {
				while (resultat.next()) {
					id_Personne = resultat.getInt(1);
					identifiant = resultat.getString(2);
					motDePasse = resultat.getString(3);
					mail = resultat.getString(4);
					id_Droit = resultat.getInt(5);
					nom = resultat.getString(6);
					prenom = resultat.getString(7);

					utilisateur = new Utilisateur(identifiant, motDePasse, mail, id_Personne, id_Droit, nom, prenom);
					listeUtilisateurs.add(utilisateur);
				}
			}
		} catch (SQLException e) {
			System.out.println("UtilisateurDaoImpl/findUserbyName - Erreur SQL : " + e.getMessage());
		} finally {
			ConnexionBDD.close(preparedStatement, null, resultat);
		}

		for (Utilisateur u : listeUtilisateurs) {
			System.out.println(u.getPrenom());
		}

		return listeUtilisateurs;
	}

	@Override
	public List<Utilisateur> findAllUtilisateurs() {
		Statement statement = null;
		ResultSet resultat = null;

		List<Utilisateur> listeUtilisateurs = new ArrayList<Utilisateur>();

		int id_Personne;
		String identifiant;
		String motDePasse;
		String mail;
		int id_Droit;
		String nom;
		String prenom;
		Utilisateur utilisateur = null;

		try {
			statement = connexion.createStatement();
			resultat = statement.executeQuery(UtilisateurRequete.FIND_ALL_UTILISATEURS);

			if (resultat != null) {
				while (resultat.next()) {
					id_Personne = resultat.getInt(1);
					identifiant = resultat.getString(2);
					motDePasse = resultat.getString(3);
					mail = resultat.getString(4);
					id_Droit = resultat.getInt(5);
					nom = resultat.getString(6);
					prenom = resultat.getString(7);

					utilisateur = new Utilisateur(identifiant, motDePasse, mail, id_Droit, id_Personne, nom, prenom);
					listeUtilisateurs.add(utilisateur);
				}
			} else {
				Utilisateur utill = new Utilisateur("ttt", "ttt", "ttt", 4, 1, "aaa", "aaa");
				listeUtilisateurs.add(utill);
			}

		} catch (SQLException e) {
			System.out.println("UtilisateurDaoImpl/findAllUtilisateurs - Erreur SQL : " + e.getMessage());
		} finally {
			ConnexionBDD.close(statement, null, resultat);
		}

		return listeUtilisateurs;
	}

	public List<Utilisateur> findUtilisateurByFilter(String filter) {
		ResultSet resultat = null;
		PreparedStatement preparedStatement = null;
		List<Utilisateur> listeUtilisateurs = new ArrayList<>();

		int id_personne;
		double montant = 0;
		Utilisateur utilisateur = null;

		try {
			preparedStatement = connexion.prepareStatement(UtilisateurRequete.utilisateurFilterTotal(filter));
			resultat = preparedStatement.executeQuery();

			if (resultat != null) {
				while (resultat.next()) {
					Utilisateur util = findUtilisateurById(resultat.getInt(1));
					montant = resultat.getDouble(2);

					utilisateur = new Utilisateur(util.getIdentifiant(), util.getMotDePasse(), util.getMail(),
							util.getIdDroit(), util.getIdPersonne(), util.getNom(), util.getPrenom(), montant);
					listeUtilisateurs.add(utilisateur);
				}
			} else {
				utilisateur = null;
			}
		} catch (SQLException e) {
			System.out.println("CommanderDaoImpl/findCommandeByFilter - Erreur SQL : " + e.getMessage());
		} finally {
			ConnexionBDD.close(preparedStatement, null, resultat);
		}

		return listeUtilisateurs;
	}

}
