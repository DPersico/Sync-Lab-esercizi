import java.util.InputMismatchException;
import java.util.Scanner;

public class ListaSpesa {

	public static void main(String[] args) {

	Scanner tastiera = new Scanner(System.in);

	Data odierna = new Data(14, 10, 2020);

	Data data1 = new Data(17, 10, 2020);
	ProdottiAlimentari mela = new ProdottiAlimentari("1A8721", "mela", 5, data1);
	Data data2 = new Data(27, 10, 2020);
	ProdottiAlimentari pizza = new ProdottiAlimentari("3R7891", "pizza", 8, data2);
	Data data3 = new Data(19, 10, 2020);
	ProdottiAlimentari pane = new ProdottiAlimentari("9T3412", "pane", 6, data3);
	Data data4 = new Data(20, 10, 2020);
	ProdottiAlimentari torta = new ProdottiAlimentari("8H2312", "torta", 30, data4);

	ProdottiAlimentari[] alimentari = {mela, pizza, pane, torta};

	ProdottiNonAlimentari sedia = new ProdottiNonAlimentari("1S1627", "sedia", 60, "plastica");
	ProdottiNonAlimentari specchio = new ProdottiNonAlimentari("3G8912", "specchio", 120, "vetro");
	ProdottiNonAlimentari libro = new ProdottiNonAlimentari("9P1234", "libro", 25, "carta");
	ProdottiNonAlimentari palla = new ProdottiNonAlimentari("2O1987", "palla", 30, "cuoio");

	ProdottiNonAlimentari[] nonAlimentari = {sedia, specchio, libro, palla};

	String tessera;
	do {
	System.out.println("Benvenuto");
	System.out.println("Possiede la tessera fedeltà?");
	System.out.println("(rispondere solo si o no)");
	tessera = tastiera.next();
	} while(!(tessera.equalsIgnoreCase("si") || (tessera.equalsIgnoreCase("no"))));

	boolean valida;
	int prodotti = 0;
	do {
		valida = true;
		System.out.println("Inserisci il numero di prodotti acquistati: ");
		System.out.println("(Deve essere un valore intero, massimo 20)");
		try {
		prodotti = tastiera.nextInt(); }
		catch (InputMismatchException e) {
		tastiera.nextLine();
		System.out.println("Non hai inserito un valore intero");
		valida = false; }
	}while(!valida || prodotti > 20);

	System.out.println("");
	System.out.println("Inserisci ora i prodotti");

	int contoTot = 0;
	for(int i = 0; i < prodotti; i++) {

		String scelta = "";
		while(!((scelta.equalsIgnoreCase("alimentare") || (scelta.equalsIgnoreCase("non")) || (scelta.equalsIgnoreCase("stop"))))) {
			System.out.println("");
			System.out.println("Il prodotto è alimentare o non?");
			System.out.println("digita <  alimentare  > o <  non  >  (per terminare: stop)");
			scelta = tastiera.next();
		}

		if(scelta.equalsIgnoreCase("stop")){
			System.out.println("Il conto totale è : " + contoTot);
			System.exit(1);
		}

		String cibo;
		if(scelta.equalsIgnoreCase("alimentare")) {
			do {
				System.out.println("Che prodotto è ?");
				System.out.println("tra: pizza | pane | mela | torta");
				cibo = tastiera.next();
			}while(!((cibo.equalsIgnoreCase("pizza")||(cibo.equalsIgnoreCase("pane"))||(cibo.equalsIgnoreCase("torta")||(cibo.equalsIgnoreCase("mela"))))));

			for(int j = 0; j < alimentari.length; j++) {
				if (alimentari[j].getDescrizione().equalsIgnoreCase(cibo)) {
					if (tessera.equalsIgnoreCase("si")) {
						int prezzoScontato = alimentari[j].applicaSconto();
						contoTot += prezzoScontato;
					}else {
						contoTot += alimentari[j].getPrezzo();
						System.out.println("prezzo : " + alimentari[j].getPrezzo());
					}

				}

			}
		}

		String articolo;
		if(scelta.equalsIgnoreCase("non")) {
			do {
				System.out.println("Che prodotto è?");
				System.out.println("tra:  sedia | specchio | libro | palla");
				articolo = tastiera.next();
			} while(!((articolo.equalsIgnoreCase("sedia")||(articolo.equalsIgnoreCase("specchio"))||(articolo.equalsIgnoreCase("libro")||(articolo.equalsIgnoreCase("palla"))))));

		for(int z = 0; z < nonAlimentari.length; z++) {
			if (nonAlimentari[z].getDescrizione().equalsIgnoreCase(articolo)) {
				if (tessera.equalsIgnoreCase("si")) {
					int prezzoScontato = nonAlimentari[z].applicaSconto();
					contoTot += prezzoScontato;
				}else {
					contoTot += nonAlimentari[z].getPrezzo();
					System.out.println("prezzo : " + nonAlimentari[z].getPrezzo());
				}

		}
		}
	}

		System.out.println("Il conto totale è : " + contoTot);
}
}
}
