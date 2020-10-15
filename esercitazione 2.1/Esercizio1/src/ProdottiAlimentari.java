
public class ProdottiAlimentari extends Prodotti {

	private Data dataDiScandeza = new Data();
	
	public ProdottiAlimentari(String codice, String descrizione, int prezzo, Data dataDiScadenza) {
		super(codice, descrizione, prezzo);
		this.dataDiScandeza = dataDiScadenza;	
		}

	public Data getDataDiScandeza() {
		return dataDiScandeza;
	}

	public void setDataDiScandeza(Data dataDiScandeza) {
		this.dataDiScandeza = dataDiScandeza;
	}
	
	@Override
	public int applicaSconto() {
		
		int prezzoScontato = getPrezzo();
		Data odierna = new Data(14, 10, 2020);
		
		if(getDataDiScandeza().getDifference(odierna) < 10) {
		prezzoScontato = getPrezzo() - ((getPrezzo() * 20) / 100);
		System.out.println("Si applica lo sconto, scade tra meno di 10 giorni");
		}else System.out.println("Non si applica lo sconto, scade tra più di 10 giorni");
		
		System.out.println("scade tra : " + getDataDiScandeza().getDifference(odierna) + " giorni");
		System.out.println("prezzo : " + getPrezzo());
		System.out.println("prezzo scontato : " + prezzoScontato);
		return prezzoScontato;
		
	}

	@Override
	public String toString() {
		return super.toString() + " ProdottiAlimentari [dataDiScandeza=" + dataDiScandeza + "]";
	}
	
	
	

}
