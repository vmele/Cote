package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import business.Client;
import business.Commande;
import service.CommandeService;
import service.impl.CommandeServiceImpl;

/**
 * Servlet implementation class RechercheListe
 */
public class RechercheListe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private CommandeService commandeServiceImpl;
	List<Commande> listeCommandes = new ArrayList<>();

	/**
	 * @throws Exception
	 * @see HttpServlet#HttpServlet()
	 */
	public RechercheListe() throws Exception {
		commandeServiceImpl = new CommandeServiceImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

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

		List<Commande> listeCommandes = commandeServiceImpl.recuprerListeCommandesParFiltre(conditionsRequete);

		String json = new Gson().toJson(listeCommandes);
		System.out.println("LISTE DES COMMANDES : " + json);
		response.getWriter().write(json);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}

}
