
public class Car extends Vehicle{
	
	private String tipologia;

	public Car(String targa, String marca, String modello, boolean guasta, String tipologia) {
		super(targa, marca, modello, guasta);
		this.tipologia = tipologia;
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	@Override
	public String toString() {
		return super.toString() + "Car [tipologia=" + tipologia + "]";
	}
	
	

}
