
public class Garage {
	
	public int repair(Car macchina) {
		int prezzo = 0;
		
		if(!macchina.isGuasta()) {
			if(macchina.getTipologia().equalsIgnoreCase("utilitaria"))
				prezzo = 50;
			else if(macchina.getTipologia().equalsIgnoreCase("station wagon"))
				prezzo = 100;
			else if(macchina.getTipologia().equalsIgnoreCase("SUV"))
				prezzo = 150;
			}
		
		if(macchina.isGuasta()) {
			macchina.setGuasta(false);
			if(macchina.getTipologia().equalsIgnoreCase("utilitaria"))
				prezzo = 300;
			else if(macchina.getTipologia().equalsIgnoreCase("station wagon"))
				prezzo = 450;
			else if(macchina.getTipologia().equalsIgnoreCase("SUV"))
				prezzo = 600;
			}
	
		return prezzo;
	}	
}
