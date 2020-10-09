import java.util.Scanner;
public class Cicli2 {

  public static void main(String[] args) {

    Scanner tastiera = new Scanner(System.in);

    int n = 1;
    int somma = 0;
    int i = 0;
    while(n != 0) {
      System.out.println("Inserisci un un numero (per terminare digita 0)");
      n = tastiera.nextInt();
      if((n % 3 == 0) && (n != 0)){
        somma += n;
        i++;
      }
    }

    if(i == 0) {
      System.out.println("Non hai inserito numeri divisibili per 3");
    }else {
    int media = somma / i;
    System.out.println("La media dei numeri divisibili per tre è : " + media);
    }
  }
}
