/**
 * 
 */
package de.alxrohr.gailertutex.kap26;

/**
 * @author Alexander Rohr
 * 
 * Instanzen erben auch die statischen Methoden ihrer Klasse
 *
 */
public class StaticTest1 {

	/**
	 * @param args
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Integer i = 0;
		System.out.println(Integer.MAX_VALUE);
		// Die folgende Zeile erzeugt eine Compiler-Warnung, aber keinen Fehler
		System.out.println(i.MAX_VALUE);

	}

}
