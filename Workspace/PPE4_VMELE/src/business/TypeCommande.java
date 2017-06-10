package business;

public class TypeCommande {
	private int idTypeCommande;
	private String libelle;
	private String libelleCourt;
	
	public TypeCommande(int idTypeCommande, String libelle, String libelleCourt) {
		super();
		this.idTypeCommande = idTypeCommande;
		this.libelle = libelle;
		this.libelleCourt = libelleCourt;
	}
	
	public int getIdTypeCommande() {
		return idTypeCommande;
	}
	public void setIdTypeCommande(int idTypeCommande) {
		this.idTypeCommande = idTypeCommande;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getLibelleCourt() {
		return libelleCourt;
	}
	public void setLibelleCourt(String libelleCourt) {
		this.libelleCourt = libelleCourt;
	}
	
	
}
