package fr.pfit.sio.slam2ville.business;

// impl�mentation pour la comparaison de villes.
public class Ville implements Comparable<Ville>{

	private int id;
	private String codePostal;
	private String nom;
	
	// Variable commune � tous les objets.
	private static int currentId = 0;
	
	public Ville(String codePostal, String nom){
		super();
		this.codePostal = codePostal;
		this.nom = nom;
		this.id = ++currentId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static int getCurrentId() {
		return currentId;
	}
	public static void setCurrentId(int currentId) {
		Ville.currentId = currentId;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	//Permet de comparer deux villes et les tri par ordre alphab�tique
	@Override
	public int compareTo(Ville autreVille) {
		return this.getNom().compareTo(autreVille.getNom());
	}

	
	
}
