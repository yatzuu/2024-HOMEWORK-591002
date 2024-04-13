package diadia;

import static org.junit.Assert.*;

import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.giocatore.Borsa;

import org.junit.Before;
import org.junit.Test;

public class BorsaTest {
	
	Borsa b = new Borsa();
	Attrezzo torcia;
	Attrezzo spada;
	
	@Before
	public void setUp() {
		torcia = new Attrezzo("torcia", 5);
		spada = new Attrezzo("spada", 14);
	}

	@Test
	public void testAddAttrezzoPesoMinoreDiDieci() {
		assertTrue(b.addAttrezzo(torcia));

	}
	
	@Test
	public void testAddAttrezzoPesoMaggioreDiDieci() {
		assertFalse(b.addAttrezzo(spada));

	}
	
	@Test
	public void testGetPeso() {
		b.addAttrezzo(torcia);
		assertEquals(torcia, b.getAttrezzo("torcia"));

	}
}
