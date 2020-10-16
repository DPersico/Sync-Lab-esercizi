//con classe astratta

public class Moneta extends Gioco {
	
	private int m;

	public int getM() {
		return m;
	}

	public int lancia() {
		m = ((int) (Math.random()* 2));
		return m;
	}

}
