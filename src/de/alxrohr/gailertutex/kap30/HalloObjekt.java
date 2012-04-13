/**
 * 
 */
package de.alxrohr.gailertutex.kap30;

/**
 * @author Alexander Rohr
 *
 */
public class HalloObjekt {

	private String gruss;

	/**
	 * @param string
	 */
	public HalloObjekt(String string) {
		setGruss(string);
	}

	/**
	 * 
	 */
	public HalloObjekt() {
		setGruss(null);
	}

	/**
	 * @param hallo
	 */
	public HalloObjekt(HalloObjekt hallo) {
		setGruss( hallo.getGruss() );
	}

	/**
	 * 
	 */
	public void sprich() {
		int i;
		int len = getGruss().length();

		for( i=0; i<len; i++ )
			System.out.println( getGruss() );
	}

	/**
	 * 
	 */
	public void morgen() {
		System.out.println( "Guten Morgen, schšne Welt!" );
	}

	/**
	 * 
	 */
	public void abend() {
		System.out.println( "Guten Abend, schšne Welt!" );
	}

	/**
	 * @return the gruss
	 */
	String getGruss() {
		return gruss;
	}

	/**
	 * @param gruss the gruss to set
	 */
	private void setGruss(String gruss) {
		this.gruss = gruss;
	}

}
