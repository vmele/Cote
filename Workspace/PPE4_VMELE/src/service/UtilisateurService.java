package service;

import java.util.List;

import business.Utilisateur;

public interface UtilisateurService {

	/**
	 * Permet de récupérer objet Utilisateur en fonction de son ID en
	 * redirigeant vers la dao
	 * 
	 * @param idUtilisateur
	 *            ID de l'utilisateur
	 * @return OBjet Utilisateur
	 */
	public Utilisateur recupererUtilisateurParID(int idUtilisateur);

	/**
	 * Permet de récuperer un liste d'utilisateur en redirigeant vers la dao
	 * 
	 * @return Liste d'utilisateur
	 */
	public List<Utilisateur> recupererListeUtilisateurs();
	
	public List<Utilisateur> recupererUtilisateursParPrenom(String prenomUtilisateur);

	public List<Utilisateur> recupererUtilisateursMontantParFiltre(String filtre);
	
}
