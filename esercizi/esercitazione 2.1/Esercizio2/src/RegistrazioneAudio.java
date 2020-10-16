
public class RegistrazioneAudio extends ElementoRiproducibile implements Volume{

	private int volume;
	
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public RegistrazioneAudio(String titolo, int durata, int volume) {
		super(titolo, durata);
		this.volume = volume;
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
	
	public void apri() {
		play();
	}

	public void play() {
		for(int i = 0; i < getDurata(); i++) {
			System.out.println("");
			System.out.print(getTitolo());
			for(int j = 0; j < getVolume(); j++) {
				System.out.print(" !");
			}
		}
		System.out.println("");
	}

	@Override
	public String toString() {
		return super.toString() + " RegistrazioneAudio [volume=" + volume + "]";
	}
	
	

}
