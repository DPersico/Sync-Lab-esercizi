
public class Test {
	
	public static void main(String[] args) {
		
		Cilindro c = new Cilindro(10, 6);
		Parallelepipedo p = new Parallelepipedo(10, 5);
		
		System.out.println("Cilindro");
		System.out.println("di altezza: " + c.getAltezza());
		System.out.println("e raggio: " + c.getRaggio());
		System.out.println(c.area());
		System.out.println(c.volume());
		System.out.println("");
		System.out.println("Parallelepipedo");
		System.out.println("di altezza: " + p.getAltezza());
		System.out.println("e lato: " + p.getLato());
		System.out.println("ha area: " + p.area());
		System.out.println("ha volume: " + p.volume());
	}

}
