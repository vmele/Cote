package service;

import java.util.List;

import business.Client;


public interface ClientService {
	
	/**
	 * Permet de récupérer objet Utilisateur en fonction de son ID en
	 * redirigeant vers la dao
	 * 
	 * @param idUtilisateur
	 *            ID de l'utilisateur
	 * @return OBjet Utilisateur
	 */
	public Client recupererClientParID(int idClient);

	/**
	 * Permet de récuperer un liste d'utilisateur en redirigeant vers la dao
	 * 
	 * @return Liste d'utilisateur
	 */
	public List<Client> recupererListeClients();

	public List<Client> recupererClientParRS(String raisonSociale);
}
