package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class ComandoPosa implements Comando {
	private IO io;
	private String nomeAttrezzo;

	
	@Override
	public void esegui(Partita partita) {
	    if (partita.getLabirinto().getStanzaCorrente().getNumeroAttrezziPossibili() > 0) {
	        Attrezzo a = partita.getGiocatore().getBorsa().getAttrezzo(nomeAttrezzo);
	        if (a != null) {
	            partita.getLabirinto().getStanzaCorrente().addAttrezzo(a);
	            partita.getGiocatore().getBorsa().sottraiPesoAttrezzo(nomeAttrezzo);
	            partita.getGiocatore().getBorsa().removeAttrezzo(nomeAttrezzo);
	            io.mostraMessaggio("Attrezzo posato in " + partita.getLabirinto().getStanzaCorrente().getNome());
	            io.mostraMessaggio("");
	        } 
	    } else {
	        io.mostraMessaggio("Non c'e' spazio nella stanza per poter inserire questo attrezzo!");
	        io.mostraMessaggio("");
	    }
	    
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
