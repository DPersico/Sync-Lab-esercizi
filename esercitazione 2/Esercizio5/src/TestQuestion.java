import java.util.Random;
public class TestQuestion {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		Question d1 = new Question("Qual è la capitale della Francia?", "Parigi", 3);
		Question d2 = new Question("Qual è la capitale della Germania?", "Berlino", 3);
		QuestionYesNo d3 = new QuestionYesNo("Milano si trova in Lombardia?", "si", 1);
		QuestionYesNo d4 = new QuestionYesNo("Bologna si trova in Piemonte?", "no", 1);
		NumericQuestion d5 = new NumericQuestion("In che anno è stata scoperta l' America?", "1492", 5);
		NumericQuestion d6 = new NumericQuestion("In che anno è nato il Regno d' Italia?", "1861", 5);
		MultipleQuestion d7 = new MultipleQuestion("Quale delle seguenti è una marca di auto: 1 Hp 2 Audi 3 Adidas", "2", 2, 3);
		MultipleQuestion d8 = new MultipleQuestion("Quale delle seguenti è una marca di telefoni: 1 Ikea 2 Nike 3 Apple", "3", 2, 3);
		
		Question[] domande = {d1, d2, d3, d4, d5, d6, d7, d8};
		int punteggio = 0;
		
		for(int i = 0; i < 3; i++) {
			int n = random.nextInt(domande.length - 1);
			punteggio += domande[n].ask(domande[n]);
		}
		
		System.out.println("Il punteggio totale che hai conseguito è : " + punteggio);
		
	}

}
