import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Esercizio3 {
	
	public static LinkedList<Integer> mergeOrdinato(Iterator<Integer> a, Iterator<Integer> b) {
		
		LinkedList<Integer> risultato = new LinkedList<Integer>();
		
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		a = l1.iterator();
		
		for(int i = 0; i < 10; i++) {
			int n = (int) (100 * Math.random());
			l1.add(n);
		}
		Collections.sort(l1);
		
		System.out.println("Lista 1 ordinata : " + l1);
		

		LinkedList<Integer> l2 = new LinkedList<Integer>();
		b = l2.iterator();
		
		for(int j = 0; j < 10; j++) {
			int m = (int) (100 * Math.random());
			l2.add(m);
		}
		Collections.sort(l2);

		System.out.println("Lista 2 ordinata : " + l2);
		
		risultato.addAll(l1);
		risultato.addAll(l2);
		
		Collections.sort(risultato);
		
		System.out.println("Merge delle due liste e successivamente ordinato : ");
		return  risultato;
		
	}
	
	public static void provaEx3() {
		
		Iterator<Integer> i1 = null;
		Iterator<Integer> i2 = null;
		
		System.out.println(mergeOrdinato(i1, i2));
	}
	
	public static void main(String[] args) {
		provaEx3();
	}

}
