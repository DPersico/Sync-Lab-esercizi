
public abstract class OperazioneGenerica implements Operazione{

	@Override
	public abstract int operazione(int a, int b);
	
	public void stampa(int a) {
		System.out.println("Il risultato è : " + a);
	}

}
