/**
 * 
 */
package de.alxrohr.gailertutex.kap58;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author Alexander Rohr
 *
 */
public class TwoButtonFrame extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final String ROT_KOMMANDO = "Rot";
	/**
	 * 
	 */
	private static final String GRUEN_KOMMANDO = "Grün";

	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public TwoButtonFrame(String title) throws HeadlessException {
		super(title);
		setSize( 300, 100 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		setLayout( new FlowLayout() );
		JButton redButton = new JButton( ROT_KOMMANDO );
		redButton.setActionCommand( ROT_KOMMANDO );
		JButton greenButton = new JButton( GRUEN_KOMMANDO );
		greenButton.setActionCommand( GRUEN_KOMMANDO );
		add( redButton );
		add( greenButton );
		redButton.addActionListener( this );
		greenButton.addActionListener( this );
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent event) {
		if ( ROT_KOMMANDO.equals( event.getActionCommand() ) ) {
			setBackground( Color.red );
		}
		if ( GRUEN_KOMMANDO.equals( event.getActionCommand() ) ) {
			setBackground( Color.green );
		}
		repaint();
	}

}
