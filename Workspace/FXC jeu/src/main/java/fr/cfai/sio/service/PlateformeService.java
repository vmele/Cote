package fr.cfai.sio.service;

import java.util.List;
import fr.cfai.sio.business.Plateforme;

public interface PlateformeService
{
	/**
	 * Permet de r�cup�rer objet Plateforme en fonction de son ID en redirigeant
	 * vers la dao
	 * 
	 * @param idPlateforme
	 *            ID du Plateforme
	 * @return Objet Plateforme
	 */
	public Plateforme recupererPlateformeParId(int idPlateforme);

	/**
	 * Permet de r�cup�rer une liste des Plateformes en redirigeant vers la dao
	 * 
	 * @return Liste des Plateformes
	 */
	public List<Plateforme> recupererListePlateformes();

	/**
	 * Pertmet de r�cup�rer une liste des Plateforme en fonction de l'id d'un
	 * jeu
	 * 
	 * @param idJeu
	 *            ID du jeu
	 * @return Liste des Plateformes du jeu
	 */
	public List<Plateforme> recupererListePlateformesParJeu(int idJeu);
}
