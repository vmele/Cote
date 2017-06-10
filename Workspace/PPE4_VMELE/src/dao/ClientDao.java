package dao;

import java.util.List;

import business.Client;

public interface ClientDao {
	
	/**
	 * Permet de r�cup�rer un objet Utilisateur en fonction de son ID
	 * 
	 * @param idUtilisateur
	 *            ID de l'utilisateur
	 * @return L'objet Utilisateur
	 */
	public Client findClientById(int idClient);

	/**
	 * Permet de r�cup�rer la liste des utilisateurs
	 * 
	 * @return Liste des utilisateurs
	 */
	public List<Client> findAllClients();

	public List<Client> findClientByRS(String raisonSociale);
}
