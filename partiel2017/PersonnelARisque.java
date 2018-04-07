/**
 * 
 */
package examen.annee20162017.CC1;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Calendar;

/**
 * @author kahlem
 *
 */
//5
public class PersonnelARisque {
	private ARisque[] lesARisque;
	private int nbARisque;
	private int capacite = 200;//0,5
	
	public PersonnelARisque(){//0,5
		lesARisque = new ARisque[capacite];
		nbARisque = 0;
	}
	public void ajouter (ARisque a){//1
		if (nbARisque < capacite) {
			lesARisque[nbARisque++] = a;
		} 
		else {
        System.out.println("Pas plus de " + capacite + " employés à risque");
		}
	}
	//2
	public ARisque[] disponibles(){
		ARisque[] disponibles = new ARisque[capacite];//0,5
		int nbDispo = 0;
		for (int i= 0; i<nbARisque;i++){//0,25
			if (!lesARisque[i].seuilAtteint())//0,5
				disponibles[nbDispo++]=lesARisque[i];//0,5
		}
		disponibles = Arrays.copyOf(disponibles, nbDispo);
		return disponibles;		//0,25
	}
	
	public double totalPrime(){//1
		double total = 0;
		for(int i = 0; i<nbARisque;i++){
			total +=lesARisque[i].prime();
			}
		return total;
	}
	
	

}
