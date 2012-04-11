/**
 * 
 */
package de.alxrohr.gailertutex.kap10;

import java.util.Scanner;

import javax.xml.stream.util.EventReaderDelegate;

/**
 * @author Alexander Rohr
 * 
 * Berechnung der Tiefe eines Brunnens aus der Falldauer eines
 * hineingeworfenen Objekts
 * 
 * s = \frac{1}{2} g (t_1)^2
 * s = v_{\text{Schall}} ( t - t_1)
 * 
 * \sqrt{ \frac{2s}{g} } = t_1
 * s =  v_{\text{Schall}} ( t - \sqrt{ \frac{2s}{g} } )
 *
 */
public class Fallhoehe {

	final static double ERDBESCHLEUNIGUNG = 9.81; // Meter pro Sekunde^2
	final static double SCHALLGESCHWINDIGKEIT = 330; // Meter pro Sekunde
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println( "Dieses Programm berechnet die Tiefe eines Brunnens näherungsweise aus\n" + 
				"der Falldauer eines hineingeworfenen Objekts" );
		Scanner scanner = new Scanner( System.in );
		
		System.out.println("Bitte geben sie die Zeitdifferenz in Sekunden (mit Nachkommastellen) ein.");
		double dauer = scanner.nextDouble();
		
		double hoehe = 0.5 * ERDBESCHLEUNIGUNG * dauer * dauer;
		
		System.out.println( "Der Brunnen hat unter Vernachlässigung von Luftwiderstand und Schallübertragung\n" +
				"eine Tiefe von circa " + hoehe + " Metern." );

		double a = SCHALLGESCHWINDIGKEIT / ERDBESCHLEUNIGUNG;
		double fallzeit = Math.sqrt( 2 * a * dauer + a * a ) - a;
		hoehe = 0.5 * ERDBESCHLEUNIGUNG * fallzeit * fallzeit;
		
		System.out.println( "Die Laufzeit des Schalls beträgt genau " + (dauer - fallzeit) + " Sekunden." );
		System.out.println( "Die Tiefe des Brunnens beträgt unter Vernachlässigung des Luftwiderstands " + hoehe + " Meter." );		
	}

}
