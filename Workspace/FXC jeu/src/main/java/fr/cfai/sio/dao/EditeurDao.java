package fr.cfai.sio.dao;

import java.util.List;
import fr.cfai.sio.business.Editeur;

/**
 * Commentaire OK
 * 
 * @author mathieu
 *
 */
public interface EditeurDao
{
	/**
	 * Permet de r�cup�rer un objet Editeur en fonction de son ID
	 * 
	 * @param idEditeur
	 *            ID de l'editeur
	 * @return L'objet Editeur
	 */
	public Editeur findEditeurById(int idEditeur);

	/**
	 * Permet de r�cup�rer la liste des �diteurs
	 * 
	 * @return Liste des �diteurs
	 */
	public List<Editeur> findAllEditeurs();
}
