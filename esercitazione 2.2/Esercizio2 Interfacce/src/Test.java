import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
	Scanner tastiera = new Scanner(System.in);
	
	PompaDiBenzina pompa1 = new PompaDiBenzina("Legnano", "Q8", 1000, 1000, 1, 1.323, 0);
	PompaDiBenzina pompa2 = new PompaDiBenzina("Milano", "Tamoil", 2000, 1500, 2, 1.412, 0);
	PompaDiBenzina pompa3 = new PompaDiBenzina("Milano", "Agip", 2000, 1000, 3, 1.398, 0);
	
	PompaDiBenzina[] distributori = {pompa1, pompa2, pompa3};
	
	int scelta = 0;
	boolean valida;
	do {
	System.out.println("In quale dei seguenti distributori ti vuoi recare?");
	System.out.println("(digita 1, 2 o 3)");
	System.out.println("1) " + pompa1.toString());
	System.out.println("2) " + pompa2.toString());
	System.out.println("3) " + pompa3.toString());
	valida = true;
	try {
	scelta = tastiera.nextInt(); }
	catch (InputMismatchException e) {
	tastiera.nextLine();
	System.out.println("Non hai inserito un valore valido!");
	valida = false;
	}
	} while (!valida || scelta < 1 || scelta > 3);
	
	int azione = -1;
	while(azione != 0) {
		do {
			System.out.println("");
			System.out.println("Quale azione vuoi compiere?");
			System.out.println("1) fai rifornimento");
			System.out.println("2) visualizza incassi totali");
			System.out.println("3) visualizza benzina rimanente nel distributore");
			System.out.println("4) compara capacità con un altro distributore");
			System.out.println("0) esci");
			valida = true;
			try {
			azione = tastiera.nextInt(); }
			catch (InputMismatchException e) {
			tastiera.nextLine();
			System.out.println("Non hai inserito un valore valido!");
			valida = false;
			}
			} while (!valida || azione < 0 || azione > 4);
		switch(azione) {
		case 1 :
			int soldi = 0;
			do {
				System.out.println("Digita l' importo che vuoi inserire");
				System.out.println("(massimo 1000 euro)");
				valida = true;
				try {
				soldi = tastiera.nextInt(); }
				catch (InputMismatchException e) {
				tastiera.nextLine();
				System.out.println("Non hai inserito un valore valido!");
				valida = false;
				}
				} while (!valida || soldi > 1000);
			distributori[scelta-1].faiRifornimento(soldi);
			break;
		case 2 : 
			System.out.println("Incasso di oggi : " + distributori[scelta-1].getIncassi() + " euro");
			break;
		case 3 :
			System.out.println("Rimangono " + distributori[scelta-1].getBenzina() + " litri di benzina");
			break;
		case 4 :
			int numero = 0;
			do {
				System.out.println("Con quale distributore vuoi comparare?");
				valida = true;
				try {
				numero = tastiera.nextInt(); }
				catch (InputMismatchException e) {
				tastiera.nextLine();
				System.out.println("Non hai inserito un valore valido!");
				valida = false;
				}
				} while (!valida || numero < 1 || numero > 3);
			System.out.println("La differenza di capacità è : " + distributori[scelta-1].compareTo(distributori[numero-1]));
			break;
		}
		
	}
	
	System.out.println("Arrivederci");
	}
}
