package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import business.Client;
import business.Utilisateur;
import dao.ClientDao;
import dao.ConnexionBDD;
import dao.requete.ClientRequete;
import dao.requete.UtilisateurRequete;

public class ClientDaoImpl implements ClientDao {

	private Connection connexion = ConnexionBDD.getConnection();

	public ClientDaoImpl() throws Exception {
		super();
		System.out.println("Constructeur ClientDaoImpl");
	}

	@Override
	public Client findClientById(int idClient) {
		ResultSet resultat = null;
		PreparedStatement preparedStatement = null;

		int id_Personne;
		String raison_sociale;
		Client client = null;

		try {
			preparedStatement = connexion.prepareStatement(ClientRequete.FIND_CLIENT_BY_ID);
			preparedStatement.setInt(1, idClient);
			resultat = preparedStatement.executeQuery();

			if (resultat != null) {
				while (resultat.next()) {
					id_Personne = resultat.getInt(1);
					raison_sociale = resultat.getString(2);

					client = new Client(id_Personne, raison_sociale);
				}
			} else {
				client = null;
			}

		} catch (SQLException e) {
			System.out.println("ClientDaoImpl/findClientById - Erreur SQL : " + e.getMessage());
		} finally {
			ConnexionBDD.close(null, preparedStatement, resultat);
		}
		return client;
	}

	@Override
	public List<Client> findAllClients() {

		Statement statement = null;
		ResultSet resultat = null;

		List<Client> listeClients = new ArrayList<Client>();

		int id_Client;
		String raison_sociale;
		Client client = null;

		try {
			statement = connexion.createStatement();
			resultat = statement.executeQuery(ClientRequete.FIND_ALL_CLIENTS);

			if (resultat != null) {
				while (resultat.next()) {
					id_Client = resultat.getInt(1);
					raison_sociale = resultat.getString(2);

					client = new Client(id_Client, raison_sociale);
					listeClients.add(client);
				}
			}

		} catch (SQLException e) {
			System.out.println("ClientDaoImpl/findAllClients - Erreur SQL : " + e.getMessage());
		} finally {
			ConnexionBDD.close(statement, null, resultat);
		}

		return listeClients;
	}

	@Override
	public List<Client> findClientByRS(String raisonSociale) {
		ResultSet resultat = null;
		PreparedStatement preparedStatement = null;

		List<Client> listeClients = new ArrayList<Client>();

		int id_Client;
		String raison_sociale;
		Client client = null;

		try {
			preparedStatement = connexion.prepareStatement(ClientRequete.FIND_CLIENT_BY_RS);
			preparedStatement.setString(1, raisonSociale + "%");
			resultat = preparedStatement.executeQuery();

			if (resultat != null) {
				while (resultat.next()) {
					id_Client = resultat.getInt(1);
					raison_sociale = resultat.getString(2);

					client = new Client(id_Client, raison_sociale);
					listeClients.add(client);
				}
			}
		} catch (SQLException e) {
			System.out.println("ClientDaoImpl/findClientByRS - Erreur SQL : " + e.getMessage());
		} finally {
			ConnexionBDD.close(preparedStatement, null, resultat);
		}

		return listeClients;
	}

}
