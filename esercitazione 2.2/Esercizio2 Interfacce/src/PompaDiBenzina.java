
public class PompaDiBenzina extends DistributoriDiBenzina{
	
	private int numeroPompa;
	private double prezzoAlLitro;
	private int incassi;
	private double benzina;
	
	public double getBenzina() {
		return benzina;
	}
	
	public void setBenzina(int benzina) {
		this.benzina = benzina;
	}
	
	public int getIncassi() {
		return incassi;
	}

	public void setIncassi(int incassi) {
		this.incassi = incassi;
	}

	public void setPrezzoAlLitro(double prezzoAlLitro) {
		this.prezzoAlLitro = prezzoAlLitro;
	}

	public int getNumeroPompa() {
		return numeroPompa;
	}

	public void setNumeroPompa(int numeroPompa) {
		this.numeroPompa = numeroPompa;
	}

	public double getPrezzoAlLitro() {
		return prezzoAlLitro;
	}

	public void setPrezzoAlLitro(int prezzoAlLitro) {
		this.prezzoAlLitro = prezzoAlLitro;
	}

	public PompaDiBenzina(String città, String proprietario, int capacità, double benzina, int numeroPompa, double prezzoAlLitro, int incassi) {
		super(città, proprietario, capacità);
		this.benzina = benzina;
		this.numeroPompa = numeroPompa;
		this.prezzoAlLitro = prezzoAlLitro;
		this.incassi = incassi;
	}

	@Override
	public String toString() {
		return super.toString() + " PompaDiBenzina [numeroPompa=" + numeroPompa + ", prezzoAlLitro=" + prezzoAlLitro + "]";
	}
	
	public void faiRifornimento(int soldi) {
		double benzinaFatta = soldi / getPrezzoAlLitro();
		incassi = getIncassi() + soldi;
		if(benzinaFatta < getBenzina()) {
			benzina = getBenzina() - benzinaFatta;
			System.out.println("Con " + soldi + " euro hai fatto " + benzinaFatta + " litri di benzina");
		}else System.out.println("Mi spiace, non è presente abbastanza benzina, riprovi con un importo minore");
		
	}
	
	
	

}
