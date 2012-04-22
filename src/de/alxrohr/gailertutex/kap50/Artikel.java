/**
 * 
 */
package de.alxrohr.gailertutex.kap50;

/**
 * @author Alexander Rohr
 *
 */
public class Artikel {
	private String artikelNr;
	private String bezeichnung;
	private double einkaufspreis; // in Euro
	private int lagerzeit; // in Monaten
	
	private final double HANDELSSPANNE = 0.6;
	private final double MWST = 0.19;
	
	Artikel( String artikelNr, String bezeichnung, double einkaufspreis, int lagerzeit ) {
		this.artikelNr = artikelNr;
		this.bezeichnung = bezeichnung;
		this.einkaufspreis = einkaufspreis;
		this.lagerzeit = lagerzeit;
	}

	@Override
	public String toString() {
		return artikelNr
				+ ": \"" + bezeichnung
				+ "\", EK: " + einkaufspreis
				+ " EUR, im Lager seit " + lagerzeit + " Monaten";
	}
	
	public int berechneVerkaufspreis() {
		double vk;
		vk = einkaufspreis * (1.0 + HANDELSSPANNE) * (1.0 + MWST);
		return (int) vk;
	}
	
}
