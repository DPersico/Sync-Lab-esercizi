
public class Person {
	
	public String surname;
	public String name;
	public String taxCode;
	public String city;
	
		
	public Person() {
		surname = null;
		name = null;
		taxCode = null;
		city = null;
	}
	
	public Person(String surname, String name, String taxCode, String city) {
		this.surname = surname;
		this.name = name;
		this.taxCode = taxCode;
		this.city = city;
	}
	
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTaxCode() {
		return taxCode;
	}
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public int bornYear(String codiceFiscale) {
		
		int bornYear = 0;
		String anno = codiceFiscale.substring(6, 8);
		int intAnno = Integer.parseInt(anno);
		
		if(intAnno > 20) {
			bornYear = 1900 + intAnno;
		} 
		if(intAnno <= 20) {
			bornYear = 2000 + intAnno;
		}
		
		return bornYear;
		
	}

	@Override
	public String toString() {
		return "Person [surname=" + surname + ", name=" + name + ", taxCode=" + taxCode + ", city=" + city + "]";
	}
	
	

}
