package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.Partita;


public class ComandoPosa implements Comando{
	private IO io;
	private String nomeAttrezzo;
	
	@Override
	public void esegui (Partita partita) {
		
		Attrezzo a = partita.getGiocatore().getBorsa().getAttrezzo(nomeAttrezzo);
		
		if((10 - partita.getLabirinto().getStanzaCorrente().numAttrezzi()) > 0) {	
			partita.getLabirinto().getStanzaCorrente().addAttrezzo(a);
			partita.getGiocatore().getBorsa().removeAttrezzo(nomeAttrezzo);
			io.mostraMessaggio("Attrezzo posato nella stanza");
		} else {
			io.mostraMessaggio("Non c'è spazio nella stanza per posare l'oggetto ");
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
		return "posa";
	}
}
