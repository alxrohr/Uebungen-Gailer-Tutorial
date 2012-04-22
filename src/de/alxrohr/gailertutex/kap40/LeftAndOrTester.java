/**
 * 
 */
package de.alxrohr.gailertutex.kap40;

/**
 * @author Alexander Rohr
 *
 */
public class LeftAndOrTester {

	private static boolean say( boolean bool ) {
		System.out.println( "Methode say(" + bool + ") wurde aufgerufen." );
		return bool;
	}
	
	
	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		System.out.println( "Merke: && bindet stärker als ||\n" );

		// Left And ist (wie erwartet) Links-Assoziativ
		if ( true && false && say(true) ) {
			System.out.println( "Dieser And-Zweig ist unerreichbar." );
		}
		else {
			System.out.println( "Dieser And-Zweig wurde erreicht ohne say(true) aufzurufen." );
		}
		
		// Left Or ist (wie erwartet) ebenfalls Links-Assoziativ
		if ( false || true || say(false) ) {
			System.out.println( "Dieser Or-Zweig wurde erreicht ohne say(false) aufzurufen." );
		}
		else {
			System.out.println( "Dieser Or-Zweig ist unerreichbar." );
		}

		// Eager And
		if ( false & say(true) ) {
			System.out.println( "Dieser And-Zweig ist unerreichbar." );
		}
		else {
			System.out.println( "Dieser And-Zweig wurde erreicht, nachdem say(true) aufgerufen wurde." );
		}
		
		// Eager Or
		if (true | say(false) ) {
			System.out.println( "Dieser Or-Zweig wurde erreicht, nachdem say(false) aufgerufen wurde." );
		}
		else {
			System.out.println( "Dieser Or-Zweig ist unerreichbar." );
		}
}

}
