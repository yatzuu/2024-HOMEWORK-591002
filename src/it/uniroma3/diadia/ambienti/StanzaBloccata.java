package it.uniroma3.diadia.ambienti;

public class StanzaBloccata extends Stanza{
	private String passepartout;
	private String direzioneBloccata;
	
	public StanzaBloccata(String nome, String direzioneBloccata, String passepartout) {
		super(nome);
		this.passepartout = passepartout;
		this.direzioneBloccata = direzioneBloccata;
	}

	@Override
	public Stanza getStanzaAdiacente(String direzione) {
		if(direzioneBloccata.equals(direzione) && !this.hasAttrezzo(passepartout)) {
			return this;
		}
		return super.getStanzaAdiacente(direzione);
	}
	
	@Override
	public String getDescrizione() {
		String bloccata = "Stanza bloccata nella direzione: "+ direzioneBloccata +"\nPrendi " + passepartout  + " e posalo nella stanza";

		if(!this.hasAttrezzo(passepartout))
			return bloccata;
		return super.getDescrizione();
	}
}

