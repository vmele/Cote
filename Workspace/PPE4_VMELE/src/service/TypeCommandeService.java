package service;

import java.util.List;

import business.TypeCommande;

public interface TypeCommandeService {
	/**
	 * Permet de récupérer objet Utilisateur en fonction de son ID en
	 * redirigeant vers la dao
	 * 
	 * @param idUtilisateur
	 *            ID de l'utilisateur
	 * @return OBjet Utilisateur
	 */
	public TypeCommande recupererTypeCommandeParID(int idTypeCommande);

	/**
	 * Permet de récuperer un liste d'utilisateur en redirigeant vers la dao
	 * 
	 * @return Liste d'utilisateur
	 */
	public List<TypeCommande> recupererListeTypeCommandes();
}
