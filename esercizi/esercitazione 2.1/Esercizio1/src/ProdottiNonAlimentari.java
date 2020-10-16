
public class ProdottiNonAlimentari extends Prodotti {
	
	private String materiale;

	public ProdottiNonAlimentari(String codice, String descrizione, int prezzo, String materiale) {
		super(codice, descrizione, prezzo);
		this.materiale = materiale;
	}

	public String getMateriale() {
		return materiale;
	}

	public void setMateriale(String materiale) {
		this.materiale = materiale;
	}
	
	@Override
	public int applicaSconto() {
		
		int prezzoScontato = getPrezzo();
		if(getMateriale().equalsIgnoreCase("carta") || getMateriale().equalsIgnoreCase("vetro") || getMateriale().equalsIgnoreCase("plastica")) {
			prezzoScontato = getPrezzo() - ((getPrezzo() * 10) / 100);
			System.out.println("Si applica lo sconto, il prodotto è di materiale riciclabile: " + getMateriale());
		}else System.out.println("Non si applica lo sconto, il prodotto non è di materiale riciclabile");
	
		System.out.println("prezzo : " + getPrezzo());
		System.out.println("prezzo scontato : " + prezzoScontato);
		return prezzoScontato;
	}

	@Override
	public String toString() {
		return super.toString() + " ProdottiNonAlimentari [materiale=" + materiale + "]";
	}
	
	

}
