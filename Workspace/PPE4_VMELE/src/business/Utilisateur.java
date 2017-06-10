package business;

public class Utilisateur extends Personne {


	// Classe utilisateur
	private String identifiant;
	private String motDePasse;
	private String mail;
	private double montant;

	private int idDroit;
	
	public Utilisateur(String identifiant, String motDePasse, 
			String mail, int idDroit, int idPersonne, String nom,
			String prenom){
	super(idPersonne, nom, prenom);
	this.identifiant = identifiant;
	this.motDePasse = motDePasse;
	this.mail = mail;
	this.idDroit = idDroit;
	}



	public Utilisateur(String identifiant2, String motDePasse2, String mail2, int idDroit2, int idPersonne, String nom,
			String prenom, double montant) {
		super(idPersonne, nom, prenom);
		this.identifiant = identifiant2;
		this.motDePasse = motDePasse2;
		this.mail = mail2;
		this.idDroit = idDroit2;
		this.montant = montant;
	}



	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getIdDroit() {
		return idDroit;
	}

	public void setIdDroit(int idDroit) {
		this.idDroit = idDroit;
	}

	@Override
	public String toString() {
		return "Utilisateur [nom=" + super.getNom() + ", prenom=" + super.getPrenom() + ", identifiant=" + identifiant + "]";
	}
	
	
}
