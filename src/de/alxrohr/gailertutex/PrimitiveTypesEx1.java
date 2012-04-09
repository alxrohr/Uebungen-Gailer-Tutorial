/**
 * 
 */
package de.alxrohr.gailertutex;

/**
 * @author Alexander Rohr
 *
 */
public class PrimitiveTypesEx1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ein byte hat 8 Bit und ist vorzeichenbehaftet
		byte b = -128;
		System.out.println("Ein Byte hat in Java ein Vorzeichen: " + b);
		
		// short kann Werte zwischen -2^15 und 2^15-1 aufnehmen.
		short s = Short.MAX_VALUE;
		System.out.println("Der Typ short hat den Maximalwert " + s);
		
		// int kann Werte zwischen -2^31 und 2^31-1 aufnehmen.
		int i = Integer.MAX_VALUE;
		System.out.println("Der Typ int hat den Maximalwert " + i);
		
		// long speichert Werte zwischen -2^63 und 2^63-1
		// Ein Buchstabe 'L' hinter einem Literal erzwingt auch für kleine Zahlen den Typ long
		long l = 1L;
		System.out.println("Eine " + l + " vom Typ long sieht auch nicht anderes aus als kürzere Einsen.");

		boolean georgeBool = true;
		System.out.println("Die Aussage 'George Bool ist der Namenspatron des Typs boolean' hat den Wahrheitswert " + georgeBool);
		
		// Der Typ char verwendet 16 Bit und kann damit Unicode abbilden.
		char c = '\n';
		System.out.println("Wenn \\t für Tab steht," + c + "wofür steht dann \\n?");

		// float besitzt 32 Bit, aufgeteilt in 23 Bit (6 Hexadezimalstellen) Mantisse und 7 Bit Exponent (und zwei Vorzeichen-Bits)
		// Dieser Typ wird nur noch in begründeten (Ausnahme-)Fällen verwendet.
		// Ein Buchstabe 'F' hinter einem Literal erzwingt den Typ float.
		float f = 0F;
		System.out.println("Eine 'primitive' Fließkommazahl: " + f);

		// double besitzt 64 Bit, speichert also ca. 13 Hexadezimalstellen Mantisse und 11 Bit Exponent
		// Diesen Typ verwendet man als Default für Fließkommazahlen, alle Fließkomma-Literale sind vom Typ double.
		// Ein Buchstabe 'D' hinter einem Literal erzwingt den Typ double.
		// Lesbarer als 0D ist aber die Schreibweise 0.0 für solche Literale
		double d = Double.MAX_VALUE;
		System.out.println("Die größtmögliche 'primitive' Fließkommazahl in Java: " + d);

		System.out.println("Noch größer geht es nicht: " + d * 10);
		
		s = 512;
		System.out.println("e hoch " + s + " ist " + Math.exp(s));
		
		s = 1024;
		System.out.println("e hoch " + s + " ist " + Math.exp(s));
		
	}

}
