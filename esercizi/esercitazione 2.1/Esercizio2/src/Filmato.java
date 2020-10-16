
public class Filmato extends ElementoRiproducibile implements Volume, Luminosita{
	
	private int volume;
	private int luminosita;

	public Filmato(String titolo, int durata, int volume, int luminosita) {
		super(titolo, durata);
		this.volume = volume;
		this.luminosita = luminosita;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getLuminosita() {
		return luminosita;
	}

	public void setLuminosita(int luminosita) {
		this.luminosita = luminosita;
	}
	
	public void menoVolume() {
		weaker();
	}
	
	public void weaker() {
		volume --;
		System.out.println("Il volume è stato diminuito!");
	}
	
	public void piuVolume() {
		louder();
	}
	
	public void louder() {
		volume ++;
		System.out.println("Il volume è stato aumentato!");
	}
	
	public void menoLuminosita() {
		darker();
	}
	
	public void darker() {
		luminosita --;
		System.out.println("La luminosita è stata diminuita!");
	}
	
	public void piaLuminosita() {
		brighter();
	}
	
	public void brighter() {
		luminosita ++;
		System.out.println("La luminosita è stata aumentata!");
	}

	public void apri() {
		play();
	}
	
	public void play() {
		for(int i = 0; i < getDurata(); i++) {
			System.out.println("");
			System.out.print(getTitolo());
			for(int j = 0; j < getVolume(); j++) {
				System.out.print(" !"); }
			for(int z = 0; z < getLuminosita(); z++) {
				System.out.print(" *"); }
			}
		System.out.println("");
	}
	
	@Override
	public String toString() {
		return super.toString() + " Filmato [volume=" + volume + ", luminosita=" + luminosita + "]";
	}

}
