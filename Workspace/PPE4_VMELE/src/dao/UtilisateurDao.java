package dao;

import java.util.List;

import business.Utilisateur;

public interface UtilisateurDao {

	/**
	 * Permet de r�cup�rer un objet Utilisateur en fonction de son ID
	 * 
	 * @param idUtilisateur
	 *            ID de l'utilisateur
	 * @return L'objet Utilisateur
	 */
	public Utilisateur findUtilisateurById(int idUtilisateur);

	/**
	 * Permet de r�cup�rer la liste des utilisateurs
	 * 
	 * @return Liste des utilisateurs
	 */
	public List<Utilisateur> findAllUtilisateurs();


	public List<Utilisateur> findUtilisateursByName(String prenomUtilisateur);
	
	public List<Utilisateur> findUtilisateurByFilter(String filter);

}
