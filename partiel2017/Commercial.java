/**
 * 
 */
package examen.annee20162017.CC1;

/**
 * @author kahlem
 *
 */ //2
/* **********************************************************************
 *  La classe Commercial (regroupe Vendeur et Représentant)
 * **********************************************************************/
public abstract class Commercial extends Employe{//0,25
	private double chiffreAffaire;//0,25
	 
    public Commercial(String prenom, String nom,int date)//0,5
                {
        super(prenom, nom, date);
        this.chiffreAffaire = 0;
    }

    public void setChiffreAffaire(double chiffreAffaire)//0,25
        {
            this.chiffreAffaire=chiffreAffaire;
        }
    public double getChiffreAffaire(){//0,25
    	return chiffreAffaire;
    }
    public String toString(){//0,5
    	return super.toString()+" Type : Commercial";
    }
  
   
 
}
