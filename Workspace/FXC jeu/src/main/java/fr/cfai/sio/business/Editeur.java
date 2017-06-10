package fr.cfai.sio.business;

import java.util.List;

/**
 * Commentaire OK
 * 
 * @author mathieu
 *
 */
public class Editeur
{
	/**
	 * D�claration des variables d'Editeur
	 */
	private int idEditeur;
	private String raisonSociale;
	private List<Jeu> listeJeux;

	/**
	 * Constructeur d'Editeur
	 * 
	 * @param idEditeur
	 *            ID de l'�diteur
	 * @param raisonSociale
	 *            Raison Sociale de l'�diteur
	 */
	public Editeur(int idEditeur, String raisonSociale)
	{
		super();
		this.idEditeur = idEditeur;
		this.raisonSociale = raisonSociale;
	}

	/**
	 * Getteur ID de l'�diteur
	 * 
	 * @return ID de l'�diteur
	 */
	public int getIdEditeur()
	{
		return idEditeur;
	}

	/**
	 * Setteur ID de l'�diteur
	 * 
	 * @param idEditeur
	 *            ID de l'�diteur
	 */
	public void setIdEditeur(int idEditeur)
	{
		this.idEditeur = idEditeur;
	}

	/**
	 * Getteur Raison Sociale de l'�diteur
	 * 
	 * @return Raison Sociale de l'�diteur
	 */
	public String getRaisonSociale()
	{
		return raisonSociale;
	}

	/**
	 * Setteur Raison Sociale de l'�diteur
	 * 
	 * @param raisonSociale
	 *            Raison Sociale de l'�diteur
	 */
	public void setRaisonSociale(String raisonSociale)
	{
		this.raisonSociale = raisonSociale;
	}

	/**
	 * Getteur Liste de jeu de l'�diteur
	 * 
	 * @return Liste de jeu de l'�diteur
	 */
	public List<Jeu> getListeJeux()
	{
		return listeJeux;
	}

	/**
	 * Setteur Liste de jeu de l'�diteur
	 * 
	 * @param listeJeux
	 *            Liste de jeu de l'�diteur
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
