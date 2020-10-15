
public class Immagine extends ElementoMultimediale implements Luminosità{

	private int luminosità;
	
	public Immagine(String titolo, int luminosità) {
		super(titolo);
		this.luminosità = luminosità;
	}

	public int getLuminosità() {
		return luminosità;
	}

	public void setLuminosità(int luminosità) {
		this.luminosità = luminosità;
	}
	
	public void menoLuminosità() {
		darker();
	}

	public void darker() {
		luminosità --;
		System.out.println("La luminosità è stata diminuita!");
	}
	
	public void piùLuminosità() {
		brighter();
	}
	
	public void brighter() {
		luminosità ++;
		System.out.println("La luminosità è stata aumentata!");
		}
	
	public void apri() {
		show();
	}
	
	public void show() {
		
		System.out.println("");
		System.out.print(getTitolo());
		for(int i = 0; i < getLuminosità(); i++) {
			System.out.print(" *");
		}
		System.out.println("");
	}

	@Override
	public String toString() {
		return super.toString() + " Immagine [luminosità=" + luminosità + "]";
	}
	
	

}
