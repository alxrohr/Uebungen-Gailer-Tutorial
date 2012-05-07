/**
 * 
 */
package de.alxrohr.gailertutex.kap58;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author Alexander Rohr
 *
 */
public class ThreeButtonMonteFrame extends JFrame implements ActionListener {

	private Random rndgen = new Random();

	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public ThreeButtonMonteFrame(String title) throws HeadlessException {
		super(title);
		setSize( 400, 100 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		setLayout( new FlowLayout() );
		add( new JLabel( "Wählen Sie einen der drei Buttons." ) );
		add( new JLabel( "Nur einer davon gewinnt!" ) );
		JButton linkerKnopf = new JButton( "1" );
		linkerKnopf.addActionListener( this );
		add( linkerKnopf );
		JButton mittlererKnopf = new JButton( "2" );
		mittlererKnopf.addActionListener( this );
		add( mittlererKnopf );
		JButton rechterKnopf = new JButton( "3" );
		rechterKnopf.addActionListener( this );
		add( rechterKnopf );
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent event) {
		int rnd = rndgen.nextInt(3);
		if ( rnd > 0 )
			System.exit(0);
		getContentPane().setBackground( Color.green );
		repaint();
	}
}
