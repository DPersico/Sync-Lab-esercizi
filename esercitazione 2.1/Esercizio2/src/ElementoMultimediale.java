
public abstract class ElementoMultimediale {
	
	private String titolo;

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public ElementoMultimediale(String titolo) {
		this.titolo = titolo;
	}

	@Override
	public String toString() {
		return "ElementoMultimediale [titolo=" + titolo + "]";
	}	
	
	public void apri() {
	}

	public void piùLuminosità() {
	}
	
	public void menoLuminosità() {
	}
	
	public void piùVolume() {
	}
	
	public void menoVolume() {
	}
}
