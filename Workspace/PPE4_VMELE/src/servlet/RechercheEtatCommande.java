package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import business.EtatCommande;
import service.impl.EtatCommandeServiceImpl;

/**
 * Servlet implementation class RechercheEtatCommande
 */
public class RechercheEtatCommande extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private EtatCommandeServiceImpl etatCommandeServiceImpl;
	List<EtatCommande> listeEtatCommandes = new ArrayList<>();
	
    /**
     * @throws Exception 
     * @see HttpServlet#HttpServlet()
     */
    public RechercheEtatCommande() throws Exception {
    	etatCommandeServiceImpl = new EtatCommandeServiceImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Passe par le DoGet /RechercheEtatCommandeServet");

		response.setContentType("application/json");
		
		try {
			
			List<EtatCommande> listeEtatsCommande = etatCommandeServiceImpl.recupererListeEtatCommandes();
			System.out.println("Liste des Etat" + listeEtatsCommande);
			
			String json = new Gson().toJson(listeEtatsCommande);
			response.getWriter().write(json);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
