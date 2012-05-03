/**
 * 
 */
package de.alxrohr.gailertutex.kap51;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * @author Alexander Rohr
 *
 */
public class HaustierTest {
	
	@Test
	public void testKatzeSpricht() {
		Katze alexKatze = new Katze("Harriet", Katze.WOHNUNGSKATZE, 3.0 );
		assertThat( alexKatze.sprich(), is( "Miau!" ));
	}
	
	@Test
	public void testKatzeToString() throws Exception {
		Katze alexKatze = new Katze("Harriet", Katze.WOHNUNGSKATZE, 3.0 );
		assertThat( alexKatze.toString(), is( "Wohnungskatze Harriet: 3.0 Einheiten" ));
	}
	
	@Test
	public void testKatzeTagesportion() throws Exception {
		Katze evaKatze = new Katze( "Spot", Katze.FREIGAENGER, 0.6 );
		evaKatze.friss();
		assertThat( evaKatze.futtervorrat, closeTo( 0.1, 1E-10 ) );
	}
	
	@Test
	public void testKatzeFrisstDenLetztenRest() {
		Katze alexKatze = new Katze( "Harriet", Katze.WOHNUNGSKATZE, 0.5 );
		alexKatze.friss();
		assertThat( alexKatze.futtervorrat, is( 0.0 ) );
	}
	
	@Test
	public void testKatzeFuttervorratNichtNegativ() throws Exception {
		Katze alexKatze = new Katze( "Harriet", Katze.WOHNUNGSKATZE, 0.4 );
		alexKatze.friss();
		assertThat( alexKatze.futtervorrat, is( 0.0 ) );
	}
	
	@Test
	public void testKatzeFuettern() throws Exception {
		Katze alexKatze = new Katze( "Harriet" , Katze.WOHNUNGSKATZE, 3 );
		alexKatze.fuettern();
		assertThat( alexKatze.futtervorrat, is( 0.0 ) );
	}
	
	@Test
	public void testHundSpricht() throws Exception {
		Hund alexHund = new Hund( "Mona" , Hund.KATEGORIE_MITTEL, 0.0 );
		assertThat( alexHund.sprich(), is( "Wau!" ));
	}
	
	@Test
	public void testHundToString() throws Exception {
		Hund alexHund = new Hund( "Mona" , Hund.KATEGORIE_MITTEL, 0.0 );
		assertThat( alexHund.toString(), is( "Mona (mittelgroﬂer Hund): 0.0 Einheiten" ));
	}
	
	@Test
	public void testHundTagesportion() throws Exception {
		Hund alexHund = new Hund( "kira", Hund.KATEGORIE_GROSS, 1.1 );
		alexHund.friss();
		assertThat( alexHund.futtervorrat, closeTo( 0.1, 1E-10 ));
	}

}
