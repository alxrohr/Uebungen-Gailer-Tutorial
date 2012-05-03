/**
 * 
 */
package de.alxrohr.gailertutex.kap56;

import javax.swing.JFrame;

/**
 * @author Alexander Rohr
 *
 */
public class TestFrameErweitert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame( "Test-Frame Extra" );
		frame.setVisible( true );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		int breite = 200;
		int hoehe = 100;
		frame.setSize( 200, 100 );

		while ( true ) {
			for ( int extra = 0; extra < 500; extra++ ) {
				frame.setSize( breite+extra, hoehe+extra );
			}
			for ( int extra = 500; extra > 0; extra-- ) {
				frame.setSize( breite+extra, hoehe+extra );
			}
		}
	}
}
