
public class Parallelepipedo extends OggettoGenerico {
	
	private int lato;

	public int getLato() {
		return lato;
	}

	public void setLato(int lato) {
		this.lato = lato;
	}
	
	public Parallelepipedo(int altezza, int lato) {
		super(altezza);
		this.lato = lato;
	}

	@Override
	public double area() {
		return (lato * lato);
	}
	
	

}
