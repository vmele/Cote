package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import business.Commande;
import business.Utilisateur;
import service.UtilisateurService;
import service.impl.UtilisateurServiceImpl;

/**
 * Servlet implementation class RechercheChart
 */
public class RechercheChart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	private UtilisateurService utilisateurServiceImpl;
	List<Utilisateur> listeUtilisateurs = new ArrayList<>();
	
    /**
     * @throws Exception 
     * @see HttpServlet#HttpServlet()
     */
    public RechercheChart() throws Exception {
    	utilisateurServiceImpl = new UtilisateurServiceImpl();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("application/json");

		String conditionsRequete = "";
		String idUtilisateur = request.getParameter("utilisateur");
		String idClient = request.getParameter("client");
		String idEtatCommande = request.getParameter("etat");

		String dateDebutString = request.getParameter("debut");
		String dateFinString = request.getParameter("fin");

		System.out.println("U :" + idUtilisateur + ". C : " + idClient + ". Etat : " + idEtatCommande
				+ ". Date Début : " + dateDebutString + ". Date fin : " + dateFinString);
 
		if (dateDebutString != "") {
			conditionsRequete += " AND date_commande > '" + dateDebutString + "'";
		}
		if (dateFinString != "") {
			conditionsRequete += " AND date_commande < '" + dateFinString + "'";
		}
		if (Integer.parseInt(idEtatCommande) != 0) {
			conditionsRequete += " AND cde.id_etat = " + idEtatCommande;
		}
		if (Integer.parseInt(idClient) != 0) {
			conditionsRequete += " AND cde.id_client = " + idClient;
		}
		if (Integer.parseInt(idUtilisateur) != 0) {
			conditionsRequete += " AND cde.id_personne = " + idUtilisateur;
		}

		List<Utilisateur> listeUtilisateurs = utilisateurServiceImpl.recupererUtilisateursMontantParFiltre(conditionsRequete);

		String json = new Gson().toJson(listeUtilisateurs);
		System.out.println("LISTE DES MONTANTS : " + json);
		response.getWriter().write(json);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
