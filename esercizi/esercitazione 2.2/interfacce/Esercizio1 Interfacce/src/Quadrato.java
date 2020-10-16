
public class Quadrato implements Ritorna{
	
	private int n;

	public Quadrato(int n) {
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	@Override
	public int ritorna(int n) {
		return n;
	}
	
	public int calcolaQuadrato() {
		int quadrato = ritorna(n) * ritorna(n);
		return quadrato;
	}
	
	

}
