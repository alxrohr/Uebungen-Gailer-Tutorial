/**
 * 
 */
package de.alxrohr.gailertutex.kap50;

/**
 * @author Alexander Rohr
 *
 */
public class ArtikelTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Artikel duffy = new Artikel( "SC123-F", "DUFFY MALT Whisky", 10.0, 3 );
		Artikel glenMor = new Artikel( "SC347-A", "GLEN MORANGIE MALT Whisky", 55.0, 15);
		System.out.println( duffy + ", VK: " + duffy.berechneVerkaufspreis() + " EUR");
		System.out.println( glenMor + ", VK: " + glenMor.berechneVerkaufspreis() + " EUR");

		Sonderposten duffy2 = new Sonderposten("SC123-F", "DUFFY MALT Whisky", 10.0, 3);
		Sonderposten glenMor2 = new Sonderposten( "SC347-A", "GLEN MORANGIE MALT Whisky", 55.0, 15);
		System.out.println( duffy2 + ", VK: " + duffy2.berechneVerkaufspreis() + " EUR");
		System.out.println( glenMor2 + ", VK: " + glenMor2.berechneVerkaufspreis() + " EUR");
	}

}
