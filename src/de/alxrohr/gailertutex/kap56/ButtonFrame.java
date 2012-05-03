/**
 * 
 */
package de.alxrohr.gailertutex.kap56;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.sun.org.apache.regexp.internal.REDebugCompiler;

/**
 * @author Alexander Rohr
 *
 */
public class ButtonFrame extends JFrame implements ActionListener {

	private JButton bChange;

	/**
	 * @param text
	 */
	public ButtonFrame(String text) {
		super(text);
		setLayout( new FlowLayout() );

		bChange = new JButton( "Klick mich!" );
		bChange.addActionListener( this );

		add( bChange );

		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent event) {
		getContentPane().setBackground( Color.blue );
		repaint();
		// System.exit(0);
	}
}
