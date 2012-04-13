/**
 * 
 */
package de.alxrohr.gailertutex.kap30;

import java.util.Scanner;

/**
 * @author Alexander Rohr
 *
 */
public class HelloApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HalloObjekt hallo = new HalloObjekt();
		
		hallo.morgen();

		System.out.println( "Bitte geben Sie eine Meldung für das HalloObjekt ein:" );
		Scanner scanner = new Scanner( System.in );
		String meldung = scanner.nextLine();
		
		hallo = new HalloObjekt( meldung );
		hallo.sprich();
		
		hallo.abend();
		
		HalloObjekt hallo2 = new HalloObjekt( hallo );
		hallo2.sprich();
		
		System.out.println(hallo);
		System.out.println(hallo2);
		
	}

	
}
