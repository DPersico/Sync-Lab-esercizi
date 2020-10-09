import java.util.Scanner;
public class Esercizio1 {

  public static void main(String[] args) {

    int[] interi = {1, 6, 3, 2};
    ordina(interi);
    System.out.println(interi[0] + "," + interi[1] + "," + interi[2] + "," + interi[3]);

  }

  public static void ordina(int[] interi) {

   for (int i = 0; i < interi.length - 1; i++) {
      int pos = i;
      for (int j = i + 1; j < interi.length; j++) {
         if (interi[j] < interi[pos]){
            pos = j;
          }
      }
      int app = interi[pos];
      interi[pos] = interi[i];
      interi[i] = app;
    }
  }
}
