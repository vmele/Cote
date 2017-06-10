package fr.pfit.sio.villesajax.servlets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import fr.pfit.sio.villesajax.business.Ville;
import fr.pfit.sio.villesajax.util.VillesCorrespondantes;

/**
 * Servlet implementation class RechercheVilleServlet
 */
public class RechercheVille extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private int dojoPageSize = 20;
	List<Ville> villes = new ArrayList<Ville>();

	public void recupereVilles(String nomFichier) {
		BufferedReader br = null;
		String cvsSplitBy = ";";
		String line = "";

		try {
			URL u = new URL(nomFichier);
			br = new BufferedReader(new InputStreamReader(u.openStream()));

			br.readLine();

			while ((line = br.readLine()) != null) {
				String[] info = line.split(cvsSplitBy);
				Ville ville = new Ville(info[0], info[1]);
				villes.add(ville);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RechercheVille() {
		super();
		recupereVilles("https://clelia.fr/PFIT/SIO/PPE4/villes.csv");
		Collections.sort(villes);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		int start = 0;
		int counter = 0;
		VillesCorrespondantes villesCorrespondantes = new VillesCorrespondantes();
		// je recupere le nom que l'utilisateur a saisie sur le formulaire
		String nomSaisie = request.getParameter("name");

		if (request.getParameter("start") != null)
			start = Integer.parseInt(request.getParameter("start").toString());
		if (request.getParameter("count") != null)
			dojoPageSize = Integer.parseInt(request.getParameter("count").toString());

		// Enleve l'etoile a la fin
		if (nomSaisie != null && nomSaisie.length() > 1 && nomSaisie.endsWith("*"))
			nomSaisie = nomSaisie.substring(0, nomSaisie.length() - 1);

		//List<Ville> villesTrouvees = chercheNom(nomSaisie);
		List<Ville> villesTrouvees = chercheNom(nomSaisie);
		
		if (villesTrouvees!=null && villesTrouvees.size() > 0) {
			villesCorrespondantes.setNbVillesTotales(villesTrouvees.size());

			int nbResultats = 0;
			
			for (Ville ville : villesTrouvees) {
				if (counter >= start && nbResultats < dojoPageSize) {
					nbResultats++;
					villesCorrespondantes.ajouteVille(ville);
				}				
				counter++;

			}
		}
		response.getOutputStream().print(mapper.writeValueAsString(villesCorrespondantes));
		response.getOutputStream().flush();
	}

	public List<Ville> cherchePostale(String codePostal, List<Ville> villes) {
		while (codePostal.length() < 5) {
			codePostal = "0" + codePostal;
		}

		List<Ville> cpTrouve = new ArrayList<Ville>();
		Iterator itr = villes.iterator();
		while (itr.hasNext()) {
			Ville ville = (Ville) itr.next();
			if (ville.getCodePostal().equals(codePostal))
				cpTrouve.add(ville);
		}
		if (cpTrouve.size() == 0) {
			return null;
		}
		return cpTrouve;
	}

	public List<Ville> chercheNom(String nom) {

		List<Ville> cpTrouve = new ArrayList<Ville>();
		if (nom == null)
			return cpTrouve;
		Iterator itr = villes.iterator();
		while (itr.hasNext()) {
			Ville ville = (Ville) itr.next();
			if (ville.getNom() != null && ville.getNom().toUpperCase().startsWith(nom.toUpperCase())) {
				cpTrouve.add(ville);
			}
		}
		if (cpTrouve.size() == 0) {
			return null;
		}
		return cpTrouve;
	}
}
