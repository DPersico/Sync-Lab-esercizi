//senza classe astratta

public class Moneta2 {
	
private int m;
	
	public int getM() {
		return m;
	}

	public int lancia() {
		m = ((int) (Math.random()* 2));
		return m;
	}
	
	public void stampa(int n) {
		if(n == 0) {
			System.out.println("E' uscita testa");
		}else System.out.println("E' uscita croce");
	}

}
