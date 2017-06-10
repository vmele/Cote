package fr.cfai.sio.business;

import java.util.List;

/**
 * Commentaire OK
 * 
 * @author Mathieu
 *
 */
public class Classification
{

	/**
	 * D�claration des variables Classification
	 */
	private int idClassification;
	private String libelleClassification;
	private List<Jeu> listeJeux;

	/**
	 * Conctructeur de Classification
	 * 
	 * @param idClassification
	 *            ID de la classification
	 * @param libelleClassification
	 *            Libell� de la classification
	 */
	public Classification(int id_classification, String libelle_classification)
	{
		this.idClassification = id_classification;
		this.libelleClassification = libelle_classification;
	}

	/**
	 * Getteur ID de la classification
	 * 
	 * @return ID de la classification
	 */
	public int getIdClassification()
	{
		return idClassification;
	}

	/**
	 * Setteur ID de la classification
	 * 
	 * @param idClassification
	 *            ID de la classification
	 */
	public void setIdClassification(int idClassification)
	{
		this.idClassification = idClassification;
	}

	/**
	 * Getteur libell� de la classification
	 * 
	 * @return libell� de la classification
	 */
	public String getLibelleClassification()
	{
		return libelleClassification;
	}

	/**
	 * Setteur libell� de la classification
	 * 
	 * @param libelleClassification
	 *            libell� de la classification
	 */
	public void setLibelleClassification(String libelleClassification)
	{
		this.libelleClassification = libelleClassification;
	}

	/**
	 * Getteur de la liste de jeu de la classification
	 * 
	 * @return de la liste de jeu de la classification
	 */
	public List<Jeu> getListeJeux()
	{
		return listeJeux;
	}

	/**
	 * Setteur de la liste de jeu de la classification
	 * 
	 * @param listeJeux
	 *            liste de jeu de la classification
	 */
	public void setListeJeux(List<Jeu> listeJeux)
	{
		this.listeJeux = listeJeux;
	}

	/**
	 * Permet d'ajouter un objet Jeu � la liste de jeu
	 * 
	 * @param jeu
	 *            un objet Jeu
	 */
	public void addJeu(Jeu jeu)
	{
		this.listeJeux.add(jeu);
	}
}
