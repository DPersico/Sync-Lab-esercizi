public class Esercizio4 {

  public static void faiLaTrasposta(int a[][], int trasposta[][]) {

    for(int i = 0; i < a.length; i++) {
      for(int j = 0; j < a[i].length; j++)
          trasposta[i][j] = a[i][j];
    }

    System.out.println("La matrice di partenza è : ");
    for(int i = 0; i < a.length; i++) {
      for(int j = 0; i < a[i].length; j++) {
        System.out.print(a[i][j]);
      }
      System.out.println();
    }

    System.out.println("La sua trasposta è : ");
    for(int i = 0; i < trasposta.length; i++) {
      for(int j = 0; i < trasposta[i].length; i++) {
        System.out.print(trasposta[i][j]);
      }
      System.out.println();
    }
}
}
