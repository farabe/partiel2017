/**
 * 
 */
package examen.annee20162017.CC1;

/**
 * @author kahlem
 *
 */
//2,5

/* **********************************************************************
 *  La classe Manutentionnaire
 * **********************************************************************/
public class Manutentionnaire extends Employe {
    private final static double SALAIRE_HORAIRE = 10.0;
    private int heures;
 //0,5
    public Manutentionnaire(String prenom, String nom,  int date) {
        super(prenom, nom,  date);
        this.heures = 0;
    }
    //1
 public void ajouterHeures(int heures) throws TropHeuresException{
	 if (heures >10)
		 throw new TropHeuresException();
	 this.heures += heures;
 }
 //0,25
 public int getHeures(){
	 return heures;
 }
//0,5

    public double calculerSalaire() {
        return SALAIRE_HORAIRE * heures;
    }
  //0,25

    public String toString()
    {
        return super.toString() + " Type : Manutentionnaire ";
    }
}
