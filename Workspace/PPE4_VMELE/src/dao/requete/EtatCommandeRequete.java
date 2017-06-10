package dao.requete;

public class EtatCommandeRequete {
	public static final String ID_MAX_ETAT_COMMANDE = "SELECT MAX (id_etat) FROM etat_so";
	
	public static final String FIND_ALL_ETAT_COMMANDE = "SELECT * FROM etat_so";
	
	public static final String FIND_ETAT_COMMANDE_BY_ID = "SELECT * FROM etat_so WHERE id_etat = ? ";
}
