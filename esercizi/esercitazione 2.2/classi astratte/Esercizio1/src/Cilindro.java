
public class Cilindro extends OggettoGenerico {

	private int raggio;
	
	public int getRaggio() {
		return raggio;
	}

	public void setRaggio(int raggio) {
		this.raggio = raggio;
	}

	public Cilindro(int altezza, int raggio) {
		super(altezza);
		this.raggio = raggio;
	}
	
	@Override
	public double area() {
		return (raggio * raggio * Math.PI);
	}

}
