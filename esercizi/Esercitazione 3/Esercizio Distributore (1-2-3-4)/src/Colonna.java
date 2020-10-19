
public class Colonna extends DistributoreDiBevande {
	
	private int numeroColonna;
	private String tipoBevanda;
	private int numeroLattine;
	
	public Colonna(int numeroColonna) {
		this.numeroColonna = numeroColonna;
	}
	
	public int getNumeroColonna() {
		return numeroColonna;
	}

	public void setNumeroColonna(int numeroColonna) {
		this.numeroColonna = numeroColonna;
	}

	public String getTipoBevanda() {
		return tipoBevanda;
	}

	public void setTipoBevanda(String tipoBevanda) {
		this.tipoBevanda = tipoBevanda;
	}

	public int getNumeroLattine() {
		return numeroLattine;
	}

	public void setNumeroLattine(int numeroLattine) {
		this.numeroLattine = numeroLattine;
	}

	public void aggiornaColonna(int numeroColonna, String tipoBevanda, int numeroLattine) {
		this.numeroColonna = numeroColonna;
		this.tipoBevanda = tipoBevanda;
		this.numeroLattine = numeroLattine;
	}

}
