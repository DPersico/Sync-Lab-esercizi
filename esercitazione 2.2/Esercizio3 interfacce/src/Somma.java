
public class Somma extends OperazioneGenerica implements Operazione {
	
	private int a;
	
	public int getA() {
		return a;
	}

	@Override
	public int operazione(int b, int c) {	
		a = b + c;
		return a;
	}

}
