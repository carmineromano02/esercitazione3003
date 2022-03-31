import java.util.ArrayList;
import java.util.List;

public class Programma {

	public static class Main{
		
		public static void main(String args[]) {
			
			List<Docente> docenti = new ArrayList<>();
			
			Docente docente1 = new Docente(100, "Antonio", "Mugione");
			Docente docente2 = new Docente(333, "Andrea", "Casu");
			Docente docente3 = new Docente(444, "Penelope", "Lois");
			
//			AGGIUNGERE ALLA LISTA
			docenti.add(docente1);
			docenti.add(docente2);
			docenti.add(docente3);
			
			int i = 0;
			
			System.out.println("I Docenti sono: \n");
			
			while(i<docenti.size()) {
				
				System.out.println(docenti.get(i).GetDocente());
				
				i++;
				
			}
			
			
		}
		
	}
	
	public static class Docente{
		
		private Integer matricola;
		private String nome;
		private String cognome;
		
		public Docente(Integer _matricola,String _nome, String _cognome){
		
			this.matricola = _matricola;
			this.nome = _nome;
			this.cognome = _cognome;
		}
		
		public String GetDocente() {
			
			return "[ " + this.matricola + " - " + this.nome + " - " + this.cognome + " ]";
			
			
		
		}
	}
}
