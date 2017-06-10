package fr.cfai.sio.dao;

import java.util.Date;
import java.util.List;
import fr.cfai.sio.business.Test;

/**
 * Commentaire OK
 * 
 * @author mathieu
 *
 */
public interface TestDao
{
	/**
	 * Permet de r�cup�rer un Objet Test en fonction de son ID
	 * 
	 * @param idTest
	 *            ID du test
	 * @return L'objet Test
	 */
	public Test findTestById(int idTest);

	/**
	 * Permet de r�cup�rer la liste des tests
	 * 
	 * @return Liste des tests
	 */
	public List<Test> findAllTest();
	
	public List<Test> findAllTestByJeu(int idJeu);

	/**
	 * Permet d'ajouter un objet Test en BDD
	 * 
	 * @return l'objet Test ajout�
	 */
	public Test addTest(String titre, Date date, int nb_Com, String avantage, String inconvenient, String description, short note, int id_Jeu,
			int id_Utilisateur);
}
