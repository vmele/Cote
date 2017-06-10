package fr.cfai.sio.service;

import java.util.Date;
import java.util.List;
import fr.cfai.sio.business.Test;

/**
 * Commentaire OK
 * 
 * @author mathieu
 *
 */
public interface TestService
{
	/**
	 * Permet de r�cup�rer objet Test en fonction de son ID en redirigeant vers
	 * la dao
	 * 
	 * @param idTest
	 *            ID du test
	 * @return Objet Test
	 */
	public Test recupereTestParID(int idTest);

	/**
	 * Permet de r�cup�rer une liste de tests en redirigeant vers la dao
	 * 
	 * @return Liste de tests
	 */
	public List<Test> recupererListeTests();
	
	public List<Test> recupererListeTestsParJeu(int idJeu);

	public Test ajouterTest(String titre, Date date, int nb_Com, String avantage, String inconvenient, String description, short note, int id_Jeu,
			int id_Utilisateur);
}
