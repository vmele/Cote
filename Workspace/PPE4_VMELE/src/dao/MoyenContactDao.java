package dao;

import java.util.List;

import business.MoyenContact;

public interface MoyenContactDao {
	/**
	 * Permet de r�cup�rer un objet Utilisateur en fonction de son ID
	 * 
	 * @param idUtilisateur
	 *            ID de l'utilisateur
	 * @return L'objet Utilisateur
	 */
	public MoyenContact findMoyenContactById(int idMoyenContact);

	/**
	 * Permet de r�cup�rer la liste des utilisateurs
	 * 
	 * @return Liste des utilisateurs
	 */
	public List<MoyenContact> findAllMoyenContacts();
}
