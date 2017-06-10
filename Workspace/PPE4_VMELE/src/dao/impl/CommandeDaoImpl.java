package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import business.Client;
import business.Commande;
import business.EtatCommande;
import business.MoyenContact;
import business.TypeCommande;
import business.Utilisateur;
import dao.ClientDao;
import dao.CommandeDao;
import dao.ConnexionBDD;
import dao.EtatCommandeDao;
import dao.MoyenContactDao;
import dao.TypeCommandeDao;
import dao.UtilisateurDao;
import dao.requete.CommandeRequete;
import dao.requete.UtilisateurRequete;

public class CommandeDaoImpl implements CommandeDao {

	private Connection connexion = ConnexionBDD.getConnection();

	public CommandeDaoImpl() throws Exception {
		super();
		System.out.println("Constructeur CommandeDaoImpl");
	}

	@Override
	public Commande findCommandeById(int idCommande) {
		ResultSet resultat = null;
		PreparedStatement preparedStatement = null;

		int id_Commande;
		String ref_commande;
		Date date_commande;
		Date date_demandee;
		TypeCommande type_commande;
		MoyenContact moyen_contact;
		EtatCommande etat_commande;
		Client client;
		Utilisateur utilisateur;
		Commande commande = null;

		try {
			preparedStatement = connexion.prepareStatement(CommandeRequete.FIND_COMMANDE_BY_ID);
			preparedStatement.setInt(1, idCommande);
			resultat = preparedStatement.executeQuery();

			if (resultat != null) {
				while (resultat.next()) {
					id_Commande = resultat.getInt(1);
					ref_commande = resultat.getString(2);
					date_commande = resultat.getDate(3);
					date_demandee = resultat.getDate(4);
					type_commande = getTypeCommandeByID(resultat.getInt(5));
					moyen_contact = getMoyenContactByID(resultat.getInt(6));
					etat_commande = getEtatCommandeByID(resultat.getInt(7));
					client = getClientByID(resultat.getInt(8));
					utilisateur = getUtilisateurByID(resultat.getInt(9));
					
					commande = new Commande(id_Commande,ref_commande, date_commande, date_demandee, 
							type_commande, moyen_contact, etat_commande, client, utilisateur);
				}
			} else {
				commande = null;
			}

		} catch (SQLException e) {
			System.out.println("CommandeDaoImpl/findCommandeById - Erreur SQL : " + e.getMessage());
		} finally {
			ConnexionBDD.close(null, preparedStatement, resultat);
		}
		return commande;
	}
	
	public List<Commande> findCommandeByFilter(String filter)
	{
		ResultSet resultat = null;
		PreparedStatement preparedStatement = null;
		List<Commande> listeCommandes = new ArrayList<>();

		int id_Commande;
		String ref_commande;
		Date date_commande;
		Date date_demandee;
		TypeCommande type_commande;
		MoyenContact moyen_contact;
		EtatCommande etat_commande;
		Client client;
		Utilisateur utilisateur;
		double montant = 0;
		Commande commande = null;

		try
		{
			preparedStatement = connexion.prepareStatement(CommandeRequete.commandeFilter(filter));
			//preparedStatement.setString(1, filter);
			
			System.out.println("FILTRE : " + filter);
			System.out.println("REQUETE : " +preparedStatement);
			
			resultat = preparedStatement.executeQuery();
			
			if (resultat != null) {
				while (resultat.next()) {
					id_Commande = resultat.getInt(1);
					ref_commande = resultat.getString(2);
					date_commande = resultat.getDate(3);
					date_demandee = resultat.getDate(4);
					type_commande = getTypeCommandeByID(resultat.getInt(5));
					moyen_contact = getMoyenContactByID(resultat.getInt(6));
					etat_commande = getEtatCommandeByID(resultat.getInt(7));
					client = getClientByID(resultat.getInt(8));
					utilisateur = getUtilisateurByID(resultat.getInt(9));
					montant = resultat.getDouble(10);
					
					commande = new Commande(id_Commande,ref_commande, date_commande, date_demandee, 
							type_commande, moyen_contact, etat_commande, client, utilisateur, montant);
					listeCommandes.add(commande);
				}
			} else {
				commande = null;
			}
		}
		catch (SQLException e)
		{
			System.out.println("CommanderDaoImpl/findCommandeByFilter - Erreur SQL : " + e.getMessage());
		}
		finally
		{
			ConnexionBDD.close(preparedStatement, null, resultat);
		}

		System.out.println("/CommmandeDaoImpl, Liste des commandes : " + listeCommandes);
		return listeCommandes;
	}

