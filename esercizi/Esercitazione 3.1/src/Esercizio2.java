import java.util.LinkedList;

public class Esercizio2 {
	
	public static LinkedList<Integer> creaRandomCrescente(int n) {
		
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		
		int numero = 0;
		numero = (int) (100 * Math.random());
		System.out.print(numero);
		System.out.print(" ");
		l1.add(numero);
		
		int numero2 = 0;
		for(int i = 0; i < n - 1; i++) {
			numero2 = (int) (100 * Math.random());
			System.out.print(numero2);
			System.out.print(" ");
			int somma = numero + numero2;
			l1.add(somma);
			int app = somma;
			numero = app;
		}
		System.out.println("");
		
		return l1;

	}
	
	public static LinkedList<Integer> parseString(LinkedList<String> a) {
		
		LinkedList<Integer> interi = new LinkedList<Integer>();
		
		for(int i = 0; i < a.size(); i++) {
			int n = Integer.parseInt(a.get(i));
			interi.add(n);
		}
		
		return interi;
		
	}
	
	public static void provaEx2() {
		
		LinkedList<Integer> l1 = creaRandomCrescente(10);
		System.out.println("Creo una linkedlist di 10 elementi,");
		System.out.println("i valori successivi al primo sono il risultato della somma");
		System.out.println("di un nuovo numero casuale con il numero precedente");
		System.out.println(l1);
		System.out.println("");
		
		LinkedList<String> s1 = new LinkedList<String>();
		s1.add("1");
		s1.add("2");
		s1.add("3");
		s1.add("4");
		s1.add("5");
		s1.add("6");
		s1.add("7");
		s1.add("8");
		s1.add("9");
		s1.add("10");
		
		
		System.out.println("Linkedlist di stringhe : ");
		System.out.println(s1);
		System.out.println("Linkedlist parsato : ");
		System.out.println(parseString(s1));
		System.out.println("un input per cui viene generata un eccezione è ad esempio \"ciao\"");
		System.out.println("Integer.parseInt() lancia un eccezione di tipo NumberFormatException");
		
	}
	
	public static void main(String[] args) {
		provaEx2();
	}
}