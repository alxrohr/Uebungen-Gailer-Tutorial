/**
 * 
 */
package de.alxrohr.gailertutex.kap51;

/**
 * @author Alexander Rohr
 *
 */
public class Katze extends Haustier {

	private static final double TAGESPORTION = 0.5;
	public static final String WOHNUNGSKATZE = "Wohnungskatze";
	public static final String FREIGAENGER = "Freigänger";
	
	private String haltung;

	/**
	 * @param name
	 * @param haltung 
	 * @param futtervorrat
	 */
	public Katze( String name, String haltung, double futtervorrat ) {
		super( name, futtervorrat );
		this.haltung = haltung;
	}

	/* (non-Javadoc)
	 * @see de.alxrohr.gailertutex.kap51.Haustier#sprich()
	 */
	@Override
	public String sprich() {
		return "Miau!";

	}
	
	/* (non-Javadoc)
	 * @see de.alxrohr.gailertutex.kap51.Haustier#toString()
	 */
	@Override
	public String toString() {
		return haltung + " " + name + ": " + futtervorrat + " Einheiten";
	}

	/* (non-Javadoc)
	 * @see de.alxrohr.gailertutex.kap51.Haustier#getTAGESPORTION()
	 */
	@Override
	protected double getTAGESPORTION() {
		return TAGESPORTION;
	}
}
