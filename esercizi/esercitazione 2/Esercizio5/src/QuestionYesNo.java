
public class QuestionYesNo extends Question {
	
	public QuestionYesNo(String domanda, String rispostaCorretta, int punteggio) {
		super(domanda, rispostaCorretta, punteggio);
	}

	@Override
	public int ask(Question domanda) {
		
		String risposta;
		int punteggioAssegnato;
		System.out.println("Domanda :");
		System.out.println(domanda.getDomanda());
		System.out.println("(questa domanda vale : " + domanda.getPunteggio() + " punti)");
	
		do {
		System.out.println("Inserisci la risposta (solo si o no) :");
		risposta = tastiera.next();
		if(risposta.equalsIgnoreCase(domanda.getRispostaCorretta())) {
			punteggioAssegnato = domanda.getPunteggio();
		}else punteggioAssegnato = 0;
		}while(!(risposta.equalsIgnoreCase("si") || (risposta.equalsIgnoreCase("no"))));
		
		return punteggioAssegnato;
	}
	
}

