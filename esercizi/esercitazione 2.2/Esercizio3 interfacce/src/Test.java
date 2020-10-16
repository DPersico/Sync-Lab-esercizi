
public class Test {
	
	public static void main(String[] args) {
		
		Somma somma = new Somma();
		Sottrazione sottrazione = new Sottrazione();
		Divisione divisione = new Divisione();
		Moltiplicazione moltiplicazione = new Moltiplicazione();
		
		System.out.println("Svolgo tutte le operazioni con i seguenti numeri a = 10 b = 2");
		System.out.println("Somma : " );
		somma.stampa(somma.operazione(10, 2));
		System.out.println("Sottrazione : ");
		sottrazione.stampa(sottrazione.operazione(10, 2));
		System.out.println("Divisione : ");
		divisione.stampa(divisione.operazione(10, 2));
		System.out.println("Moltiplicazione : ");
		moltiplicazione.stampa(moltiplicazione.operazione(10, 2));
	}

}
