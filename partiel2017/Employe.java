/**
 * 
 */
package examen.annee20162017.CC1;

import java.io.Serializable;



/**
 * @author kahlem
 *
 */
//1,5
public abstract class Employe implements Serializable{//0,25
	//0,25
	 	private String nom;
	    private String prenom;
	    private int anneeEntree;

	  //0,25
	    public Employe(String prenom, String nom,  int anneeEmbauche) {
	        this.nom = nom;
	        this.prenom = prenom;
	        this.anneeEntree = anneeEmbauche;
	    }
	  //0,25
	    public abstract double calculerSalaire();
	
	   
	  //0,25
	    public String toString(){
	    	return "L'employé " + prenom + " " + nom+  " " + anneeEntree;
	    }
	    /*
	    public String getNom(){
	    	return nom;
	    }
	    public String getPrenom(){
	    	return prenom;
	    }*/
		/**
		 * @return the anneeEntree
		 */
	    //0,25
		public int getAnneeEntree() {
			return anneeEntree;
		}
		
		
}
