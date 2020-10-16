
public abstract class OggettoGenerico {
	
	private int altezza;

	public OggettoGenerico(int altezza) {
		this.altezza = altezza;
	}

	public int getAltezza() {
		return altezza;
	}

	public abstract double area();
	
	public double volume() {
		return altezza * area();
	}
	
	public void printArea() {
		System.out.println("L' area è : " + area());
	}
	
	public void printVolume() {
		System.out.println("Il volume è : " + volume());
	}

}
