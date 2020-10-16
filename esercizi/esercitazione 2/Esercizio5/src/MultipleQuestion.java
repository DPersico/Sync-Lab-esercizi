
public class MultipleQuestion extends Question {
	
	private int opzioni;

	public MultipleQuestion(String domanda, String rispostaCorretta, int punteggio, int opzioni) {
		super(domanda, rispostaCorretta, punteggio);
		this.setOpzioni(3);
	}
	
	public int getOpzioni() {
		return opzioni;
	}

	public void setOpzioni(int opzioni) {
		this.opzioni = opzioni;
	}

	@Override
	public int ask(Question domanda) {
		
		String risposta;
		int punteggioAssegnato;
		System.out.println("Domanda:");
		System.out.println(domanda.getDomanda());
		System.out.println("(questa domanda vale : " + domanda.getPunteggio() + " punti)");
		
		do {
		System.out.println("Inserisci la risposta:");
		System.out.println("(deve essere necessariamente il numero di una delle opzioni)");
		risposta = tastiera.nextLine();
		if(risposta.equalsIgnoreCase(domanda.getRispostaCorretta())) {
			punteggioAssegnato = domanda.getPunteggio(); 
		} else punteggioAssegnato = 0;
		}while(!((risposta.equals("1")) || (risposta.equals("2")) || (risposta.equals("3"))));
		
		return punteggioAssegnato;
		
		}

}
