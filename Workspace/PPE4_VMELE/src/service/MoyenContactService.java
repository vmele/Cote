package service;

import java.util.List;

import business.MoyenContact;

public interface MoyenContactService {
	/**
	 * Permet de r�cup�rer objet Utilisateur en fonction de son ID en
	 * redirigeant vers la dao
	 * 
	 * @param idUtilisateur
	 *            ID de l'utilisateur
	 * @return OBjet Utilisateur
	 */
	public MoyenContact recupererMoyenContactParID(int idMoyenContact);

	/**
	 * Permet de r�cuperer un liste d'utilisateur en redirigeant vers la dao
	 * 
	 * @return Liste d'utilisateur
	 */
	public List<MoyenContact> recupererListeMoyenContacts();
}
