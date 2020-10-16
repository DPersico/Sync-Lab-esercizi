
public class Stagista extends Person{
	
	private int numberOfPresence;
	private int idNumber;
	
 
	public Stagista() {
		numberOfPresence = 0;
		idNumber = 0;
	}


	public Stagista(String surname, String name, String taxCode, String city, int numberOfPresence, int idNumber) {
		super(surname, name, taxCode, city);
		this.numberOfPresence = numberOfPresence;
		this.idNumber = idNumber;
	}


	public int getNumberOfPresence() {
		return numberOfPresence;
	}


	public void setNumberOfPresence(int numberOfPresence) {
		this.numberOfPresence = numberOfPresence;
	}


	public int getIdNumber() {
		return idNumber;
	}


	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}


	@Override
	public String toString() {
		return super.toString() + " Stagista [numberOfPresence=" + numberOfPresence + ", idNumber=" + idNumber + "]";
	}



}
