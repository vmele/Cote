package service;

import java.util.List;

import business.Commande;

public interface CommandeService {
	/**
	 * Permet de r�cup�rer objet Utilisateur en fonction de son ID en
	 * redirigeant vers la dao
	 * 
	 * @param idUtilisateur
	 *            ID de l'utilisateur
	 * @return OBjet Utilisateur
	 */
	public Commande recupererCommandeParID(int idCommande);

	/**
	 * Permet de r�cuperer un liste d'utilisateur en redirigeant vers la dao
	 * 
	 * @return Liste d'utilisateur
	 */
	public List<Commande> recupererListeCommandes();

	public List<Commande> recuprerListeCommandesParFiltre(String filtre);
}
