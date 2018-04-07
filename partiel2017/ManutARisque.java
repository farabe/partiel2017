/**
 * 
 */
package examen.annee20162017.CC1;

import java.io.PrintWriter;


/**
 * @author kahlem
 *
 */
//4
/* **********************************************************************
 *  Une autre sous-classe d'employé à risque
 * **********************************************************************/
public class ManutARisque extends Manutentionnaire implements ARisque {//0,5
	private static int seuil=120;//0,5


    public ManutARisque(String prenom, String nom, int date) {
        super(prenom, nom,  date);
    }
  //0,5
 public double prime(){
	 return getHeures()*0.5;
 }

   


	//2
	public void ajouterHeures(int heures)throws TropHeuresException{
		if (heures <= 10 && getHeures()+heures > seuil)
			throw new TropHeuresException("Dépassement seuil");
		 super.ajouterHeures(heures);
		 
	 }
	/* (non-Javadoc)
	 * @see examen.annee20162017.CC1.ARisque#seuilAtteint()
	 */
	@Override
	//0,5
	public boolean seuilAtteint() {
		return (getHeures()==seuil);
	}
	
		
	
}
