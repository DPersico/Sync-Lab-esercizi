import java.io.FileReader;
import java.io.IOException;

public class Esercizio2 {
	
	public static void main(String[] args) {
		
		//fatta con un file di testo testEs2.txt sul desktop
		
		String nomeFile = "/Users/davidepersico/Desktop/testEs2.txt";
		
		try {
			FileReader input = new FileReader(nomeFile);
			int prossimo;
			do {
				prossimo = input.read();
				if (prossimo != -1) {
					char prossimoCarattere = (char) prossimo;
					System.out.print(prossimoCarattere);
				}
			}while(prossimo != -1);
			
			input.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
