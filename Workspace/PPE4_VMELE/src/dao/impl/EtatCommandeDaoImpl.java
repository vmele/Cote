package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import business.Client;
import business.EtatCommande;
import dao.ConnexionBDD;
import dao.EtatCommandeDao;
import dao.requete.ClientRequete;
import dao.requete.EtatCommandeRequete;

public class EtatCommandeDaoImpl implements EtatCommandeDao {

	private Connection connexion = ConnexionBDD.getConnection();

	public EtatCommandeDaoImpl() throws Exception {
		super();
		System.out.println("Constructeur EtatCommandeDaoImpl");
	}

	@Override
	public EtatCommande findEtatCommandeById(int idEtat) {
		ResultSet resultat = null;
		PreparedStatement preparedStatement = null;

		int id_Etat;
		String libelle;
		EtatCommande etatCommande = null;

		try {
			preparedStatement = connexion.prepareStatement(EtatCommandeRequete.FIND_ETAT_COMMANDE_BY_ID);
			preparedStatement.setInt(1, idEtat);
			resultat = preparedStatement.executeQuery();

			if (resultat != null) {
				while (resultat.next()) {
					id_Etat = resultat.getInt(1);
					libelle = resultat.getString(2);

					etatCommande = new EtatCommande(id_Etat, libelle);
				}
			} else {
				etatCommande = null;
			}

		} catch (SQLException e) {
			System.out.println("EtatCommandeDaoImpl/findEtatCommandeById - Erreur SQL : " + e.getMessage());
		} finally {
			ConnexionBDD.close(null, preparedStatement, resultat);
		}
		return etatCommande;
	}

	@Override
	public List<EtatCommande> findAllEtatCommandes() {
		Statement statement = null;
		ResultSet resultat = null;

		List<EtatCommande> listeEtatCommandes = new ArrayList<EtatCommande>();

		int id_Etat;
		String libelle;
		EtatCommande etatCommande = null;

		try {
			statement = connexion.createStatement();
			resultat = statement.executeQuery(EtatCommandeRequete.FIND_ALL_ETAT_COMMANDE);

			if (resultat != null) {
				while (resultat.next()) {
					id_Etat = resultat.getInt(1);
					libelle = resultat.getString(2);

					etatCommande = new EtatCommande(id_Etat, libelle);
					listeEtatCommandes.add(etatCommande);
				}
			} else {
			}

		} catch (SQLException e) {
			System.out.println("EtatCommandeDaoImpl/findAllEtatCommande - Erreur SQL : " + e.getMessage());
		} finally {
			ConnexionBDD.close(statement, null, resultat);
		}

		return listeEtatCommandes;
	}

}
