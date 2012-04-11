/**
 * 
 */
package de.alxrohr.gailertutex.kap10;

import java.util.Scanner;

/**
 * @author Alexander Rohr
 * 
 * Wenn Sie in einem Geschäft an der Kasse Ihr Wechselgeld bekommen, 
 * gibt Ihnen der Kassenmitarbeiter zuerst Dollar, dann Quarter (25 Cent), 
 * dann Dime (10 Cent), dann Nickel (5 Cent) und schließlich Cent zurück. 
 *
 */
public class WechselgeldUS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println( "Dieses Programm berechnet das Wechselgeld in US-Münzen." );

		System.out.println( "Bitte geben Sie den zu zahlenden Betrag ein, ganzzahlig in US-Cents: " );
		int betrag = input.nextInt();

		System.out.println( "Bitte geben Sie den zu bezahlten Betrag ein, ganzzahlig in US-Dollar: " );
		int gegeben = 100 * input.nextInt();

		int restgeld = gegeben - betrag;
		
		int dollar, quarter, dime, nickel, cent;

		dollar = restgeld / 100;
		restgeld = restgeld % 100;

		quarter = restgeld / 25;
		restgeld = restgeld % 25;
		
		dime = restgeld / 10;
		restgeld = restgeld % 10;
		
		nickel = restgeld / 5;
		restgeld = restgeld % 5;
		
		cent = restgeld;
		
		System.out.println( "Das Restgeld beträgt " +
				dollar + " Dollar, " +
				quarter + " Quarter, " +
				dime + " Dime, " +
				nickel + " Nickel, " +
				cent + " Cent." );
	}

}
