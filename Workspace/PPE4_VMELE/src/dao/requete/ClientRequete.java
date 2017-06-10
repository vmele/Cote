package dao.requete;

public class ClientRequete {
	public static final String ID_MAX_CLIENT = 
			"SELECT MAX (id_client) FROM client";

	public static final String FIND_ALL_CLIENTS = 
			"SELECT * FROM client ORDER BY raison_sociale";
	
	public static final String FIND_CLIENT_BY_ID = 
			"SELECT * FROM client WHERE id_client = ? ";
	
	public static final String FIND_CLIENT_BY_RS = 
			"SELECT id_client, raison_sociale FROM client WHERE raison_sociale ilike ?";

}
