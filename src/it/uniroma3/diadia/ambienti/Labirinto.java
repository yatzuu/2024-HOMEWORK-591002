package it.uniroma3.diadia.ambienti;

/**
 * Questa classe modella crea la mappa del labirinto 
 *
 * @author  io 
 * @see Stanza
 * @version base
 */

public class Labirinto {
	private Stanza stanzaCorrente;
	private Stanza stanzaVincente;
	

    public static LabirintoBuilder newBuilder() {
    	return new LabirintoBuilder();
    }

	public Stanza getStanzaVincente() {
		return stanzaVincente;
	}
	
	public void setStanzaVincente(Stanza stanzaVincente) {
		this.stanzaVincente = stanzaVincente;
	}
	
	public void setStanzaCorrente(Stanza stanzaCorrente) {
		this.stanzaCorrente = stanzaCorrente;
	}

	public Stanza getStanzaCorrente() {
		return this.stanzaCorrente;
	}
	
}
