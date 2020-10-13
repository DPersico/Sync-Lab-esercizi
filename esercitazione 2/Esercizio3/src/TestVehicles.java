
public class TestVehicles {
	
	public static void main(String[] args) {
	
	Car macchina1 = new Car("FL763DS", "Citroen", "C3", false, "utilitaria");
	Car macchina2 = new Car("FZ982LO", "Mercedes", "Classe C", false, "station wagon");
	Car macchina3 = new Car("EL562PO", "Jeep", "Renegade", false, "SUV");
	Car macchina4 = new Car("AX786GV", "Ford", "Fiesta", false, "utilitaria");
	Motocycle moto1 = new Motocycle("ER671PL", "Ducati", "RX", false, 250);
	Motocycle moto2 = new Motocycle("GA625CG", "Honda", "GT", false, 300);
	
	Vehicle[] veicoli = {macchina1, macchina2, macchina3, macchina4, moto1, moto2};
	
	System.out.println("Questi sono i veicoli a disposizione");
	for(int i = 0; i < veicoli.length; i++) {
		System.out.println(veicoli[i].toString());
	}
	System.out.println("Alcuni di questi veicoli si sono guastati, ed hanno targa:");
	int numero1 = (int)(6*Math.random());
	int numero2 = (int)(6*Math.random());
	int numero3 = (int)(6*Math.random());
	
	veicoli[numero1].setGuasta(true);
	veicoli[numero2].setGuasta(true);
	veicoli[numero3].setGuasta(true);
	
	for(int i = 0; i < veicoli.length; i++) {
		if(veicoli[i].isGuasta()) {
			System.out.println("targa: " + veicoli[i].getTarga() + "  guasta: " + veicoli[i].isGuasta());
		}
	}
	
	}
}
