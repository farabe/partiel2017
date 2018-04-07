/**
 * 
 */
package examen.annee20162017.CC1;

import java.util.Calendar;

/**
 * @author kahlem
 *
 */ //2,5
/* **********************************************************************
 *  La classe Vendeur
 * **********************************************************************/
public class Vendeur extends Commercial {//0,5
    private final static double POURCENT_VENDEUR = 0.2;
    private final static int BONUS_VENDEUR = 10;
  //0,25
    public Vendeur(String prenom, String nom, int anneeEntree) {
        super(prenom, nom,  anneeEntree);
    }
  //1,5
    public double calculerSalaire() {
        return (POURCENT_VENDEUR * getChiffreAffaire()) + ((Calendar.getInstance()).get(Calendar.YEAR)-this.getAnneeEntree())*BONUS_VENDEUR;
    }
    //0,25
    public String toString()
        {
            return super.toString() + " Type : Vendeur ";
        }
 
}
