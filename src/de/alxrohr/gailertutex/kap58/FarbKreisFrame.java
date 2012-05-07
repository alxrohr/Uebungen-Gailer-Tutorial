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
public class FarbKreisFrame extends JFrame implements ActionListener {

	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public FarbKreisFrame(String title) throws HeadlessException {
		super(title);
		setSize( 200, 100 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		setLayout( new FlowLayout() );
		JButton farbWechselKnopf = new JButton( "Farbe ändern" );
		farbWechselKnopf.addActionListener( this );
		add( farbWechselKnopf );
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent event) {
		Color bisherigeFarbe = getContentPane().getBackground();
		Color neueFarbe = Color.red;
		if ( Color.red.equals(bisherigeFarbe) )
			neueFarbe = Color.green;
		if ( Color.green.equals(bisherigeFarbe) )
			neueFarbe = Color.blue;
		if ( Color.blue.equals(bisherigeFarbe) ) 
			neueFarbe = Color.gray;
		if ( Color.gray.equals(bisherigeFarbe) )
			neueFarbe = Color.red;
		getContentPane().setBackground( neueFarbe );
		repaint();
	}
}
