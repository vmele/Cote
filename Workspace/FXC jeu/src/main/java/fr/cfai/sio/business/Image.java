package fr.cfai.sio.business;

/**
 * Commentaire OK
 * 
 * @author mathieu
 *
 */
public class Image
{
	/**
	 * D�claration des variables d'Image
	 */
	private int idImage;
	private String cheminImage;
	private String titreImage;
	private Test test;

	/**
	 * Constructeur d'Image
	 * 
	 * @param idImage
	 *            ID de l'image
	 * @param cheminImage
	 *            Chemin de l'image
	 * @param descriptionImage
	 *            Description de l'image de l'image
	 * @param titreImage
	 *            Titre de l'image
	 * @param test
	 *            Test de l'image
	 * @param utilisateur
	 *            Utilisteur de l'image
	 */
	public Image(int idImage, String cheminImage, String titreImage, Test test)
	{
		super();
		this.idImage = idImage;
		this.cheminImage = cheminImage;
		this.titreImage = titreImage;
		this.test = test;
	}

	/**
	 * Getteur ID de l'image
	 * 
	 * @return ID de l'image
	 */
	public int getIdImage()
	{
		return idImage;
	}

	/**
	 * Setteur ID de l'image
	 * 
	 * @param idImage
	 *            ID de l'image
	 */
	public void setIdImage(int idImage)
	{
		this.idImage = idImage;
	}

	/**
	 * Getteur Chemin de l'image
	 * 
	 * @return Chemin de l'image
	 */
	public String getCheminImage()
	{
		return cheminImage;
	}

	/**
	 * Setteur Chemin de l'image
	 * 
	 * @param cheminImage
	 *            Chemin de l'image
	 */
	public void setCheminImage(String cheminImage)
	{
		this.cheminImage = cheminImage;
	}

	/**
	 * Getteur Titre de l'image
	 * 
	 * @return Titre de l'image
	 */
	public String getTitreImage()
	{
		return titreImage;
	}

	/**
	 * Setteur Titre de l'image
	 * 
	 * @param titreImage
	 *            Titre de l'image
	 */
	public void setTitreImage(String titreImage)
	{
		this.titreImage = titreImage;
	}

	/**
	 * Getteur Test de l'image
	 * 
	 * @return Test de l'image
	 */
	public Test getTest()
	{
		return test;
	}

	/**
	 * Setteur Test de l'image
	 * 
	 * @param test
	 *            Test de l'image
	 */
	public void setTest(Test test)
	{
		this.test = test;
	}
}
