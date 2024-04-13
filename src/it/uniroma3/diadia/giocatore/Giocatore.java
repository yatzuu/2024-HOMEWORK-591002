package it.uniroma3.diadia.giocatore;

/*
 * La classe Giocatore rappresenta il protagonista del gioco.
 * Un giocatore ha un numero di CFU che rappresentano
 * la sua resistenza nel gioco e una borsa per raccogliere
 * gli attrezzi trovati nelle stanze.
 */

public class Giocatore {
	
		static final private int CFU_INIZIALI = 20;

		private int cfu;
		private Borsa borsa;
		
		public Giocatore(){
			this.cfu = CFU_INIZIALI;
			this.borsa = new Borsa();
		}

		public int getCfu() {
			return this.cfu;
		}

		public void setCfu(int cfu) {
			this.cfu = cfu;		
		}	
	
		public Borsa getBorsa() {
			return borsa;
		}
		
		public void setBorsa(Borsa borsa) {
			this.borsa = borsa;
		}

}
