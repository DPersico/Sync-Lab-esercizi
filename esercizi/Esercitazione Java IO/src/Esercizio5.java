import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Esercizio5 {
	
	public static void main(String[] args) throws IOException {
		
		String nomeFile = "/Users/davidepersico/Desktop/testEs5.txt";
		
		try {
		FileWriter fw = new FileWriter(nomeFile);
		String stringa = "Sto svolgendo l' esercizio 5";
		
		for(int i = 0; i < stringa.length(); i++) {
			fw.write(stringa.charAt(i));
		}
		
		fw.write('\n');
		fw.close();
		}
		catch (IOException e) {
			System.out.println(e);
		}
		
		try {
		FileReader file = new FileReader(nomeFile);
		Scanner sc = new Scanner(file);
		sc = sc.useDelimiter("[ .,:;!?~()-]+");
		int k = 0;
		while(sc.hasNext()) {
			String ss = (String)sc.next();
			k++;
			System.out.println(k + " parola : " + ss);
		}
		}
		catch(IOException e) {
			System.out.println(e);
		}

	}

}
