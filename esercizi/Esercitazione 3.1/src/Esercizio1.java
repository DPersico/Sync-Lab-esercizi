import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Esercizio1 {
	
	public static LinkedList<Integer> creaRandom(int n, int max){
		
		int numero;
		LinkedList<Integer> numeri = new LinkedList<Integer>();
		
		for(int i = 0; i < n; i++) {
		numero = (int) (max * Math.random());
		numeri.add(numero);
		}
		

		return numeri;
	}
	
	public static ArrayList<Integer> creaRandom2(int n, int max){
		
		int numero;
		ArrayList<Integer> numeri = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
		numero = (int) (max * Math.random());
		numeri.add(numero);
		}
		

		return numeri;
	}
	
	public static void stampa(Iterator<Integer> i) {
		
		while(i.hasNext()) {
			int a = (Integer) i.next();
			System.out.print("<" + a + ">");
		}
		System.out.println("");
		
	}
	
	public static void provaEx1() {
	
	System.out.println("USANDO LINKEDLIST");
	System.out.println("Creo un vettore di 20 elementi random (da 0 a 100)");
	LinkedList<Integer> l1 = creaRandom(20, 100);
	
	System.out.println("Vettore disordinato : ");
	Iterator<Integer> i1 = l1.iterator();
	stampa(i1);
	
	Collections.sort(l1);
	
	System.out.println("Vettore ordinato : ");
	Iterator<Integer> i2 = l1.iterator();
	stampa(i2);
	
	System.out.println("");
	System.out.println("USANDO ARRAYLIST");
	System.out.println("Creo un vettore di 20 elementi random (da 0 a 100)");
	ArrayList<Integer> a1 = creaRandom2(20,100);
	
	System.out.println("Vettore disordinato : ");
	Iterator<Integer> i3 = a1.iterator();
	stampa(i3);
	
	Collections.sort(a1);
	
	System.out.println("Vettore ordinato : ");
	Iterator<Integer> i4 = a1.iterator();
	stampa(i4);
	
	}
	
	public static void main(String[] args) {
		provaEx1();
	}

}
