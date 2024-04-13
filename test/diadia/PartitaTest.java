package diadia;

import static org.junit.Assert.*;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Stanza;

import org.junit.Test;

public class PartitaTest {
	
	Partita p = new Partita();
	Stanza s = new Stanza("Stanza");
	
	
	@Test
	public void testGetStanzaVincente() {
		assertEquals("Laboratorio Campus", p.getLabirinto().getStanzaVincente().getNome());
	}
	
	@Test
	public void testSetStanzaCorrente() {
		p.getLabirinto().setStanzaCorrente(s);
		assertEquals(s, p.getLabirinto().getStanzaCorrente());
	}

	@Test
	public void testIsFinita() {
		assertFalse(p.isFinita());
	}
	

}
