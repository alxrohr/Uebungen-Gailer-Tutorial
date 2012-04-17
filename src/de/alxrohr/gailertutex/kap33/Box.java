/**
 * 
 */
package de.alxrohr.gailertutex.kap33;

/**
 * Eine Box repr�sentiert einen Quader, also ein dreidimensionales rechteckiges Objekt
 * 
 * @author a.rohr
 * 
 */
public class Box {

	private double laenge;
	private double breite;
	private double hoehe;

	/**
	 * Erzeugt eine Box, definiert durch die L�ngen ihrer Kanten.
	 * 
	 * @param laenge	Die L�nge der ersten Kante in Metern
	 * @param breite	Die L�nge der zweiten Kante in Metern
	 * @param hoehe		Die L�nge der dritten Kante in Metern
	 */
	public Box( double laenge, double breite, double hoehe ) {
		this.laenge = laenge;
		this.breite = breite;
		this.hoehe = hoehe;
	}
	
	/**
	 * Erzeugt einen W�rfel, also eine symmetrische Box mit Kanten identischer L�ngen
	 * 
	 * @param seite		Die Kantenl�nge in Metern
	 */
	public Box( double seite ) {
		this.laenge = seite;
		this.breite = seite;
		this.hoehe = seite;
	}
	
	/**
	 * Erzeugt eine Box mit identischen Abmessungen wie eine gegebene Box
	 * 
	 * @param alteBox		Die gegebene Box
	 */
	public Box( Box alteBox ) {
		setLaenge( alteBox.getLaenge() );
		setBreite( alteBox.getBreite() );
		setHoehe( alteBox.getHoehe() );
	}
	
	/**
	 * Berechnet das Volumen, also den Rauminhalt der Box
	 * 
	 * @return Volumen in Kubikmetern
	 */
	public double berechneVolumen() {
		return laenge * breite * hoehe;
	}

	/**
	 * Berechnet die Oberfl�che der Box, also die Summe der Fl�cheninhalte aller 6 Seitenfl�chen
	 * 
	 * @return Oberfl�che in Quadratmetern
	 */
	public double berechneOberflaeche() {
		return 2 * ( berechneGrundflaeche() 
				+ berechneSeitenflaeche() 
				+ berechneStirnflaeche() );
	}

	/**
	 * Erzeugt eine Box mit 1/4 gr��erer Kantenl�nge als eine gegebene Box
	 * 
	 * @return Gr��ere Box
	 */
	public Box groessereBox() {
		return new Box( 1.25*this.laenge, 
				1.25*this.breite, 
				1.25*this.hoehe );
	}

	/**
	 * Erzeugt eine Box mit 1/4 kleinerer Kantenl�nge als eine gegebene Box
	 * 
	 * @return Kleinere Box
	 */
	public Box kleinereBox() {
		return new Box( 0.75*this.laenge, 
				0.75*this.breite, 
				0.75*this.hoehe );
	}
	
	/**
	 * Pr�ft, ob die Box this (ohne Rotation) in eine andere Box hinpassen w�rde, also kleinere Kantenl�ngen hat. 
	 * 
	 * @param aeusserBox
	 * @return True, wenn die Box this in die �u�ere Box hineinpasst
	 */
	public boolean passtIn( Box aeusserBox ) {
		return ( this.laenge < aeusserBox.getLaenge() ) &&
				( this.breite < aeusserBox.getBreite() ) &&
				( this.hoehe < aeusserBox.getHoehe() );
	}
	
	/**
	 * Berechne den Fl�cheninhalt der Stirnfl�che (Breite mal H�he) der Box
	 *  
	 * @return Fl�cheninhalt der Stirnfl�che
	 */
	private double berechneStirnflaeche() {
		return breite*hoehe;
	}

	/**
	 * Berechne den Fl�cheninhalt der Seitenfl�che (L�nge mal H�he) der Box
	 *  
	 * @return Fl�cheninhalt der Seitenfl�che
	 */
	private double berechneSeitenflaeche() {
		return laenge*hoehe;
	}

	/**
	 * Berechne den Fl�cheninhalt der Grundfl�che (L�nge mal Breite) der Box
	 *  
	 * @return Fl�cheninhalt der Grundfl�che
	 */
	private double berechneGrundflaeche() {
		return laenge*breite;
	}

	/**
	 * @return L�nge der ersten Kante der Box
	 */
	public double getLaenge() {
		return laenge;
	}

	/**
	 * @param laenge	Neue L�nge der ersten Kante der Box
	 */
	private void setLaenge(double laenge) {
		this.laenge = laenge;
	}

	/**
	 * @return L�nge der zweiten Kante der Box
	 */
	public double getBreite() {
		return breite;
	}

	/**
	 * @param breite	Neue L�nge der zweiten Kante der Box
	 */
	private void setBreite(double breite) {
		this.breite = breite;
	}

	/**
	 * @return L�nge der dritten Kante der Box
	 */
	public double getHoehe() {
		return hoehe;
	}

	/**
	 * @param hoehe	Neue L�nge der dritten Kante der Box
	 */
	private void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}

}
