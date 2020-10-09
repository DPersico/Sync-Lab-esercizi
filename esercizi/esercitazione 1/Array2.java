import java.util.Scanner;

public class Array2 {

  public static void main(String[] args){

  Scanner tastiera = new Scanner(System.in);
  int[] interi = new int[10];

  System.out.println("Inserisci 10 numeri interi casuali: ");
  for(int i = 0; i < 10; i++) {
    interi[i] = tastiera.nextInt();
  }

  int SommaPari = 0;
  for(int i = 0; i < 10; i += 2) {
    SommaPari += interi[i];
  }

  int SommaDispari = 0;
  for(int i = 1; i < 10; i += 2) {
    SommaDispari += interi[i];
  }

  if(SommaPari == SommaDispari){
    System.out.println("Pari e dispari uguali");
  } else System.out.println("Pari e dispari diversi");

}
}
