import java.util.Scanner;
public class Array3 {

  public static void main(String[] args) {

    Scanner tastiera = new Scanner(System.in);
    int[] interi = new int[10];

    System.out.println("Inserisci 10 numeri casuali");
    for(int i = 0; i < 10; i++) {
      interi[i] = tastiera.nextInt();
    }

    boolean consecutivi = false;
    for(int i = 0; i < 8; i++) {
      if((interi[i] == interi[i+1]) && (interi[i+1] == interi[i+2])){
        consecutivi = true;
      }
    }

    if(consecutivi == true) {
      System.out.println("Tre valori consecutivi uguali");
    }else System.out.println("NO");

  }
}
