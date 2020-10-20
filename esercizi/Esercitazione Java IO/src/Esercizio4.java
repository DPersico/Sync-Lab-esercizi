import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Esercizio4 {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String nomeFile = "/Users/davidepersico/Desktop/testEs4.txt";
		
		try {
		FileOutputStream fos = new FileOutputStream(nomeFile);
		ObjectOutputStream out = new ObjectOutputStream(fos);

		Impiegato i1 = new Impiegato("Lorenzo", "Cattaneo", 7123, 1700);
		Impiegato i2 = new Impiegato("Franco", "Rossi", 6512, 1450);
		Impiegato i3 = new Impiegato("Marco", "Bianchi", 1243, 1200);
		
		out.writeObject(i1);
		out.writeObject(i2);
		out.writeObject(i3);
		
		out.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
		try {
		FileInputStream fis = new FileInputStream(nomeFile);
		ObjectInputStream in = new ObjectInputStream(fis);
		
		Impiegato i4 = (Impiegato)in.readObject();
		Impiegato i5 = (Impiegato)in.readObject();
		Impiegato i6 = (Impiegato)in.readObject();
		
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);
		
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
		
}
