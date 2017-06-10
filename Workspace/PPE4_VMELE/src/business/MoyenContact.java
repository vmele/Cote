package business;

public class MoyenContact {
	private int idMoyenContact;
	private String libelle;
	
	public MoyenContact(int idMoyenContact, String libelle) {
		super();
		this.idMoyenContact = idMoyenContact;
		this.libelle = libelle;
	}
	
	public int getIdMoyenContact() {
		return idMoyenContact;
	}
	public void setIdMoyenContact(int idMoyenContact) {
		this.idMoyenContact = idMoyenContact;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
}
