/**
 * 
 */
package de.alxrohr.gailertutex.kap09;

/**
 * @author Alexander Rohr
 * 
 * Übungen zu Kapitel 9: Variablen, Operationen, Objekte
 *
 */
public class VariablenAusdrueckeUndStrings {
	public final static double MWST = 0.19; // eine Konstante

	public static void main ( String[] args ) {
		int x = 5, 
				y = 2;
		System.out.println("Auch wenn man es nicht glaubt: 5/2 ist " + (x/y) );
		System.out.println("Das gilt auch für Literale: 5/2 ist " + (5/2) );
		System.out.println("Also verwende an der richtigen Stelle Fließkomma-Literale: 5.0 / 2.0 ist " + ( 5.0 / 2.0) );

		System.out.println("Die Vorzeichen-Operatoren funktionieren auch für Variablen: -x ist " + -x + " und +-+y ist " + +-+y);
	
		String str1, str = new String("Elementary, dear Watson!");
		System.out.println("Die Länge von str ist " + str.length() );

		System.out.println( "Die ersten neun Zeichen: " + str.substring(0, 9) );
		System.out.println( "Das neunte Zeichen: " + str.substring(9, 9) );
		System.out.println( "Die ersten 24 Zeichen: " + str.substring(0, 24) );
		System.out.println( "Alle Zeichen: " + str.substring(0, str.length() ) );
		System.out.println( "Alle Zeichen ab dem 11ten: " + str.substring(10, str.length() ) );
		// System.out.println( "Ein Zeichen zuviel: " + str.substring(0, 25) );
		// System.out.println( "Vertauschte Grenzen: " + str.substring(10, 9) );
		
		// Eine sehr flüchtige Instanz eines String-Objekts, sozusagen ein Einweg-Objekt
		System.out.println( new String("Elementar").length() );

		// Noch ein Einweg-Objekt
		System.out.println( str.substring(12) );
		
		// System.out.println("Eine Stringvariable ohne Inhalt: " + str1);
		
		str1 = "   Foo\t\tbar\t\t\n";
		System.out.println( "xxx" + str1 + "xxx" );
		System.out.println( "xxx" + str1.trim() + "xxx" );
		
	}
}