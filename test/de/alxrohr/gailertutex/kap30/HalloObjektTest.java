/**
 * 
 */
package de.alxrohr.gailertutex.kap30;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Alexander Rohr
 *
 */
public class HalloObjektTest {

	/**
	 * Test method for {@link de.alxrohr.gailertutex.kap30.HalloObjekt#HalloObjekt(java.lang.String)}.
	 */
	@Test
	public void testHalloObjektString() {
		final String message = "getMessage returned the wrong string: ";

		final String testString = "Teststring";
		
		HalloObjekt hallo = new HalloObjekt( testString );
		assertEquals( message, testString, hallo.getGruss() );
	}

}
