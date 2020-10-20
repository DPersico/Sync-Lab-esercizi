import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Esercizio1 {

	public static void main(String[] args) {
	
	// fatta con un immagine di prova sul desktop
		
	String fonte = "/Users/davidepersico/Desktop/prova.jpg";
	String destinazione = "/Users/davidepersico/Desktop/prova2.jpg";
	
	try {
		FileInputStream input = new FileInputStream(fonte);
		FileOutputStream out = new FileOutputStream(destinazione);
		byte[] buffer = new byte[1024];
		int length;
		while ((length = input.read(buffer)) > 0) {
			out.write(buffer, 0, length);
		}
	}
	catch(IOException e) {
		System.out.println(e);
	} 

	
	}
}
