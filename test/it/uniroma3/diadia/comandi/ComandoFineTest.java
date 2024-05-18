package it.uniroma3.diadia.comandi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.DiaDia;
import it.uniroma3.diadia.IOSimulator;
import fixture.Fixture;

public class ComandoFineTest {

	List<String> righeDaLeggere;

	@Before
	public void setUp() {
		righeDaLeggere = new ArrayList<>();
	}

	@Test
	public void testPartitaConComandoFine() {
		righeDaLeggere.add("fine");

		IOSimulator io = Fixture.creaSimulazionePartitaEGiocaEasy(righeDaLeggere);
		assertTrue(io.hasNextMessaggio());
		assertEquals(DiaDia.MESSAGGIO_BENVENUTO, io.nextMessaggio());
		assertTrue(io.hasNextMessaggio());
		assertEquals("Grazie di aver giocato!", io.nextMessaggio());

	}

}
