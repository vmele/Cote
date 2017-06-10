package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import business.TypeCommande;
import dao.ConnexionBDD;
import dao.TypeCommandeDao;
import dao.requete.TypeCommandeRequete;

public class TypeCommandeDaoImpl implements TypeCommandeDao {

	private Connection connexion = ConnexionBDD.getConnection();

	public TypeCommandeDaoImpl() throws Exception {
		super();
		System.out.println("Constructeur TypeCommandeDaoImpl");
	}

	@Override
	public TypeCommande findTypeCommandeById(int idType) {
		ResultSet resultat = null;
		PreparedStatement preparedStatement = null;

		int id_Type;
		String libelle;
		String libelle_court;
		TypeCommande typeCommande = null;

		try {
			preparedStatement = connexion.prepareStatement(TypeCommandeRequete.FIND_TYPE_COMMANDE_BY_ID);
			preparedStatement.setInt(1, idType);
			resultat = preparedStatement.executeQuery();

			if (resultat != null) {
				while (resultat.next()) {

					id_Type = resultat.getInt(1);
					libelle = resultat.getString(2);
					libelle_court = resultat.getString(3);

					typeCommande = new TypeCommande(id_Type, libelle, libelle_court);
				}
			} else {
				typeCommande = null;
			}

		} catch (SQLException e) {
			System.out.println("TypeCommandeDaoImpl/findTypeCommandeById - Erreur SQL : " + e.getMessage());
		} finally {
			ConnexionBDD.close(null, preparedStatement, resultat);
		}
		return typeCommande;
	}

	@Override
	public List<TypeCommande> findAllTypeCommandes() {
		Statement statement = null;
		ResultSet resultat = null;

		List<TypeCommande> listeTypeCommandes = new ArrayList<TypeCommande>();

		int id_Type;
		String libelle;
		String libelle_court;
		TypeCommande typeCommande = null;

		try {
			statement = connexion.createStatement();
			resultat = statement.executeQuery(TypeCommandeRequete.FIND_ALL_TYPE_COMMANDE);

			if (resultat != null) {
				while (resultat.next()) {
					id_Type = resultat.getInt(1);
					libelle = resultat.getString(2);
					libelle_court = resultat.getString(3);

					typeCommande = new TypeCommande(id_Type, libelle, libelle_court);
					listeTypeCommandes.add(typeCommande);
				}
			} else {
				// Utilisateur utill = new Utilisateur("ttt", "ttt", "ttt", 4,
				// 1, "aaa", "aaa");
				// listeClients.add(utill);
			}

		} catch (SQLException e) {
			System.out.println("TypeCommandeDaoImpl/findAllTypeCommande - Erreur SQL : " + e.getMessage());
		} finally {
			ConnexionBDD.close(statement, null, resultat);
		}

		return listeTypeCommandes;
	}

}
