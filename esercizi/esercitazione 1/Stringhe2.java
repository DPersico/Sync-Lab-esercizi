import java.util.Scanner;
public class Stringhe2 {

  public static void main(String[] args) {

    Scanner tastiera = new Scanner(System.in);

    System.out.println("Inserisci una stringa, ne verranno stampate le vocali");
    String stringa = tastiera.nextLine();

    System.out.println("Le vocali della stringa inserita sono :");
    for(int i = 0; i < stringa.length(); i++) {
      char lettera = stringa.charAt(i);
      switch (lettera){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
           System.out.print(lettera);
           break;
      }
    }
    System.out.println("");
  }
}
