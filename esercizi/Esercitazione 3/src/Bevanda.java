
public class Bevanda {
	
	private String codice;
	private double prezzo;
	private String nome;
	
	public Bevanda(String codice, double prezzo, String nome) {
		this.codice = codice;
		this.prezzo = prezzo;
		this.nome = nome;
	}
	
	public String getCodice() {
		return codice;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	public String getNome() {
		return nome;
	}
	
}
