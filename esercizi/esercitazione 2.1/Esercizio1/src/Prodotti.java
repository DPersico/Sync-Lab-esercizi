
public class Prodotti {
	
	private String codice;
	private String descrizione;
	private int prezzo;
	
	public Prodotti(String codice, String descrizione, int prezzo) {
		super();
		this.codice = codice;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}
	
	public String getCodice() {
		return codice;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public int getPrezzo() {
		return prezzo;
	}
	@Override
	public String toString() {
		return "Prodotti [codice=" + codice + ", descrizione=" + descrizione + ", prezzo=" + prezzo + "]";
	}
	
	public int applicaSconto() {
		
		int prezzoScontato;
		prezzoScontato = prezzo - ((prezzo / 100) * 5);
		
		return prezzoScontato;
		
	}

}
