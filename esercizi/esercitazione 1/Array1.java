public class Array1 {

  public static void main(String[] args) {

    int[] interi = {10, 3, 1, 5, 2, 1, 2, 3, 1, 7};

    for(int i = 0; i < 5; i++) {
      System.out.println("elemento " + (i + 1) + " : " + interi[i]);
      System.out.println("elemento " + (10 - i) + " : "+ interi[interi.length - 1 - i]);
    }
  }
}
