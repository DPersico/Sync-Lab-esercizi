import java.util.Scanner;
public class Question {
	
	private String domanda;
	private String rispostaCorretta;
	private int punteggio;
	
	Scanner tastiera = new Scanner(System.in);

	public Question(String domanda, String rispostaCorretta, int punteggio) {
		this.domanda = domanda;
		this.rispostaCorretta = rispostaCorretta;
		this.punteggio = punteggio;
	}
	
	public String getDomanda() {
		return domanda;
	}

	public void setDomanda(String domanda) {
		this.domanda = domanda;
	}

	public String getRispostaCorretta() {
		return rispostaCorretta;
	}

	public void setRispostaCorretta(String rispostaCorretta) {
		this.rispostaCorretta = rispostaCorretta;
	}

	public int getPunteggio() {
		return punteggio;
	}

	public void setPunteggio(int punteggio) {
		this.punteggio = punteggio;
	}


	public int ask(Question domanda) {
		
		String risposta;
		int punteggioAssegnato;
		
		System.out.println("Domanda:");
		System.out.println(domanda.getDomanda());
		System.out.println("(questa domanda vale : " + domanda.getPunteggio() + " punti)");

			System.out.println("Inserisci la risposta :");
			risposta = tastiera.nextLine();
			if(risposta.equalsIgnoreCase(domanda.getRispostaCorretta())) {
				punteggioAssegnato = domanda.getPunteggio(); 
				} else punteggioAssegnato = 0;
			
			return punteggioAssegnato;
		}

}
