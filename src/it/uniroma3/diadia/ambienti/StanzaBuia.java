package it.uniroma3.diadia.ambienti;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaBuia extends Stanza{
	
	private String attrezzoLuce;
	
	public StanzaBuia(String nome, String attrezzoLuce) {
		super(nome);
		this.attrezzoLuce = attrezzoLuce;
	}

	@Override
	public String getDescrizione() {
		String buio = new String();
		buio = "Qui c'è un buio pesto \nPotresti usare " + attrezzoLuce + " per illuminare la stanza ";
		if(!this.hasAttrezzo(attrezzoLuce))
			return buio;
		return super.getDescrizione();
	} 
}
