package service.impl;

import java.util.ArrayList;
import java.util.List;

import business.EtatCommande;
import dao.EtatCommandeDao;
import dao.impl.EtatCommandeDaoImpl;
import service.EtatCommandeService;

public class EtatCommandeServiceImpl implements EtatCommandeService {

	private EtatCommandeDao EtatCommandeDaoImpl;
	
	public EtatCommandeServiceImpl() throws Exception
	{
		super();
	//	System.out.println("Constructeur EtatCommandeServiceImpl");

		this.EtatCommandeDaoImpl = new EtatCommandeDaoImpl();
	}
	@Override
	public EtatCommande recupererEtatCommandeParID(int idEtatCommande)
	{
		EtatCommande EtatCommande;

		EtatCommande = EtatCommandeDaoImpl.findEtatCommandeById(idEtatCommande);

		return EtatCommande;
	}

	@Override
	public List<EtatCommande> recupererListeEtatCommandes()
	{

		List<EtatCommande> listeEtatCommandes = new ArrayList<EtatCommande>();

		listeEtatCommandes = EtatCommandeDaoImpl.findAllEtatCommandes();

		return listeEtatCommandes;
	}

}
