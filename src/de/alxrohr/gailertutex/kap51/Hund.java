/**
 * 
 */
package de.alxrohr.gailertutex.kap51;

/**
 * @author Alexander Rohr
 *
 */
public class Hund extends Haustier {
	public static final String KATEGORIE_KLEIN = "kleiner Hund";
	public static final String KATEGORIE_MITTEL = "mittelgroﬂer Hund";
	public static final String KATEGORIE_GROSS = "groﬂer Hund";
	private static final double TAGESPORTION = 1.0;
	
	private String kategorie;

	/**
	 * @param name
	 * @param futtervorrat
	 */
	public Hund(String name, String kategorie, double futtervorrat) {
		super(name, futtervorrat);
		this.kategorie = kategorie;
	}

	/* (non-Javadoc)
	 * @see de.alxrohr.gailertutex.kap51.Haustier#sprich()
	 */
	@Override
	public String sprich() {
		return "Wau!";
	}
	
	@Override
	public String toString() {
		return name + " (" + kategorie + "): " + futtervorrat + " Einheiten";
	}

	/* (non-Javadoc)
	 * @see de.alxrohr.gailertutex.kap51.Haustier#getTAGESPORTION()
	 */
	@Override
	protected double getTAGESPORTION() {
		return TAGESPORTION;
	}
}
