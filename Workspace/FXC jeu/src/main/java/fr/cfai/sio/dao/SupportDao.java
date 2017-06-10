package fr.cfai.sio.dao;

import java.util.List;
import fr.cfai.sio.business.Support;

/**
 * Commentaire OK
 * 
 * @author mathieu
 *
 */
public interface SupportDao
{
	/**
	 * Permet de r�cup�rer un support en fonction de son ID
	 * 
	 * @param idSupport
	 *            ID du support
	 * @return L'objet Support
	 */
	public Support findSupportById(int idSupport);

	/**
	 * Permet de r�cup�rer la liste des supports
	 * 
	 * @return
	 */
	public List<Support> findAllSupports();

	/**
	 * Permet de r�cup�rer la liste des supports en fonction d'un jeu
	 * 
	 * @param idJeu
	 *            ID du jeu
	 * @return La liste des supports du jeu
	 */
	public List<Support> findAllSupportsByJeu(int idJeu);
}
