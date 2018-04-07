/**
 * 
 */
package examen.annee20162017.CC1;

import java.io.*;
import java.util.Arrays;


/**
 * @author kahlem
 *
 */
//3
public class GestionARisque {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileInputStream fis;
		PersonnelARisque persARisque= new PersonnelARisque();//0,25
		ARisque a = null;
		try {//0,25
			fis = new FileInputStream (new File ("lesARisque.ser"));//0,25
			ObjectInputStream ois = new ObjectInputStream(fis);//0,25
			try{
				while ((a = (ARisque)ois.readObject())!=null)//0,5
					persARisque.ajouter(a);//0,5
			}	
			finally{
				ois.close();
			}
		}
	
		//0,25
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		ARisque[] lesDispo = persARisque.disponibles();//0,25
		for (ARisque ar : lesDispo)//0,5
			System.out.println(ar);
		
	}

}
