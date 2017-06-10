package fr.cfai.sio.service;

import java.util.List;
import fr.cfai.sio.business.Genre;

/**
 * Commentaire OK
 * 
 * @author mathieu
 *
 */
public interface GenreService
{
	/**
	 * Permet de r�cup�rer objet Genre en fonction de son ID en redirigeant vers
	 * la dao
	 * 
	 * @param idGenre
	 *            ID du genre
	 * @return Objet Genre
	 */
	public Genre recupererGenreParID(int idGenre);

	/**
	 * Permet de r�cup�rer la liste des genres redirigeant vers la dao
	 * 
	 * @return
	 */
	public List<Genre> recupererListeGenres();
}
