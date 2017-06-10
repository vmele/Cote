package service;

import java.util.List;

import business.EtatCommande;

public interface EtatCommandeService {
	/**
	 * Permet de récupérer objet Utilisateur en fonction de son ID en
	 * redirigeant vers la dao
	 * 
	 * @param idUtilisateur
	 *            ID de l'utilisateur
	 * @return OBjet Utilisateur
	 */
	public EtatCommande recupererEtatCommandeParID(int idEtatCommande);

	/**
	 * Permet de récuperer un liste d'utilisateur en redirigeant vers la dao
	 * 
	 * @return Liste d'utilisateur
	 */
	public List<EtatCommande> recupererListeEtatCommandes();
}
