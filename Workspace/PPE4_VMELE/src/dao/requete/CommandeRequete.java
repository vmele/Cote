package dao.requete;

public class CommandeRequete {
	
	public static final String ID_MAX_COMMANDE = "SELECT MAX (id_commande) FROM commande";

	public static final String FIND_ALL_COMMANDES = "SELECT * FROM commande";
	
	public static final String FIND_COMMANDE_BY_ID = "SELECT * FROM commande WHERE id_commande = ? ";
	
	
	
	public static final String BEGIN_FIND_COMMANDE_BY_FILTER = 
			" SELECT cde.id_commande, cde.reference_commande, date_commande, date_demandee, id_type, id_contact, cde.id_etat, id_client, id_personne, sum(quantite*prix_cdt*(1 + taux / 100.00)) as total" +
			" FROM commande as cde, ligne_de_commande as ligne, produit as p, tva" +
			" WHERE cde.id_commande = ligne.id_commande " +
			" and ligne.id_produit = p.id_produit " +
			" and ligne.id_tva = tva.id_tva ";
	
	public static final String END_FIND_COMMANDE_BY_FILTER = 
			" group by cde.id_commande, cde.reference_commande, date_commande, date_demandee, id_type, id_contact, cde.id_etat, id_client, id_personne" +
			" order by cde.id_commande, cde.reference_commande, date_commande, date_demandee, id_type, id_contact, cde.id_etat, id_client, id_personne ";
	
	public static String commandeFilter(String filter){
		
		String query = BEGIN_FIND_COMMANDE_BY_FILTER + filter + END_FIND_COMMANDE_BY_FILTER;
		
		return query;
	}
	
	
	
	
//	SELECT cde.id_commande, cde.reference_commande, date_commande, date_demandee, id_type, id_contact, cde.id_etat, id_client, id_personne, sum(quantite*prix_cdt*(1 + taux / 100.00)) as total 
//	FROM commande as cde, ligne_de_commande as ligne, produit as p, tva 
//	WHERE cde.id_commande = ligne.id_commande 
//	and ligne.id_produit = p.id_produit 
//	and ligne.id_tva = tva.id_tva
//	group by cde.id_commande, cde.reference_commande, date_commande, date_demandee, id_type, id_contact, cde.id_etat, id_client, id_personne
//	order by cde.id_commande, cde.reference_commande, date_commande, date_demandee, id_type, id_contact, cde.id_etat, id_client, id_personne

}
