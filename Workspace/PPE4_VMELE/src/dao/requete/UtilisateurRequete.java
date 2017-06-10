package dao.requete;

public class UtilisateurRequete
{


	public static final String ID_MAX_UTILISATEUR = " SELECT MAX (id_personne) FROM utilisateur";

	public static final String FIND_ALL_UTILISATEURS = "SELECT u.id_personne, u.identifiant, "
			+ " u.mot_de_passe, u.mail, u.id_droit, p.nom, p.prenom from utilisateur as u,"
			+ " personne as p WHERE u.id_personne = p.id_personne ORDER BY p.nom";
	
	public static final String FIND_UTILISATEUR_BY_ID = "SELECT u.id_personne, u.identifiant, "
			+ " u.mot_de_passe, u.mail, u.id_droit, p.nom, p.prenom from utilisateur as u, personne as p "
			+ " WHERE u.id_personne = p.id_personne AND u.id_personne = ? ";
	
	public static final String FIND_UTILISATEUR_BY_NAME = "SELECT u.id_personne, u.identifiant, "
			+ " u.mot_de_passe, u.mail, u.id_droit, p.nom, p.prenom from utilisateur as u, personne as p"
			+ " WHERE u.id_personne = p.id_personne AND (p.prenom ilike ? or p.nom ilike ?)";
	
	
	public static final String BEGIN_FIND_UTILISATEUR_TOTAL_BY_FILTER = 
			" SELECT id_personne, sum(quantite*prix_cdt*(1 + taux / 100.00)) as total " +
			" FROM commande as cde, ligne_de_commande as ligne, produit as p, tva" +
			" WHERE cde.id_commande = ligne.id_commande" +
			" and ligne.id_produit = p.id_produit" +
			" and ligne.id_tva = tva.id_tva ";
	public static final String END_FIND_UTILISATEUR_TOTAL_BY_FILTER = 
			" group by id_personne" +
			" order by id_personne ";
	public static String utilisateurFilterTotal(String filter){
		
		String query = BEGIN_FIND_UTILISATEUR_TOTAL_BY_FILTER + filter + END_FIND_UTILISATEUR_TOTAL_BY_FILTER;
		
		return query;
	}


}
