
public class Cubo implements Ritorna{
	
	private int m;

	public Cubo(int m) {
		this.m = m;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	@Override
	public int ritorna(int m) {
		return m;
	}
	
	public int calcolaQuadrato() {
		int cubo = ritorna(m) * ritorna(m) * ritorna(m);
		return cubo;
	}
	
	

}
