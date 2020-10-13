
public class Esercizio1 {
	
	public static void main(String[] args) {
		
		Person davide = new Person("Persico", "Davide", "PRSDVD98L27E514X", "Legnano");
		
		System.out.println("il nome è : " + davide.getName());
		System.out.println("il cognome è : " + davide.getSurname());
		System.out.println("l' anno di nascita è : " + davide.bornYear(davide.getTaxCode()));
		
		Stagista marco = new Stagista("Colombo", "Marco", "CLMMRC84N18I755L", "Milano", 12, 1230);
		Stagista giovanni = new Stagista("Rossi", "Giovanni", "RSSGVN97D31R456T", "Bologna", 12, 4560);
		Stagista daniele = new Stagista("Bianchi", "Daniele", "BNCDNL01F13T324X", "Torino", 10, 7890);
		
		Stagista[] stagisti = {marco, giovanni, daniele};
		
		int età = 100;
		int etàMinima = 100;
		Stagista piùGiovane = new Stagista();
		for(int i = 0; i < stagisti.length; i++) {
			età = 2020 - stagisti[i].bornYear(stagisti[i].getTaxCode());
			if (età < etàMinima) {
				etàMinima = età;
				piùGiovane = stagisti[i];
			}
		}
		System.out.println("Lo stagista più giovane è : " + piùGiovane.getName());
		System.out.println("che ha : " + etàMinima + " anni");
		System.out.println(piùGiovane.toString());
	   	   

	}
}
