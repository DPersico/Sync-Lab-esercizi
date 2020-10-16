
public class Immagine extends ElementoMultimediale implements Luminosita{

	private int luminosita;

	public Immagine(String titolo, int luminosita) {
		super(titolo);
		this.luminosita = luminosita;
	}

	public int getLuminosita() {
		return luminosita;
	}

	public void setLuminosita(int luminosita) {
		this.luminosita = luminosita;
	}

	public void menoLuminosita() {
		darker();
	}

	public void darker() {
		luminosita --;
		System.out.println("La luminosita è stata diminuita!");
	}

	public void piuLuminosita() {
		brighter();
	}

	public void brighter() {
		luminosita ++;
		System.out.println("La luminosita è stata aumentata!");
		}

	public void apri() {
		show();
	}

	public void show() {

		System.out.println("");
		System.out.print(getTitolo());
		for(int i = 0; i < getLuminosita(); i++) {
			System.out.print(" *");
		}
		System.out.println("");
	}

	@Override
	public String toString() {
		return super.toString() + " Immagine [luminosita=" + luminosita + "]";
	}



}
