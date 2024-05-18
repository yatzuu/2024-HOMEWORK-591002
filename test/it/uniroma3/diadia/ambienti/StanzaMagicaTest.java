package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaMagicaTest {

	private StanzaMagica s1;
	private Attrezzo p;
	private Attrezzo m;
	private Attrezzo v;
	
	@Before
	public void setUp(){
		s1 = new StanzaMagica("s1");
		p = new Attrezzo("pala", 33);
		m = new Attrezzo("martello", 42);
		v = new Attrezzo("vanga", 42);
	}

	@Test
	public void testAddAttrezzo() {
		assertTrue(s1.addAttrezzo(m));

	}


	@Test
	public void testModificaAttrezzo() {
		assertTrue(s1.addAttrezzo(p));
		assertTrue(s1.addAttrezzo(v));
		assertTrue(s1.addAttrezzo(m));
		}
}
