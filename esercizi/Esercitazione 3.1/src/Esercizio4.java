import java.util.LinkedList;

public class Esercizio4 {

	public static LinkedList<LinkedList<Integer>> insiemeDiInsiemi(int n) {
		
		LinkedList<LinkedList<Integer>> risultato = new LinkedList<LinkedList<Integer>>();
		
		for(int i = 0; i < n; i++) {
			risultato.add(crea(i));
		}

		return risultato;
		
	}
	
	public static LinkedList<Integer> crea(int n){
		
		LinkedList<Integer> numeri = new LinkedList<Integer>();
		for(int i = 0;i <= n; i++) {
			numeri.add(i);
		}

		return numeri;
	}
	
	public static void main(String[] args) {
		
		System.out.println("creo un insieme di insiemi con n = 10");
		System.out.println(insiemeDiInsiemi(10));
	}
	
}
