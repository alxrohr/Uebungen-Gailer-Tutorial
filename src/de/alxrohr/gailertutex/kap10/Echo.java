/**
 * 
 */
package de.alxrohr.gailertutex.kap10;

import java.util.Scanner;

/**
 * @author Alexander Rohr
 *
 */
public class Echo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String inData;
		Scanner scan = new Scanner( System.in );
		
		System.out.println("Geben Sie etwas ein!");
		inData = scan.nextLine();
		
		System.out.println("Was meinen sie mit '" + inData + "'?");
	}

}
