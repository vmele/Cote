package dao.requete;

public class MoyenContactRequete {
	public static final String ID_MAX_MOYEN_CONTACT = "SELECT MAX (id_contact) FROM moyen_contact_commande";
	
	public static final String FIND_ALL_MOYEN_CONTACT = "SELECT * FROM moyen_contact_commande";
	
	public static final String FIND_MOYEN_CONTACT_BY_ID = "SELECT * FROM moyen_contact_commande WHERE id_contact = ? ";
}
