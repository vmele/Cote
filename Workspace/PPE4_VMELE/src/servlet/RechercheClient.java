package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import business.Client;
import service.ClientService;
import service.impl.ClientServiceImpl;

/**
 * Servlet implementation class RechercheClient
 */
public class RechercheClient extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ClientService clientServiceImpl;
	List<Client> listeClients = new ArrayList<>();

	/**
	 * @throws Exception
	 * @see HttpServlet#HttpServlet()
	 */
	public RechercheClient() throws Exception {
		clientServiceImpl = new ClientServiceImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Passe par le DoPost /RechercheClientServet");

		response.setContentType("application/json");

		try {		
			
			List<Client> listeClients = clientServiceImpl.recupererListeClients();
					
			String json = new Gson().toJson(listeClients);
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
