/**
 * 
 */
package de.alxrohr.gailertutex.kap50;

/**
 * @author Alexander Rohr
 *
 */
public class Sonderposten extends Artikel {
	int rabatt; // in Prozent

	/**
	 * @param artikelNr
	 * @param bezeichnung
	 * @param einkaufspreis
	 * @param lagerzeit
	 */
	public Sonderposten( String artikelNr, String bezeichnung,
			double einkaufspreis, int lagerzeit ) {
		super(artikelNr, bezeichnung, einkaufspreis, lagerzeit);
		if ( lagerzeit > 12 )
			this.rabatt = 30;
		else
			this.rabatt = 10;
	}
	
	@Override
	public String toString() {
		return "Sonderposten: " + super.toString() + ", Rabatt " + rabatt +"%";
	}
	
	@Override
	public int berechneVerkaufspreis() {
		return (int) ( super.berechneVerkaufspreis() * (100.0 - rabatt) / 100.0 );
	}

}
