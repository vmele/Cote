package dao.requete;

public class TypeCommandeRequete {
	
	public static final String ID_MAX_TYPE_COMMANDE = "SELECT MAX (id_type) FROM type_commande";

	public static final String FIND_ALL_TYPE_COMMANDE = "SELECT * FROM type_commande";
	
	public static final String FIND_TYPE_COMMANDE_BY_ID = "SELECT * FROM type_commande WHERE id_type = ? ";

}
