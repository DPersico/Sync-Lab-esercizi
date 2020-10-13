
public class NumericQuestion extends Question{

	public NumericQuestion(String domanda, String rispostaCorretta, int punteggio) {
		super(domanda, rispostaCorretta, punteggio);
	}

	@Override
	public int ask(Question domanda) {
		
		int punteggioAssegnato;
		boolean valida;
		
		System.out.println("Domanda:");
		System.out.println(domanda.getDomanda());
		System.out.println("(questa domanda vale : " + domanda.getPunteggio() + " punti)");
		
		do {
		System.out.println("Inserisci la tua risposta (deve essere un valore intero) :");
		String risposta = tastiera.nextLine();
		
		int n=0;
		try{
			n=Integer.parseInt(risposta);
							
		}catch(NumberFormatException e) {}
	
		if(n == 0) {
			System.out.println("La risposta che hai dato non è un valore intero");
			valida = false;
		}else valida = true;
		
		if(risposta.equals(domanda.getRispostaCorretta())) {
			punteggioAssegnato = domanda.getPunteggio();
		} else punteggioAssegnato = 0;
		
		} while(!valida);
		
		return punteggioAssegnato;
	}

}