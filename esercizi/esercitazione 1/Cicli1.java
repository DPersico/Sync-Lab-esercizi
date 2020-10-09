import java.util.Scanner;
public class Cicli1 {

  public static void main(String[] args) {

    Scanner tastiera = new Scanner(System.in);

    boolean corretta = true;
    int n = 1;
    while(n != 0){
      System.out.println("Inserisci un numero (per terminare digita 0): ");
      n = tastiera.nextInt();
      if((n < 0) || (n % 2 != 0)) {
        corretta = false;
      }
    }

    if(corretta == true) {
      System.out.println("Tutti positivi pari");
    } else System.out.println("NO");
  }
}
