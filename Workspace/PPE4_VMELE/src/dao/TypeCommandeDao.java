package dao;
import java.util.List;

import business.TypeCommande;

public interface TypeCommandeDao {

	/**
	 * Permet de récupérer un objet Utilisateur en fonction de son ID
	 * 
	 * @param idUtilisateur
	 *            ID de l'utilisateur
	 * @return L'objet Utilisateur
	 */
	public TypeCommande findTypeCommandeById(int idTypeCommande);

	/**
	 * Permet de récupérer la liste des utilisateurs
	 * 
	 * @return Liste des utilisateurs
	 */
	public List<TypeCommande> findAllTypeCommandes();
}
