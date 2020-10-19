
public class Tessera {
	
	private int codice;
	private double creditoDisponibile;
	
	public int getCodice() {
		return codice;
	}
	
	public void setCodice(int codice) {
		this.codice = codice;
	}
	
	public void setCreditoDisponibile(double creditoDisponibile) {
		this.creditoDisponibile = creditoDisponibile;
	}

	public double getCreditoDisponibile() {
		return creditoDisponibile;
	}
	
	public Tessera(int codice, double creditoDisponibile)  throws TesseraNonValidaException {
		if(codice < 1 || codice > 99) {
			throw new TesseraNonValidaException();
		}
		this.codice = codice;
		this.creditoDisponibile = creditoDisponibile;
	}
	
	public void caricaTessera(double credito) {
		if(credito < 100) {
		setCreditoDisponibile(credito);
		} else System.out.println("E' possibile caricare un massimo di 100 per volta");
	}

}
