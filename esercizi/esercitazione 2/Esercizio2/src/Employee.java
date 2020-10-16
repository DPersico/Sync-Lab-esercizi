
public class Employee extends Person{

	private int annoDiAssunzione;
	private int stipendio;


	public Employee() {
		annoDiAssunzione = 0;
		stipendio = 0;
	}

	public Employee(int annoDiAssunzione, int stipendio) {
		this.annoDiAssunzione = annoDiAssunzione;
		this.stipendio = stipendio;
	}

	public int getAnnoDiAssunzione() {
		return annoDiAssunzione;
	}

	public void setAnnoDiAssunzione(int annoDiAssunzione) {
		this.annoDiAssunzione = annoDiAssunzione;
	}

	public int getStipendio() {
		return stipendio;
	}

	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}

	@Override
	public String toString() {
		return  "Employee [annoDiAssunzione=" + annoDiAssunzione + ", stipendio=" + stipendio + "]";
	}

	public boolean gainsMore(Employee dipendente) {

		boolean stipendioPiuAlto = false;
		if(this.getStipendio() > dipendente.getStipendio()) {
			stipendioPiuAlto = true;
		}

		return stipendioPiuAlto;
	}





}
