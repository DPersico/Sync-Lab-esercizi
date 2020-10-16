
public class Test {
	
	public static void main(String[] args) {
		
		Dado dado = new Dado();
		Moneta moneta = new Moneta();
		
		System.out.println("Lancio un dado");
		dado.lancia();
		dado.stampaRisultato(dado.getN());
		
		System.out.println("");
		System.out.println("Lancio una moneta");
		System.out.println("0 equivale a testa, 1 a croce");
		moneta.lancia();
		moneta.stampaRisultato(moneta.getM());
		
		
		Dado2 dado2 = new Dado2();
		Moneta2 moneta2 = new Moneta2();
		
		System.out.println("");
		System.out.println("Lancio un dado");
		dado2.lancia();
		dado2.stampa(dado2.getN());
		
		System.out.println("");
		System.out.println("Lancio una moneta");
		moneta2.lancia();
		moneta2.stampa(moneta2.getM());
	}

}
