
class TestEmployee {
	
	public static void main(String[] args) {
		
		Employee riccardo = new Employee(2009, 2100);
		riccardo.name = "Riccardo";
		Employee luca = new Employee(2016, 1550);
		luca.name = "Luca";
		Employee marco = new Employee(2017, 1400);
		marco.name = "Marco";
		
		Employee[] ordineStipendio = {riccardo, luca, marco};
		
		for(int i = 0; i < ordineStipendio.length; i++) {
			int pos = i;
			for(int j = i + 1; j < ordineStipendio.length; j++) {
				if(!(ordineStipendio[j].gainsMore(ordineStipendio[pos]))) {
					pos = j;
				}
			}
			
			Employee app = ordineStipendio[pos];
			ordineStipendio[pos] = ordineStipendio[i];
			ordineStipendio[i] = app;
		}
		
		System.out.println("I dipendenti in ordine di stipendio:");
		System.out.println("(in ordine crescente)");
		for(int i = 0; i < ordineStipendio.length; i++) {
			System.out.println(ordineStipendio[i].getName() + ordineStipendio[i].toString());
		}
	}
}