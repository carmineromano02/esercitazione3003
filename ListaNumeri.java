import java.io.*;
import java.util.ArrayList;
import java.util.List;

//CARICARE UNA LISTA DI NUMERI E MOSTRARE A VIDEO I VALORI DELLA LISTA CARICATA

public class ListaNumeri {

    private static BufferedReader oLeggi = new BufferedReader (new InputStreamReader(System.in));

    public static void main(String args[]) throws IOException {
        System.out.println("Inserisci un numero e premi invio");
        System.out.println("Quando hai finito , scrivi 'finito'");

        boolean finito = false;
        //DEFINISCO LA LISTA
        List<Integer> lista_array = new ArrayList<>();

        //CICLO ITERATIVO FINCHE L'UTENTE NON SCRIVE "FINITO" CHE PRENDE VALORI IN INPUT E LI INSERISCE NELLA LISTA
        while(!finito){
            String input_utente = oLeggi.readLine().toString();
            if(input_utente.equals("finito")){
                finito = true;
            }else{
                lista_array.add(Integer.parseInt(input_utente));
                System.out.println("Inserisci un nuovo numero e premi invio");
            }
        }

        int x = 0;
        int dim_array = lista_array.size();
        String risultato = "[";

        // FORMATO RISULTATO ASPETTATO : [1,2,3,4,5]
        //CICLO ITERATIVO SCORRO LA LISTA E CONCATENO I VALORI DEGLI ELEMENTI DELLA LISTA
        while(x < dim_array){
            Integer numero_attuale = lista_array.get(x);
            risultato = risultato.concat(numero_attuale.toString());
            if(x != dim_array - 1){
                risultato = risultato.concat(",");
            }
            x++;
        }
        risultato = risultato.concat("]");
        //VISUALIZZO A VIDEO IL RISULTATO DELLA CONCATENAZIONE
        System.out.println(risultato);
    }


}
