package dao;

import java.util.List;

import business.EtatCommande;

public interface EtatCommandeDao {
	/**
	 * Permet de récupérer un objet Utilisateur en fonction de son ID
	 * 
	 * @param idUtilisateur
	 *            ID de l'utilisateur
	 * @return L'objet Utilisateur
	 */
	public EtatCommande findEtatCommandeById(int idEtatCommande);

	/**
	 * Permet de récupérer la liste des utilisateurs
	 * 
	 * @return Liste des utilisateurs
	 */
	public List<EtatCommande> findAllEtatCommandes();
}
