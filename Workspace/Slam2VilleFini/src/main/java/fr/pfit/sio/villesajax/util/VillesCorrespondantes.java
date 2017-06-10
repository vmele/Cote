package fr.pfit.sio.villesajax.util;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import fr.pfit.sio.villesajax.business.Ville;

public class VillesCorrespondantes {

	@JsonProperty(value = "items")
	private List<Ville> villes;
	private int nbVillesTotales;

	public int getNombreDeVilles() {
		return villes.size();
	}

	@JsonProperty(value = "identifier")
	public String getIdentifiant() {
		return "id";
	}

	public VillesCorrespondantes() {
		villes = new ArrayList<>();
	}

	public void ajouteVille(Ville ville) {
		villes.add(ville);
	}

	public List<Ville> getVilles() {
		return villes;
	}

	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}

	public void setNbVillesTotales(int nbVillesTotales) {
		this.nbVillesTotales = nbVillesTotales;
	}

	@JsonProperty(value = "numRows")
	public int getNbVillesTotales() {
		return nbVillesTotales;
	}
}
