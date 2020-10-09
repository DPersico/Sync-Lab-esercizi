import java.util.Scanner;
public class Cicli3 {

  public static void main(String[] args) {

    Scanner tastiera = new Scanner(System.in);

    for(int i = 0; i < 5; i++){
      System.out.println("Quanti caratteri vuoi inserire?");
      int n = tastiera.nextInt();

      for(int j = 0; j < n; j++){
        System.out.println("Inserisci il carattere : ");
        char carattere = tastiera.next().charAt(0);
        System.out.println("Ristampo : " + carattere);
      }
    }
  }
}
