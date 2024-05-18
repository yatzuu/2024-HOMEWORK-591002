package it.uniroma3.diadia.comandi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import fixture.Fixture;
import it.uniroma3.diadia.DiaDia;
import it.uniroma3.diadia.IOSimulator;


public class ComandoAiutoTest {

	List<String> righeDaLeggere;

	@Before
	public void setUp() {
		righeDaLeggere = new ArrayList<>();
	}

	@Test
	public void testPartitaConComandoAiuto() {
		righeDaLeggere.add("aiuto");
		righeDaLeggere.add("fine");
		IOSimulator io = Fixture.creaSimulazionePartitaEGiocaEasy(righeDaLeggere);
		
		assertTrue(io.hasNextMessaggio());
		assertEquals(DiaDia.MESSAGGIO_BENVENUTO, io.nextMessaggio());
		
		for(int i=0; i < ComandoAiuto.elencoComandi.length + 2; i++) {
			if (i == 0) {	//Prima di leggere i comandi aiuto è presente il messaggio "Ecco i comandi che puoi utilizzare: "
				assertTrue(io.hasNextMessaggio());		
				assertEquals("Ecco i comandi che puoi utilizzare: ", io.nextMessaggio());
			} else if (i == 1) {	//Dopo presente spazio tra messaggio e comandi
				assertTrue(io.hasNextMessaggio());
				assertEquals("", io.nextMessaggio());
			} else {
				assertTrue(io.hasNextMessaggio());
				assertEquals(ComandoAiuto.elencoComandi[i-2], io.nextMessaggio());
			}
		}
		
		assertTrue(io.hasNextMessaggio());
		io.nextMessaggio();
		assertEquals("Grazie di aver giocato!", io.nextMessaggio());
	}
}
