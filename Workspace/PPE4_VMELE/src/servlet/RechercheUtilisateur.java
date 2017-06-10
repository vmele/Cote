package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import business.Client;
import business.Utilisateur;
import service.UtilisateurService;
import service.impl.UtilisateurServiceImpl;

/**
 * Servlet implementation class RechercheUtilisateur
 */
public class RechercheUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UtilisateurService utilisateurServiceImpl;
	List<Utilisateur> listeUtilisateurs = new ArrayList<>();

	public RechercheUtilisateur() throws Exception {
		utilisateurServiceImpl = new UtilisateurServiceImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Passe par le DoPost /RechercheUtilisateurServet");

		response.setContentType("application/json");
		
		try {
			
			List<Utilisateur> listeUtilisateurs = utilisateurServiceImpl.recupererListeUtilisateurs();
			String json = new Gson().toJson(listeUtilisateurs);
			response.getWriter().write(json);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

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



//System.out.println("Passe par le DoPost /RechercheClientServet");
//
//response.setContentType("application/json");
//
//try {
//	String raisonSociale = request.getParameter("client");
//
//	List<Client> listeClients = clientServiceImpl.recupererClientParRS(raisonSociale);
//
//	String json = new Gson().toJson(listeClients);
//	response.getWriter().write(json);
//	
//} catch (Exception e) {
//	System.err.println(e.getMessage());
//}