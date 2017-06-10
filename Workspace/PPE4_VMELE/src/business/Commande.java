package business;

import java.util.Date;

public class Commande {
	private int idCommande;
	private String refCommande;
	private Date dateCommande;
	private Date dateDemandee;
	private TypeCommande type;
	private MoyenContact moyenContact;
	private EtatCommande etatCommande;
	private Client client;
	private Utilisateur utilisateur;
	private double montant;
	
	public Commande(int idCommande, String refCommande, Date dateCommande, Date dateDemandee, TypeCommande type,
			MoyenContact moyenContact, EtatCommande etatCommande, Client client, Utilisateur utilisateur) {
		super();
		this.idCommande = idCommande;
		this.refCommande = refCommande;
		this.dateCommande = dateCommande;
		this.dateDemandee = dateDemandee;
		this.type = type;
		this.moyenContact = moyenContact;
		this.etatCommande = etatCommande;
		this.client = client;
		this.utilisateur = utilisateur;
	}
	
	public Commande(int idCommande, String refCommande, Date dateCommande, Date dateDemandee, TypeCommande type,
			MoyenContact moyenContact, EtatCommande etatCommande, Client client, Utilisateur utilisateur, double montant) {
		super();
		this.idCommande = idCommande;
		this.refCommande = refCommande;
		this.dateCommande = dateCommande;
		this.dateDemandee = dateDemandee;
		this.type = type;
		this.moyenContact = moyenContact;
		this.etatCommande = etatCommande;
		this.client = client;
		this.utilisateur = utilisateur;
		this.montant = montant;
	}

	public int getIdCommande() {
		return idCommande;
	}
	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}
	public String getRefCommande() {
		return refCommande;
	}
	public void setRefCommande(String refCommande) {
		this.refCommande = refCommande;
	}
	public Date getDateCommande() {
		return dateCommande;
	}
	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}
	public Date getDateDemandee() {
		return dateDemandee;
	}
	public void setDateDemandee(Date dateDemandee) {
		this.dateDemandee = dateDemandee;
	}

	public TypeCommande getType() {
		return type;
	}

	public void setType(TypeCommande type) {
		this.type = type;
	}

	public MoyenContact getMoyenContact() {
		return moyenContact;
	}

	public void setMoyenContact(MoyenContact moyenContact) {
		this.moyenContact = moyenContact;
	}

	public EtatCommande getEtatCommande() {
		return etatCommande;
	}

	public void setEtatCommande(EtatCommande etatCommande) {
		this.etatCommande = etatCommande;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	
	
}
