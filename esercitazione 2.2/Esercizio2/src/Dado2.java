//senza classe astratta

public class Dado2 {
	
	private int n;
	
	public int getN() {
		return n;
	}

	public int lancia() {
		n = (1 + (int) (Math.random()* 6));
		return n;
	}
	
	public void stampa(int n) {
		System.out.println("E' uscito : " + n);
	}


}
