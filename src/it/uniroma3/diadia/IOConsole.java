package it.uniroma3.diadia;
import java.util.Scanner;

/*
 * Classe che centralizza l’accesso a System.out/System.in 
 */

public class IOConsole {
	
	public void mostraMessaggio(String msg) {
		System.out.println(msg);
	}
	
	public String leggiRiga() {
		Scanner scannerDiLinee = new Scanner(System.in);
		String riga = scannerDiLinee.nextLine();
		
		return riga;
	}
}