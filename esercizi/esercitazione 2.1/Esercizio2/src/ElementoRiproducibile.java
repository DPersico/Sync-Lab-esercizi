
public abstract class ElementoRiproducibile extends ElementoMultimediale {
	
	private int durata;

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}
	
	public ElementoRiproducibile(String titolo, int durata) {
		super(titolo);
		this.durata = durata;
	}

	@Override
	public String toString() {
		return super.toString() + " ElementoRiproducibile [durata=" + durata + "]";
	}
	
	

}
