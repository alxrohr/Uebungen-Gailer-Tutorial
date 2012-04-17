/**
 * 
 */
package de.alxrohr.gailertutex.kap33;

/**
 * Eine Box repräsentiert einen Quader, also ein dreidimensionales rechteckiges Objekt
 * 
 * @author a.rohr
 * 
 */
public class Box {

	private double laenge;
	private double breite;
	private double hoehe;

	/**
	 * Erzeugt eine Box, definiert durch die Längen ihrer Kanten.
	 * 
	 * @param laenge	Die Länge der ersten Kante in Metern
	 * @param breite	Die Länge der zweiten Kante in Metern
	 * @param hoehe		Die Länge der dritten Kante in Metern
	 */
	public Box( double laenge, double breite, double hoehe ) {
		this.laenge = laenge;
		this.breite = breite;
		this.hoehe = hoehe;
	}
	
	/**
	 * Erzeugt einen Würfel, also eine symmetrische Box mit Kanten identischer Längen
	 * 
	 * @param seite		Die Kantenlänge in Metern
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
	 * Berechnet die Oberfläche der Box, also die Summe der Flächeninhalte aller 6 Seitenflächen
	 * 
	 * @return Oberfläche in Quadratmetern
	 */
	public double berechneOberflaeche() {
		return 2 * ( berechneGrundflaeche() 
				+ berechneSeitenflaeche() 
				+ berechneStirnflaeche() );
	}

	/**
	 * Erzeugt eine Box mit 1/4 größerer Kantenlänge als eine gegebene Box
	 * 
	 * @return Größere Box
	 */
	public Box groessereBox() {
		return new Box( 1.25*this.laenge, 
				1.25*this.breite, 
				1.25*this.hoehe );
	}

	/**
	 * Erzeugt eine Box mit 1/4 kleinerer Kantenlänge als eine gegebene Box
	 * 
	 * @return Kleinere Box
	 */
	public Box kleinereBox() {
		return new Box( 0.75*this.laenge, 
				0.75*this.breite, 
				0.75*this.hoehe );
	}
	
	/**
	 * Prüft, ob die Box this (ohne Rotation) in eine andere Box hinpassen würde, also kleinere Kantenlängen hat. 
	 * 
	 * @param aeusserBox
	 * @return True, wenn die Box this in die äußere Box hineinpasst
	 */
	public boolean passtIn( Box aeusserBox ) {
		return ( this.laenge < aeusserBox.getLaenge() ) &&
				( this.breite < aeusserBox.getBreite() ) &&
				( this.hoehe < aeusserBox.getHoehe() );
	}
	
	/**
	 * Berechne den Flächeninhalt der Stirnfläche (Breite mal Höhe) der Box
	 *  
	 * @return Flächeninhalt der Stirnfläche
	 */
	private double berechneStirnflaeche() {
		return breite*hoehe;
	}

	/**
	 * Berechne den Flächeninhalt der Seitenfläche (Länge mal Höhe) der Box
	 *  
	 * @return Flächeninhalt der Seitenfläche
	 */
	private double berechneSeitenflaeche() {
		return laenge*hoehe;
	}

	/**
	 * Berechne den Flächeninhalt der Grundfläche (Länge mal Breite) der Box
	 *  
	 * @return Flächeninhalt der Grundfläche
	 */
	private double berechneGrundflaeche() {
		return laenge*breite;
	}

	/**
	 * @return Länge der ersten Kante der Box
	 */
	public double getLaenge() {
		return laenge;
	}

	/**
	 * @param laenge	Neue Länge der ersten Kante der Box
	 */
	private void setLaenge(double laenge) {
		this.laenge = laenge;
	}

	/**
	 * @return Länge der zweiten Kante der Box
	 */
	public double getBreite() {
		return breite;
	}

	/**
	 * @param breite	Neue Länge der zweiten Kante der Box
	 */
	private void setBreite(double breite) {
		this.breite = breite;
	}

	/**
	 * @return Länge der dritten Kante der Box
	 */
	public double getHoehe() {
		return hoehe;
	}

	/**
	 * @param hoehe	Neue Länge der dritten Kante der Box
	 */
	private void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}

}
