/**
 * 
 */
package de.alxrohr.gailertutex.kap56;

import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author Alexander Rohr
 *
 */
public class MeinFrame extends JFrame {

	private JLabel label;

	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public MeinFrame(String title) throws HeadlessException {
		super(title);
		setSize( 150, 100 );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		setLayout( new FlowLayout() );
		
		label = new JLabel( "Hello Swing!" );
		add( label );
		add( new JLabel( "Noch ein Label..." ) );
	}

}
