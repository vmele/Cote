package fr.cfai.sio.service;

import java.util.List;
import fr.cfai.sio.business.Classification;

/**
 * Commentaire OK
 * 
 * @author mathieu
 *
 */
public interface ClassificationService
{
	/**
	 * Permet de r�cup�rer la liste des classifications en redirigeant vers la
	 * dao
	 * 
	 * @return Liste des classifications
	 */
	public List<Classification> recupererListeClassifications();
}
