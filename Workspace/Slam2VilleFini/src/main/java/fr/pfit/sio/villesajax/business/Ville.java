package fr.pfit.sio.villesajax.business;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({ "codePostal", "nom" })
public class Ville implements Comparable<Ville>
{
   private int id;
   private String codePostal;
   private String nom;
   private static int currentId = 0;

   public Ville(String codePostal, String nom)
   {
      this.codePostal = codePostal;
      this.nom = nom;
      this.id=++currentId;
   }

   @JsonProperty(value="name")
   public String getNomEtCodePostal()
   {
	  return codePostal + " (" + nom +")";  
   }
   
   public int getId()
   {
      return id;
   }

   public String getCodePostal()
   {
      return codePostal;
   }

   public String getNom()
   {
      return nom;
   }

   public int compareTo(Ville autreVille)
   {
      return getNom().compareTo(autreVille.getNom());
   }

}
