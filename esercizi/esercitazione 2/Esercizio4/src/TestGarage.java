
public class TestGarage {
	
	public static void main(String[] args) {
	
	Garage garage = new Garage();
	
	Car macchina1 = new Car("FL763DS", "Citroen", "C3", true, "utilitaria");
	Car macchina2 = new Car("FZ982LO", "Mercedes", "Classe C", true, "station wagon");
	Car macchina3 = new Car("EL562PO", "Jeep", "Renegade", true, "SUV");
	Car macchina4 = new Car("AX786GV", "Ford", "Fiesta", true, "utilitaria");
	Car macchina5 = new Car("CF453NI", "Fiat", "Tipo", true, "station wagon");
	
	Car[] macchine = {macchina1, macchina2, macchina3, macchina4, macchina5};
	
	System.out.println("PREZZI GARAGE : ");
	System.out.println("utilitaria, non guasta: 50 | guasta: 300");
	System.out.println("station wagon, non guasta: 100 | guasta: 450");
	System.out.println("SUV, non guasta: 150 | guasta 600");
	System.out.println("");
	
	for(int i = 0; i < macchine.length; i++) {
		System.out.println("Riparazione macchina:");
		System.out.println(macchine[i].toString());
		System.out.println("Il prezzo da pagare è : " + garage.repair(macchine[i]));
	}
	
	System.out.println("");
	
	for(int i = 0; i < macchine.length; i++) {
		System.out.println("Controllo macchina :");
		System.out.println(macchine[i].toString());
		System.out.println("Il prezzo da pagare è : " + garage.repair(macchine[i]));
	}
	
	
	
	}
}
