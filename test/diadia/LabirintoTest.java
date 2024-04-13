package diadia;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;

public class LabirintoTest {

	private Labirinto labirinto;
	private Stanza laboratorio;
	private Stanza N11;
	
	
	@Before
	public void setUp() {
		labirinto = new Labirinto();
		labirinto.creaStanze();
		laboratorio = new Stanza ("Laboratorio Campus");
		N11 = new Stanza ("N11");
	}
	
	
	@Test
	public void testGetStanzaVincente() {
		assertEquals("Laboratorio Campus", labirinto.getStanzaVincente().getNome());	
	}

	@Test
	public void testSetStanzaCorrente() {
		labirinto.setStanzaCorrente(N11);
		assertEquals(N11, labirinto.getStanzaCorrente());
	}
	@Test
	public void testGetStanzaCorrente() {
		assertEquals("Atrio", labirinto.getStanzaCorrente().getNome());
	}
}

