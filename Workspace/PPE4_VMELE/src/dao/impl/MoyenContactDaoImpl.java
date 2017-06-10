package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import business.EtatCommande;
import business.MoyenContact;
import dao.ConnexionBDD;
import dao.MoyenContactDao;
import dao.requete.ClientRequete;
import dao.requete.MoyenContactRequete;

public class MoyenContactDaoImpl implements MoyenContactDao {

	private Connection connexion = ConnexionBDD.getConnection();

	public MoyenContactDaoImpl() throws Exception {
		super();
		System.out.println("Constructeur MoyenContactDaoImpl");
	}

	@Override
	public MoyenContact findMoyenContactById(int idContact) {
		ResultSet resultat = null;
		PreparedStatement preparedStatement = null;

		int id_Contact;
		String libelle;
		MoyenContact moyenContact = null;

		try {
			preparedStatement = connexion.prepareStatement(MoyenContactRequete.FIND_MOYEN_CONTACT_BY_ID);
			preparedStatement.setInt(1, idContact);
			resultat = preparedStatement.executeQuery();

			if (resultat != null) {
				while (resultat.next()) {
					id_Contact = resultat.getInt(1);
					libelle = resultat.getString(2);

					moyenContact = new MoyenContact(id_Contact, libelle);
				}
			} else {
				moyenContact = null;
			}

		} catch (SQLException e) {
			System.out.println("MoyenContactDaoImpl/findMoyenContactById - Erreur SQL : " + e.getMessage());
		} finally {
			ConnexionBDD.close(null, preparedStatement, resultat);
		}
		return moyenContact;
	}

	@Override
	public List<MoyenContact> findAllMoyenContacts() {
		Statement statement = null;
		ResultSet resultat = null;

		List<MoyenContact> listeMoyenContacts = new ArrayList<MoyenContact>();

		int id_Contact;
		String libelle;
		MoyenContact moyenContact = null;


		try {
			statement = connexion.createStatement();
			resultat = statement.executeQuery(ClientRequete.FIND_ALL_CLIENTS);

			if (resultat != null) {
				while (resultat.next()) {
					id_Contact = resultat.getInt(1);
					libelle = resultat.getString(2);

					moyenContact = new MoyenContact(id_Contact, libelle);
					listeMoyenContacts.add(moyenContact);
				}
			} else {
				// Utilisateur utill = new Utilisateur("ttt", "ttt", "ttt", 4,
				// 1, "aaa", "aaa");
				// listeClients.add(utill);
			}

		} catch (SQLException e) {
			System.out.println("MoyenContactDaoImpl/findAllMoyenContact - Erreur SQL : " + e.getMessage());
		} finally {
			ConnexionBDD.close(statement, null, resultat);
		}

		return listeMoyenContacts;
	}
}
