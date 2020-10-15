import java.util.InputMismatchException;
import java.util.Scanner;

public class LettoreMultimediale {
	
	public static void main(String[] args) {
		
	Scanner tastiera = new Scanner(System.in);
	
	ElementoMultimediale[] elementi = new ElementoMultimediale[5];
	
	for(int i = 0; i < 5; i++) {
	 String daInserire;
	 do {
		System.out.println("Che elemento vuoi inserire? seleziona tra: Filmato - Audio - Immagine");
		daInserire = tastiera.next();
	} while(!((daInserire.equalsIgnoreCase("filmato") || (daInserire.equalsIgnoreCase("audio")) || (daInserire.equalsIgnoreCase("immagine")))));
	
	if(daInserire.equalsIgnoreCase("filmato")) {
		
		String titoloInput;
		System.out.println("Inserisci il titolo del filmato: ");
		titoloInput = tastiera.next();
		
		int durataInput = 0;
		boolean valida;
		do {
		valida = true;
		System.out.println("Inserisci la durata del filmato: ");
		System.out.println("(Deve essere un valore intero)");
		try {
		durataInput = tastiera.nextInt(); }
		catch (InputMismatchException e) {
		tastiera.nextLine();
		System.out.println("Non hai inserito un valore intero");
		valida = false;
		}
		} while (!valida);
		
		int volumeInput = 0;
		boolean corretta;
		do {
		corretta = true;
		System.out.println("Inserisci il volume: ");
		System.out.println("(Deve essere un valore intero)");
		try {
		volumeInput = tastiera.nextInt(); }
		catch (InputMismatchException e) {
		tastiera.nextLine();
		System.out.println("Non hai inserito un valore intero");
		corretta = false;
		}
		} while (!corretta);
		
		int luminositàInput = 0;
		boolean ok;
		do {
		ok = true;
		System.out.println("Inserisci la luminosità: ");
		System.out.println("(Deve essere un valore intero)");
		try {
		luminositàInput = tastiera.nextInt(); }
		catch (InputMismatchException e) {
		tastiera.nextLine();
		System.out.println("Non hai inserito un valore intero");
		ok = false;
		}
		} while (!ok);
		
		elementi[i] = new Filmato(titoloInput, durataInput, volumeInput, luminositàInput);

	}
	
	if(daInserire.equalsIgnoreCase("audio")) {
		
		String titoloInput;
		System.out.println("Inserisci il titolo dell' audio: ");
		titoloInput = tastiera.next();
		
		int durataInput = 0;
		boolean valida;
		do {
		valida = true;
		System.out.println("Inserisci la durata dell' audio: ");
		System.out.println("(Deve essere un valore intero)");
		try {
		durataInput = tastiera.nextInt(); }
		catch (InputMismatchException e) {
		tastiera.nextLine();
		System.out.println("Non hai inserito un valore intero");
		valida = false;
		}
		} while (!valida);
		
		int volumeInput = 0;
		boolean corretta;
		do {
		corretta = true;
		System.out.println("Inserisci il volume: ");
		System.out.println("(Deve essere un valore intero)");
		try {
		volumeInput = tastiera.nextInt(); }
		catch (InputMismatchException e) {
		tastiera.nextLine();
		System.out.println("Non hai inserito un valore intero");
		corretta = false;
		}
		} while (!corretta);
		
		elementi[i] = new RegistrazioneAudio(titoloInput, durataInput, volumeInput);

	}
	
	if(daInserire.equalsIgnoreCase("immagine")) {
		
		String titoloInput;
		System.out.println("Inserisci il titolo dell' immagine: ");
		titoloInput = tastiera.next();
		
		int luminositàInput = 0;
		boolean ok;
		do {
		ok = true;
		System.out.println("Inserisci la luminosità: ");
		System.out.println("(Deve essere un valore intero)");
		try {
		luminositàInput = tastiera.nextInt(); }
		catch (InputMismatchException e) {
		tastiera.nextLine();
		System.out.println("Non hai inserito un valore intero");
		ok = false;
		}
		} while (!ok);
		
		elementi[i] = new Immagine(titoloInput, luminositàInput);

	}
	}
	
	int input = -1;
	boolean ok = true;
	while(ok) {
		boolean valida;
		do {
			System.out.println("");
			System.out.println("Quale elemento che hai inserito vuoi riprodurre?");
			System.out.println("Digita un numero da 1 a 5 (se vuoi terminare digita 0)");
			System.out.println("");
		valida = true;
		try {
			input = tastiera.nextInt(); }
		catch (InputMismatchException e) {
			tastiera.nextLine();
			System.out.println("Non hai inserito un numero intero");
			valida = false;
		}
		} while (!valida || input < 0 || input > 5);
		
		switch(input) {
		case 1 : 
			elementi[0].apri();
			break;
		case 2 : 
			elementi[1].apri();
			break;
		case 3 : 
			elementi[2].apri();
			break;
		case 4 :
			elementi[3].apri();
			break;
		case 5 : 
			elementi[4].apri();
			break;
		case 0 : 
			System.exit(1);
		}
		
		String scelta1= "";
		while(!(scelta1.equalsIgnoreCase("si") || (scelta1.equalsIgnoreCase("no")))) {
			System.out.println("Vuoi modificare qualcosa? (rispondere solo si o no)");
			scelta1 = tastiera.next();
		} 
		
		String scelta2 = "";
		while(!(scelta2.equalsIgnoreCase("si") || (scelta2.equalsIgnoreCase("no")))) {
			System.out.println("Vuoi modificare la luminosità? ");
			System.out.println("(rispondere solo si o no)");
			scelta2 = tastiera.next();
		} 
		
		String modifica1 = "";
		if(scelta2.equalsIgnoreCase("si")) {
			System.out.println("Digita:  +luminosità | -luminosità");
			modifica1 = tastiera.next();
			if(modifica1.equalsIgnoreCase("+luminosità")) {
			elementi[input - 1].piùLuminosità();
			elementi[input - 1].apri();
			}else if(modifica1.equalsIgnoreCase("-luminosità")) {
				elementi[input - 1].menoLuminosità();
				elementi[input-1].apri(); 
				}
			}
		
		String scelta3 = "";
		while(!(scelta3.equalsIgnoreCase("si") || (scelta3.equalsIgnoreCase("no")))) {
			System.out.println("Vuoi modificare il volume? ");
			System.out.println("(rispondere solo si o no)");
			scelta3 = tastiera.next();
		}
		
		String modifica2 = "";
		if(scelta3.equalsIgnoreCase("si")) {
			System.out.println("Digita:  +volume | -volume");
			modifica2 = tastiera.next();
			if(modifica2.equalsIgnoreCase("+volume")) {
			elementi[input - 1].piùVolume();
			elementi[input - 1].apri();
			}else if(modifica1.equalsIgnoreCase("-volume")) {
				elementi[input - 1].menoVolume();
				elementi[input-1].apri(); 
				}
			}
	}

	}
}
