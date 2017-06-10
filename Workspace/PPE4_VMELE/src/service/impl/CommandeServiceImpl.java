package service.impl;

import java.util.ArrayList;
import java.util.List;

import business.Commande;
import business.Commande;
import dao.CommandeDao;
import dao.CommandeDao;
import dao.impl.CommandeDaoImpl;
import dao.impl.CommandeDaoImpl;
import service.CommandeService;

public class CommandeServiceImpl implements CommandeService {

	private CommandeDao CommandeDaoImpl;
	
	public CommandeServiceImpl() throws Exception
	{
		super();
	//	System.out.println("Constructeur CommandeServiceImpl");

		this.CommandeDaoImpl = new CommandeDaoImpl();
	}
	@Override
	public Commande recupererCommandeParID(int idCommande)
	{
		Commande Commande;

		Commande = CommandeDaoImpl.findCommandeById(idCommande);

		return Commande;
	}

	@Override
	public List<Commande> recupererListeCommandes()
	{

		List<Commande> listeCommandes = new ArrayList<Commande>();

		listeCommandes = CommandeDaoImpl.findAllCommandes();

		return listeCommandes;
	}

	@Override
	public List<Commande> recuprerListeCommandesParFiltre(String filtre)
	{

		List<Commande> listeCommandes = new ArrayList<Commande>();

		listeCommandes = CommandeDaoImpl.findCommandeByFilter(filtre);

		return listeCommandes;
	}
}
