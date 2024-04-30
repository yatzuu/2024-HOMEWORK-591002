package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;

public class ComandoAiuto implements Comando{

	private IO io;
	static final public String[] elencoComandi = {"vai", "prendi", "posa", "fine", "aiuto", "guarda"};
	
	@Override
	public void esegui(Partita partita) {
		io.mostraMessaggio("Ecco i comandi che puoi utilizzare: ");
		io.mostraMessaggio("");
		
		for(int i=0; i< elencoComandi.length; i++) {
			io.mostraMessaggio(elencoComandi[i]);
		}
		io.mostraMessaggio("");
	}
	
	
	@Override
	public void setParametro(String parametro) {
	}

	@Override
	public String getParametro() {
		return null;
	}

	@Override
	public void setIo(IO io) {
		this.io = io;
	}

	@Override
	public String getNome() {
		return "aiuto";
	}
}
