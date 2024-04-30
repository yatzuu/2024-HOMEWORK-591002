package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.Partita;


public class ComandoPrendi implements Comando{
	private IO io;
	private String nomeAttrezzo;
	
	@Override
	public void esegui (Partita partita) {
		Attrezzo a = partita.getLabirinto().getStanzaCorrente().getAttrezzo(nomeAttrezzo);
		if(partita.getGiocatore().getBorsa().getPesoRimanente(a)) {	
			partita.getGiocatore().getBorsa().addAttrezzo(a);
			partita.getLabirinto().getStanzaCorrente().removeAttrezzo(a);
			io.mostraMessaggio("Attrezzo messo nella borsa");
	
		} else if (partita.getLabirinto().getStanzaCorrente().getAttrezzo(nomeAttrezzo) == null) {
			io.mostraMessaggio("Attrezzo non presente nella stanza");
		} else {
			io.mostraMessaggio("Attrezzo troppo pesante per entrare nella borsa ");
		}
		io.mostraMessaggio("");
	}
	
	@Override
	public void setParametro(String parametro) {
		this.nomeAttrezzo  = parametro;

	}

	@Override
	public String getParametro() {
		return this.nomeAttrezzo;
	}

	@Override
	public void setIo(IO io) {
		this.io = io;
	}

	@Override
	public String getNome() {
		return "prendi";
	}
}
