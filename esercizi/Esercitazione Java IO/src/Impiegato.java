import java.io.Serializable;

public class Impiegato implements Serializable{
		
		private String nome;
		private String cognome;
		private int matricola;
		private int stipendio;
		
		public Impiegato(String nome, String cognome, int matricola, int stipendio) {
			this.nome = nome;
			this.cognome = cognome;
			this.matricola = matricola;
			this.stipendio = stipendio;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCognome() {
			return cognome;
		}

		public void setCognome(String cognome) {
			this.cognome = cognome;
		}

		public int getMatricola() {
			return matricola;
		}

		public void setMatricola(int matricola) {
			this.matricola = matricola;
		}

		public int getStipendio() {
			return stipendio;
		}

		public void setStipendio(int stipendio) {
			this.stipendio = stipendio;
		}

		@Override
		public String toString() {
			return "Impiegato [nome=" + nome + ", cognome=" + cognome + ", matricola=" + matricola + ", stipendio="
					+ stipendio + "]";
		}

}