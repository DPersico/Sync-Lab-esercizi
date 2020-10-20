import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Esercizio3 {
	
	public static void main(String[] args) {
		
		//stampo su un file di testo testEs3 20.0 e lo rileggo
		
		String nomeFile = "/Users/davidepersico/Desktop/testEs3.txt";
		
		try {
			FileOutputStream fos = new FileOutputStream(nomeFile);
			DataOutputStream dos = new DataOutputStream(fos);
			double n = 20.0;
			dos.writeDouble(n);
		
			fos.close();
		}
		catch (IOException e) {
			System.out.println(e);
		}
		
		try {
			FileInputStream fis = new FileInputStream(nomeFile);
			DataInputStream dis = new DataInputStream(fis);
			double d = dis.readDouble();
			System.out.println("il double scritto è : " + d);
			
			fis.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
		
}
