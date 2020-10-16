
public class Motocycle extends Vehicle{
	
	private int cilindrata;

	public Motocycle(String targa, String marca, String modello, boolean guasta, int cilindrata) {
		super(targa, marca, modello, guasta);
		this.cilindrata = cilindrata;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	@Override
	public String toString() {
		return super.toString() + "Motocycle [cilindrata=" + cilindrata + "]";
	}
	
	
}
