/**
 * 
 */
package de.alxrohr.gailertutex.kap10;

import java.util.Scanner;

/**
 * @author Alexander Rohr
 *
 */
public class EchoQuadrat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int zahl;
		Scanner scan = new Scanner( System.in );
		
		System.out.println("Geben Sie eine natürliche Zahl ein!");
		zahl = scan.nextInt();
		
		System.out.println("Das Quadrat Ihrer Zahl ist " + (zahl * zahl) );
	}

}
