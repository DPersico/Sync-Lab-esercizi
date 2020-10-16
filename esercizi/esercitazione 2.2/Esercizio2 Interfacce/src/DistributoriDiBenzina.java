
public class DistributoriDiBenzina implements Comparable{
	
	private String città;
	private String proprietario;
	private int capacità;
	
	public String getCittà() {
		return città;
	}
	
	public void setCittà(String città) {
		this.città = città;
	}
	
	public String getProprietario() {
		return proprietario;
	}
	
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	
	public int getCapacità() {
		return capacità;
	}

	public void setCapacità(int capacità) {
		this.capacità = capacità;
	}
	
	public DistributoriDiBenzina(String città, String proprietario,int capacità) {
		this.città = città;
		this.proprietario = proprietario;
		this.capacità = capacità;
	}

	@Override
	public int compareTo(DistributoriDiBenzina d) {
		int differenza = this.capacità - d.getCapacità();
		return differenza;
	}

	@Override
	public String toString() {
		return "DistributoriDiBenzina [città=" + città + ", proprietario=" + proprietario + ", capacità=" + capacità + "]";
	}	
	
	

}
