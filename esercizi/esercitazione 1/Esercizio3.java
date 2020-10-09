public class Esercizio3 {

public static void stampaFibonacci() {

  long n1 = 0;
  long n2 = 1;
  long somma;
  int totNum = 50;

  System.out.println("I primi 50 numeri di Fibonacci sono :");
  System.out.println("0");
  System.out.println("1");

  for(int i = 0; i < 50; i++) {
    somma = n1 + n2;
    System.out.println(somma);
    n1 = n2;
    n2 = somma;
  }
}

public static void main(String[] args) {
  stampaFibonacci();
}
}
