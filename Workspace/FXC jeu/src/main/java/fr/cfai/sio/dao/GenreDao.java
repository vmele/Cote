package fr.cfai.sio.dao;

import java.util.List;
import fr.cfai.sio.business.Genre;

/**
 * Commentaire OK
 * 
 * @author mathieu
 *
 */
public interface GenreDao
{
	/**
	 * Permet de r�cup�rer un Objet Genre en fonction de son ID
	 * 
	 * @param idGenre
	 *            ID du genre
	 * @return L'Objet Genre
	 */
	public Genre findGenreById(int idGenre);

	/**
	 * Permet de r�cup�rer la liste des genres
	 * 
	 * @return Liste des genres
	 */
	public List<Genre> findAllGenres();
}
