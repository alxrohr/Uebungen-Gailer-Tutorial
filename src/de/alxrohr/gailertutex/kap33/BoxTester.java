/**
 * 
 */
package de.alxrohr.gailertutex.kap33;

/**
 * @author a.rohr
 *
 */
public class BoxTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Box musterBox = new Box( 2.5, 5.0, 6.0 );

		Box box = new Box( musterBox );
		
		System.out.println( "L�nge: " + box.getLaenge()
				+ "m, H�he: " + box.getHoehe()
				+ "m, Breite: " + box.getBreite() + "m" );
		
		System.out.println( "Fl�che: " + box.berechneOberflaeche() 
				+ "m^2, Volumen " + box.berechneVolumen() + "m^3" );
		
		box = musterBox.groessereBox();
		
		System.out.println( "L�nge: " + box.getLaenge()
				+ "m, H�he: " + box.getHoehe()
				+ "m, Breite: " + box.getBreite() + "m" );
		
		System.out.println( "Fl�che: " + box.berechneOberflaeche() 
				+ "m^2, Volumen " + box.berechneVolumen() + "m^3" );
		
		box = box.kleinereBox();

		System.out.println( "L�nge: " + box.getLaenge()
				+ "m, H�he: " + box.getHoehe()
				+ "m, Breite: " + box.getBreite() + "m" );
		
		System.out.println( "Fl�che: " + box.berechneOberflaeche() 
				+ "m^2, Volumen " + box.berechneVolumen() + "m^3" );

		if ( box.passtIn( musterBox) )
			System.out.println( "Letztere Box passt in die erste Box hinein." );
		else
			System.out.println( "Letztere Box passt nicht in die erste Box hinein." );
			
		
		
	}

}
