package fr.cfai.sio.business;

import java.util.List;

/**
 * Commentaire OK
 * 
 * @author mathieu
 *
 */
public class ModeleEconomique
{
	/**
	 * D�claration des variables de ModeleEconomique
	 * 
	 */
	private int idModeleEco;
	private String libelleModeleEco;
	private List<Jeu> listeJeux;

	/**
	 * Constructeur de ModeleEconomique
	 * 
	 * @param idModeleEco
	 *            ID du mod�le �conomique
	 * @param libelleModeleEco
	 *            Libell� du mod�le �conomique
	 */
	public ModeleEconomique(int idModeleEco, String libelleModeleEco)
	{
		super();
		this.idModeleEco = idModeleEco;
		this.libelleModeleEco = libelleModeleEco;
	}

	/**
	 * Getteur ID du mod�le �conomique
	 * 
	 * @return ID du mod�le �conomique
	 */
	public int getIdModeleEco()
	{
		return idModeleEco;
	}

	/**
	 * Setteur ID du mod�le �conomique
	 * 
	 * @param idModeleEco
	 *            ID du mod�le �conomique
	 */
	public void setIdModeleEco(int idModeleEco)
	{
		this.idModeleEco = idModeleEco;
	}

	/**
	 * Getteur Libelle du mod�le �conomique
	 * 
	 * @return Libelle du mod�le �conomique
	 */
	public String getLibelleModeleEco()
	{
		return libelleModeleEco;
	}

	/**
	 * Setteur Libelle du mod�le �conomique
	 * 
	 * @param libelleModeleEco
	 *            Libelle du mod�le �conomique
	 */
	public void setLibelleModeleEco(String libelleModeleEco)
	{
		this.libelleModeleEco = libelleModeleEco;
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
