/**
 * 
 */
package de.alxrohr.gailertutex.kap09;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Alexander Rohr
 * 
 * �bungen zu Kapitel 9: Variablen, Operationen, Objekte
 *
 */
public class VariablenAusdr�ckeUndStrings {
	public final static double MWST = 0.19; // eine Konstante

	public static void main ( String[] args ) {
		int x = 5, 
				y = 2;
		System.out.println("Auch wenn man es nicht glaubt: 5/2 ist " + (x/y) );
		System.out.println("Das gilt auch f�r Literale: 5/2 ist " + (5/2) );
		System.out.println("Also verwende an der richtigen Stelle Flie�komma-Literale: 5.0 / 2.0 ist " + ( 5.0 / 2.0) );

		System.out.println("Die Vorzeichen-Operatoren funktionieren auch f�r Variablen: -x ist " + -x + " und +-+y ist " + +-+y);
	
		String str = new String("Elementary, dear Watson!");
		System.out.println("Die L�nge von str ist " + str.length() );

		// Eine sehr fl�chtige Instanz eines String-Objekts, sozusagen ein Einweg-Objekt
		System.out.println( new String("Elementar").length() );

		// Noch ein Einweg-Objekt
		System.out.println( str.substring(12) );
	}
}