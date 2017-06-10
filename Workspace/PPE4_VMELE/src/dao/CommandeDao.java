package dao;

import java.util.List;
import business.Commande;
import business.Utilisateur;

public interface CommandeDao {

	/**
	 * Permet de r�cup�rer un objet Utilisateur en fonction de son ID
	 * 
	 * @param idUtilisateur
	 *            ID de l'utilisateur
	 * @return L'objet Utilisateur
	 */
	public Commande findCommandeById(int idCommande);

	/**
	 * Permet de r�cup�rer la liste des utilisateurs
	 * 
	 * @return Liste des utilisateurs
	 */
	public List<Commande> findAllCommandes();

	/**
	 * Permet de r�cup�rer la liste des commandes selon des filtres de recherche.
	 * @param filter
	 * @return
	 */
	public List<Commande> findCommandeByFilter(String filter);
}
