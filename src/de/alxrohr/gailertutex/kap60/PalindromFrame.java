/**
 * 
 */
package de.alxrohr.gailertutex.kap60;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author Alexander Rohr
 *
 */
public class PalindromFrame extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final int FIELDLENGTH = 32;
	
	private JTextField inTextfield;

	private JTextField outTextfield;

	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public PalindromFrame( String title ) throws HeadlessException {
		super( title );
		setSize( 700, 100 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		setLayout( new FlowLayout() );
		JLabel inLabel = new JLabel( "Bitte geben Sie einen kurzen Text ein:");
		add( inLabel );
		inTextfield = new JTextField( FIELDLENGTH );
		add( inTextfield );
		inTextfield.addActionListener( this );
		JLabel outLabel = new JLabel( "Rückwärts gelesen lautet dieser Text:");
		add( outLabel );
		outTextfield = new JTextField( FIELDLENGTH );
		outTextfield.setEditable(false);
		add( outTextfield );
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String inText = inTextfield.getText().toLowerCase();
		StringBuffer outBuffer = new StringBuffer( FIELDLENGTH );
		for ( int i = inText.length() - 1; i >= 0; i-- ) {
			outBuffer.append( inText.charAt(i) );
		}
		outTextfield.setText( outBuffer.toString() );
	}

}
