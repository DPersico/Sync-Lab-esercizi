// con classe astratta

public class Dado extends Gioco{
	
	private int n;
	
	public int getN() {
		return n;
	}

	public int lancia() {
		n = (1 + (int) (Math.random()* 6));
		return n;
	}

}
