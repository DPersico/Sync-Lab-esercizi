import java.util.Scanner;
public class Stringhe1 {

  public static void main(String[] args) {

    Scanner tastiera = new Scanner(System.in);

    System.out.println("Inserisci una stringa che verrà invertita: ");
    String stringa = tastiera.nextLine();

    System.out.println("La stringa invertita è : ");
    for(int i = stringa.length() - 1; i >= 0; i--) {
      System.out.print(stringa.charAt(i));
    }
  }
}
