package fr.pfit.sio.slam2ville.servlets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import fr.pfit.sio.slam2ville.business.Ville;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class rechercheVilleJson extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private List<Ville> villes = new ArrayList<>();

    public rechercheVilleJson() {
        // TODO Auto-generated constructor stub
    	recupereVilles("https://clelia.fr/PFIT/SIO/PPE4/villes.csv");
    	Collections.sort(villes);
    	System.out.println("La collection compporte " + villes.size());
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public void recupereVilles(String nomFichier){
		BufferedReader br = null;
		String csvSplitBy = ";";
		String line = "";
		
		try {
			URL u = new URL(nomFichier);
			br = new BufferedReader(new InputStreamReader((u.openStream())));
			br.readLine();
			
			while ((line = br.readLine()) != null) {
				String[] info = line.split(csvSplitBy);
				Ville ville = new Ville(info[0], info[1]);
				villes.add(ville);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			if (br != null){
				try {
					br.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
	}
}
