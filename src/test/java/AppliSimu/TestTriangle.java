package AppliSimu;


import static org.junit.Assert.*;

import DomaineVoiture.Voiture;
import org.junit.Before;
import org.junit.Test;

public class TestTriangle {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testConversionMetresPixels() {

        final Voiture maVoiture = new Voiture (100, 0, 10);

		IHMVoiture monTriangle = new IHMVoiture(maVoiture);
		
		int xPixels = monTriangle.calculerPositionPixels(110);
		
		assertEquals(55, xPixels);
	}

}
