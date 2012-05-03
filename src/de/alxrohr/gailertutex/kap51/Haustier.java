/**
 * 
 */
package de.alxrohr.gailertutex.kap51;

/**
 * @author Alexander Rohr
 *
 */
public abstract class Haustier {
	protected String name;
	protected double futtervorrat;
	private int schonGefuetterteTage = 0;
	
	public Haustier ( String name, double futtervorrat ) {
		this.name = name;
		this.futtervorrat = futtervorrat;		
	}

	public void friss() {
		futtervorrat = Math.max( 0.0, futtervorrat - getTAGESPORTION());
		System.out.println( this.toString() );
	}

	public void fuettern() {
		System.out.println( sprich() );
		while ( futtervorrat > 0 ) {
			friss();
			++schonGefuetterteTage;
		}
		System.out.println("Das Futter von " + name + " hat für " + schonGefuetterteTage + " Tage genügt.");
	}

	@Override
	public String toString() {
		return name + ": " + futtervorrat;
	}
	
	public abstract String sprich();
	
	abstract protected double getTAGESPORTION();
}
