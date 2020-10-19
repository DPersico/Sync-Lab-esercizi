
public class BevandaEsauritaException extends Exception{
	
	public BevandaEsauritaException() {
		super("La bevanda da te richiesta non è più disponibile!");
	}

	public BevandaEsauritaException(String arg0) {
		super(arg0);
	}


}
