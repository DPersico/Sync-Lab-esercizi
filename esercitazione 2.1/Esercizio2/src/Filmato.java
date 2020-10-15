
public class Filmato extends ElementoRiproducibile implements Volume, Luminosità{
	
	private int volume;
	private int luminosità;

	public Filmato(String titolo, int durata, int volume, int luminosità) {
		super(titolo, durata);
		this.volume = volume;
		this.luminosità = luminosità;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getLuminosità() {
		return luminosità;
	}

	public void setLuminosità(int luminosità) {
		this.luminosità = luminosità;
	}
	
	public void menoVolume() {
		weaker();
	}
	
	public void weaker() {
		volume --;
		System.out.println("Il volume è stato diminuito!");
	}
	
	public void piùVolume() {
		louder();
	}
	
	public void louder() {
		volume ++;
		System.out.println("Il volume è stato aumentato!");
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
		play();
	}
	
	public void play() {
		for(int i = 0; i < getDurata(); i++) {
			System.out.println("");
			System.out.print(getTitolo());
			for(int j = 0; j < getVolume(); j++) {
				System.out.print(" !"); }
			for(int z = 0; z < getLuminosità(); z++) {
				System.out.print(" *"); }
			}
		System.out.println("");
	}
	
	@Override
	public String toString() {
		return super.toString() + " Filmato [volume=" + volume + ", luminosità=" + luminosità + "]";
	}

}
