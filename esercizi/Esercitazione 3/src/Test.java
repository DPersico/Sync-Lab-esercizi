import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws BevandaNonValidaException, TesseraNonValidaException, CreditoInsufficienteException, BevandaEsauritaException {
		
		Scanner tastiera = new Scanner(System.in);
		
		double val = 0.0;
		DecimalFormat df = new DecimalFormat("0.00");
		String str = df.format(val);
		
		DistributoreDiBevande d = new DistributoreDiBevande();
		
		Bevanda Acqua = new Bevanda("A", 0.2, "Acqua");
		Bevanda Coca = new Bevanda("B", 0.3, "Coca");
		Bevanda Birra = new Bevanda("C", 1.0, "Birra");
		
		d.aggiungiBevanda(Acqua);
		d.aggiungiBevanda(Coca);
		d.aggiungiBevanda(Birra);
		
		Tessera t1 = new Tessera(12, 5.5);
		Tessera t2 = new Tessera(21, 10.0);
		Tessera t3 = new Tessera(99, 0.75);
		
		d.registraTessera(t1);
		d.registraTessera(t2);
		d.registraTessera(t3);
		
		Colonna c1 = new Colonna(1);
		c1.aggiornaColonna(1, "Acqua", 40);
		Colonna c2 = new Colonna(2);
		c2.aggiornaColonna(2, "Coca", 1);
		Colonna c3 = new Colonna(3);
		c3.aggiornaColonna(3, "Birra", 50);
		Colonna c4 = new Colonna(4);
		c4.aggiornaColonna(4, "Acqua", 50);
		
		d.aggiungiColonna(c1);
		d.aggiungiColonna(c2);
		d.aggiungiColonna(c3);
		d.aggiungiColonna(c4);
		
		int scelta = -1;
		while(scelta != 0) {
		System.out.println("");
		System.out.println("DISTRIBUTORE AUTOMATICO");
		System.out.println("1) Chiedi info sulle bevande");
		System.out.println("2) Leggi credito della tessera");
		System.out.println("3) Lattine disponibili");
		System.out.println("4) Eroga");
		System.out.println("0) esci");
	
		boolean valida;
		do {
			valida = true;
			System.out.println("Cosa desideri fare?");
			try {
			scelta = tastiera.nextInt(); 
			}
			catch (InputMismatchException e) {
			tastiera.nextLine();
			System.out.println("Non hai inserito un valore intero");
			valida = false;
			}
			} while ((!valida) || (scelta < 0) || (scelta > 4));
		
		switch(scelta) {
		case 1 :
			System.out.println("");
			boolean valida1;
			do {
				System.out.println("Inserisci il codice :");
				System.out.println("(A acqua | B Coca | C Birra )");
				try {
					valida1 = true;
					String scelta1 = tastiera.next();
					d.scegliBevanda(scelta1);
				}
				catch (BevandaNonValidaException e) {
					tastiera.nextLine();
					System.out.println("Il codice da te inserito non corrisponde ad alcuna bevanda");
					valida1 = false;
				}
			} while(!valida1);
			break;
		case 2 :
			System.out.println("");
			System.out.println("Tessere registrate: 12 | 21 | 99");
			boolean valida2;
			int scelta2;
			do {
				valida2 = true;
				System.out.println("Inserisci il codice della tessera :");
				try {
					scelta2 = tastiera.nextInt();
					d.leggiCredito(scelta2);
				}
				catch (InputMismatchException e) {
					tastiera.nextLine();
					System.out.println("Non hai inserito un valore intero");
					valida2 = false;
				}
				catch (TesseraNonValidaException e) {
					tastiera.nextLine();
					System.out.println("Il codice da te inserito non corrisponde ad alcuna tessera registrata");
					valida2 = false;
				}
			} while ((!valida2));
			break;
		case 3 :
			System.out.println("");
			System.out.println("Scegli la bibita di cui vuoi sapere le lattine disponibili");
			boolean valida3;
			String scelta3;
			do {
				valida3 = true;
				System.out.println("Inserisci il codice :");
				System.out.println("(A acqua | B Coca | C Birra )");
				try {
					scelta3 = tastiera.next();
					d.scegliBevanda(scelta3);
					System.out.println("Lattine disponibili : " + d.lattineDisponibili(scelta3));
				}
				catch (BevandaNonValidaException e) {
					tastiera.nextLine();
					System.out.println("Il codice da te inserito non corrisponde ad alcuna bevanda");
					valida3 = false;
				}
				}while(!valida3);
			break;
		case 4 :
			System.out.println("");
			System.out.println("Scegli la bibita da erogare");
			boolean valida4;
			String scelta4 = "";
			do {
				valida4 = true;
				System.out.println("Inserisci il codice della bibita :");
				System.out.println("(A acqua | B Coca | C Birra )");
				try {
					scelta4 = tastiera.next();
					d.scegliBevanda(scelta4);
				}
				catch (BevandaNonValidaException e) {
					tastiera.nextLine();
					System.out.println("Il codice da te inserito non corrisponde ad alcuna bevanda");
					valida4 = false;
				}
				}while(!valida4);
			
			boolean valida5;
			int scelta5 = 0;
			do {
				valida5 = true;
				System.out.println("Inserisci il codice della tessera con cui vuoi pagare :");
				System.out.println("Tessere registrate: 12 | 21 | 99");
				try {
					scelta5 = tastiera.nextInt();
					d.leggiCredito(scelta5);
				}
				catch (InputMismatchException e) {
					tastiera.nextLine();
					System.out.println("Non hai inserito un valore intero");
					valida5 = false;
				}
				catch (TesseraNonValidaException e) {
					tastiera.nextLine();
					System.out.println("Il codice da te inserito non corrisponde ad alcuna tessera registrata");
					valida5 = false;
				}
			}while(!valida5);
				
			try {
				System.out.println("La bibita viene erogata dalla colonna : " + d.eroga(scelta4, scelta5));
			}
			catch (CreditoInsufficienteException e){
				tastiera.nextLine();
				System.out.println("Il credito nella tua tessera non è sufficiente!");
			}
			catch (BevandaEsauritaException e) {
				tastiera.nextLine();
				System.out.println("La bevanda da te selezionata è esaurita!");
			}
			break;
		  }
	
		}
		System.out.println("Arrivederci");
		}
	}