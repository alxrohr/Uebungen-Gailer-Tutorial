/**
 * 
 */
package de.alxrohr.gailertutex.kap10;

import java.util.Scanner;

/**
 * @author Alexander Rohr
 *
 */
public class KreisFlaeche {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println( "Dieses Programm berechnet die Kreisfläche aus dem Radius." );

		System.out.println( "Bitte einen ganzzahligen Radius eingeben: " );
		double radius = input.nextInt();

		double flaeche = Math.PI * radius * radius;

		System.out.println( "Der Kreis hat eine Fläche von " + flaeche );
	}

}
