import java.text.DecimalFormat;
import java.util.ArrayList;

public class DistributoreDiBevande {
	
	public ArrayList<Bevanda> bevande;
	
	public ArrayList<Tessera> tessere;
	
	public ArrayList<Colonna> colonne;
	
	public DistributoreDiBevande() {
		bevande = new ArrayList<Bevanda>();
		tessere = new ArrayList<Tessera>();
		colonne = new ArrayList<Colonna>();
	}
	
	public void aggiungiBevanda(Bevanda b) {
		bevande.add(b);
	}
	
	public void registraTessera(Tessera  t) {
		tessere.add(t);
	}
	
	public void aggiungiColonna(Colonna c) {
		colonne.add(c);
	}
	
	public void scegliBevanda(String codice) throws BevandaNonValidaException{
		
		boolean esiste = false;
		for(Bevanda b: bevande) {
			if(b.getCodice().equalsIgnoreCase(codice)) {
				System.out.println("La bevanda è : " + b.getNome());
				System.out.println("Il prezzo è : " + b.getPrezzo());
				esiste = true;
			}
		}
		if (!esiste) {
			throw new BevandaNonValidaException();
		}
	}
	
	double val = 0.0;
	DecimalFormat df = new DecimalFormat("0.00");
	String str = df.format(val);
	
	public void leggiCredito(int codice) throws TesseraNonValidaException {
		boolean esiste = false;
		for(Tessera t : tessere) {
		if (t.getCodice() == codice){
			System.out.println("Il credito disponibile è : " + df.format(t.getCreditoDisponibile()));
			esiste = true;
		}
		}
		if(!esiste) {
			throw new TesseraNonValidaException();
		}
	}

	public int lattineDisponibili(String codice) {
		int disponibili = 0;
		String tipo = "";
		
		for(Bevanda b : bevande) {
			if(b.getCodice().equalsIgnoreCase(codice)) {
				tipo = b.getNome();
			}
		}
		
		for(Colonna c : colonne) {
			if(c.getTipoBevanda().equalsIgnoreCase(tipo)) {
				disponibili += c.getNumeroLattine();
				}
			}
		return disponibili;
		}
	
	public int eroga(String codiceBevanda, int codiceTessera) throws CreditoInsufficienteException, BevandaEsauritaException, BevandaNonValidaException, TesseraNonValidaException{
		int numeroColonna = 0;
		double prezzo = 0;
		double creditoResiduo = 0;
		String tipo = "";
		
		boolean ok1 = false;
		for(Bevanda b: bevande) {
			if(b.getCodice().equalsIgnoreCase(codiceBevanda)) {
				ok1 = true;
				prezzo = b.getPrezzo();
				tipo = b.getNome();
			}
		}
		if (!ok1) {
			throw new BevandaNonValidaException();
		}
		
		boolean ok2 = false;
		for(Tessera t: tessere) {
			if(t.getCodice() == codiceTessera) {
				ok2 = true;
				creditoResiduo = t.getCreditoDisponibile();
			}
		}
		if (!ok2) {
			throw new TesseraNonValidaException();
		}
		
		if(prezzo > creditoResiduo) {
			throw new CreditoInsufficienteException();
		}
		
		if(lattineDisponibili(codiceBevanda) < 1) {
			throw new BevandaEsauritaException();
		}
		
		for(Colonna c : colonne) {
			if(c.getTipoBevanda().equalsIgnoreCase(tipo)) {
				if(c.getNumeroLattine() > 0) {
					numeroColonna = c.getNumeroColonna();
					c.setNumeroLattine(c.getNumeroLattine() - 1);
					for(Tessera t : tessere) {
						if(t.getCodice() == codiceTessera && tipo.equalsIgnoreCase("acqua")) {
							t.setCreditoDisponibile(t.getCreditoDisponibile() - (prezzo / 2));
							}else if(t.getCodice() == codiceTessera) {
								t.setCreditoDisponibile(t.getCreditoDisponibile() - prezzo);
							}
					}
				}
			}
		}
		return numeroColonna;
	}
}