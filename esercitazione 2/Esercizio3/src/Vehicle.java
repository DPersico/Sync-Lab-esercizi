
public class Vehicle {
	
	private String targa;
	private String marca;
	private String modello;
	private boolean guasta;
	
	
	public Vehicle() {
		targa = null;
		marca = null;
		modello = null;
		guasta = false;
	}
	
	public Vehicle(String targa, String marca, String modello, boolean guasta) {
		this.targa = targa;
		this.marca = marca;
		this.modello = modello;
		this.guasta = guasta;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public boolean isGuasta() {
		return guasta;
	}

	public void setGuasta(boolean guasta) {
		this.guasta = guasta;
	}

	@Override
	public String toString() {
		return "Vehicle [targa=" + targa + ", marca=" + marca + ", modello=" + modello + ", guasta=" + guasta + "]";
	}

}
