package business;

public class EtatCommande {
	private int idEtat;
	private String libelle;
	
	public EtatCommande(int idEtat, String libelle) {
		super();
		this.idEtat = idEtat;
		this.libelle = libelle;
	}
	
	public int getIdEtat() {
		return idEtat;
	}
	public void setIdEtat(int idEtat) {
		this.idEtat = idEtat;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
}
