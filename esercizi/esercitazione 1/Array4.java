import java.util.Scanner;
public class Array4 {

  public static void main(String[] args) {

    Scanner tastiera = new Scanner(System.in);
    String[] sequenza1 = new String[5];
    String[] sequenza2 = new String[5];

    System.out.println("Inserisci 5 stringhe per la prima sequenza");
    for(int i = 0; i < 5; i++) {
      sequenza1[i] = tastiera.next();
    }

    System.out.println("Inserisci 5 stringhe per la seconda sequenza");
    for(int i = 0; i < 5; i++) {
      sequenza2[i] = tastiera.next();
    }

    boolean compare = false;
    for(int i = 0; i < 5; i++) {
      for(int j = 0; j < 5; j++) {
        if(sequenza1[i].equals(sequenza2[j])) {
          compare = true;
        }
      }
    }

    if(compare == true){
      System.out.println("OK");
    }else System.out.println("KO");
  }
}
