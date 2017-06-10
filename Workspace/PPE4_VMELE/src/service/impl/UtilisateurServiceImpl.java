package service.impl;

import java.util.ArrayList;
import java.util.List;

import business.Utilisateur;
import dao.UtilisateurDao;
import dao.impl.UtilisateurDaoImpl;
import service.UtilisateurService;

public class UtilisateurServiceImpl implements UtilisateurService {

	private UtilisateurDao utilisateurDaoImpl;
	
	public UtilisateurServiceImpl() throws Exception
	{
		super();
	//	System.out.println("Constructeur UtilisateurServiceImpl");

		this.utilisateurDaoImpl = new UtilisateurDaoImpl();
	}
	
	@Override
	public Utilisateur recupererUtilisateurParID(int idUtilisateur)
	{
		Utilisateur utilisateur;

		utilisateur = utilisateurDaoImpl.findUtilisateurById(idUtilisateur);

		return utilisateur;
	}

	@Override
	public List<Utilisateur> recupererListeUtilisateurs()
	{

		List<Utilisateur> listeUtilisateurs = new ArrayList<Utilisateur>();

		listeUtilisateurs = utilisateurDaoImpl.findAllUtilisateurs();
		
		return listeUtilisateurs;
	}
	
	@Override
	public List<Utilisateur> recupererUtilisateursParPrenom(String prenomUtilisateur)
	{

		List<Utilisateur> listeUtilisateurs = new ArrayList<Utilisateur>();

		listeUtilisateurs = utilisateurDaoImpl.findUtilisateursByName(prenomUtilisateur);
		
		return listeUtilisateurs;
	}
	
	@Override
	public List<Utilisateur> recupererUtilisateursMontantParFiltre(String filtre)
	{

		List<Utilisateur> listeUtilisateurs = new ArrayList<Utilisateur>();

		listeUtilisateurs = utilisateurDaoImpl.findUtilisateurByFilter(filtre);
		
		return listeUtilisateurs;
	}
}
