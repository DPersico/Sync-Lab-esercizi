import java.util.Scanner;
public class Stringhe3 {

  public static void main(String[] args) {

    Scanner tastiera = new Scanner(System.in);

    int lunghezza = 0;
    System.out.println("Inserisci una sequenza di stringhe terminata da una stringa vuota");
    String stringa = tastiera.nextLine();

    if(!stringa.equals("")) {
      while(!stringa.equals("")) {
        if((stringa.charAt(0) >= 'A') && (stringa.charAt(0) <= 'Z')) {
          lunghezza += stringa.length();
        }
        stringa = tastiera.nextLine();
      }
    }


    System.out.println("La somma della lunghezza delle stringhe che inizano con una maiuscola è :");
    System.out.println(lunghezza);

  }
}