	@Override
	public List<Commande> findAllCommandes() {
		
		Statement statement = null;
		ResultSet resultat = null;
		
		int id_Commande;
		String ref_commande;
		Date date_commande;
		Date date_demandee;
		TypeCommande type_commande;
		MoyenContact moyen_contact;
		EtatCommande etat_commande;
		Client client;
		Utilisateur utilisateur;
		
		Commande commande = null;
		List<Commande> listeCommandes = new ArrayList<>();

		try
		{

			statement = connexion.createStatement();
			resultat = statement.executeQuery(CommandeRequete.FIND_ALL_COMMANDES);

			if (resultat != null)
			{
				while (resultat.next())
				{
					id_Commande = resultat.getInt(1);
					ref_commande = resultat.getString(2);
					date_commande = resultat.getDate(3);
					date_demandee = resultat.getDate(4);
					type_commande = getTypeCommandeByID(resultat.getInt(5));
					moyen_contact = getMoyenContactByID(resultat.getInt(6));
					etat_commande = getEtatCommandeByID(resultat.getInt(7));
					client = getClientByID(resultat.getInt(8));
					utilisateur = getUtilisateurByID(resultat.getInt(9));

					commande = new Commande(id_Commande,ref_commande, date_commande, date_demandee, 
							type_commande, moyen_contact, etat_commande, client, utilisateur);


					listeCommandes.add(commande);
				}
			}
			else
			{
				listeCommandes = null;
			}

		}
		catch (SQLException e)
		{
			System.out.println("Erreur sql" + e.getMessage());
		}
		finally
		{
			ConnexionBDD.close(statement, null, resultat);
		}
		return listeCommandes;
	}
	
	public TypeCommande getTypeCommandeByID(int id)
	{
		TypeCommandeDao typeCommandeDaoImpl;
		TypeCommande typeCommande = null;
		try
		{
			typeCommandeDaoImpl = new TypeCommandeDaoImpl();

			typeCommande = typeCommandeDaoImpl.findTypeCommandeById(id);

		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return typeCommande;

	}
	
	public EtatCommande getEtatCommandeByID(int id)
	{
		EtatCommandeDao etatCommandeDaoImpl;
		EtatCommande etatCommande = null;
		try
		{
			etatCommandeDaoImpl = new EtatCommandeDaoImpl();

			etatCommande = etatCommandeDaoImpl.findEtatCommandeById(id);

		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return etatCommande;

	}
	
	public MoyenContact getMoyenContactByID(int id)
	{
		MoyenContactDao moyenContactDaoImpl;
		MoyenContact moyenContact = null;
		try
		{
			moyenContactDaoImpl = new MoyenContactDaoImpl();

			moyenContact = moyenContactDaoImpl.findMoyenContactById(id);

		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return moyenContact;

	}

	public Utilisateur getUtilisateurByID(int id)
	{
		UtilisateurDao utilisateurDaoImpl;
		Utilisateur utilisateur = null;

		try
		{
			utilisateurDaoImpl = new UtilisateurDaoImpl();
			utilisateur = utilisateurDaoImpl.findUtilisateurById(id);
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return utilisateur;
	}
	
	public Client getClientByID(int id)
	{
		ClientDao clientDaoImpl;
		Client client = null;

		try
		{
			clientDaoImpl = new ClientDaoImpl();
			client = clientDaoImpl.findClientById(id);
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return client;
	}

}
