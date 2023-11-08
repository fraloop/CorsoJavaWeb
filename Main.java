/* 
 * Esercizio Java per Giocattolaio (Senza DB)
Descrizione: Implementare un'applicazione Java per gestire l'inventario e le vendite di un negozio di giocattoli.

Task:
Definizione delle Classi:
Crea una classe Giocattolo con campi come id, nome, prezzo e età consigliata.
Crea una classe Cliente con campi come id, nome e indirizzo email.
Crea una classe Vendita che registra gli acquisti dei clienti.
Gestione dell'Inventario:
Implementa una classe Inventario che tiene traccia dei giocattoli disponibili e che possa essere aggiornata da un o specifico admin.
Processo di Vendita:
Implementa una classe  ASTRATTA RegistroVendite che gestisce le vendite dei giocattoli ai clienti e che deve contenere SOLO metodi.
Interfaccia Utente:
Crea un'interfaccia utente semplice in console per interagire con l'utente, permettendo loro di acquistare giocattoli e visualizzare le vendite.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Giocattolo g1 = new Giocattolo("scacchi",20,3);
        Giocattolo g2 = new Giocattolo("dama", 15,3);
        Giocattolo g3 = new Giocattolo("bicicletta", 130, 10);
        Giocattolo g4 = new Giocattolo("monopattino", 60, 10);

        int ritorno;

        Inventario inventario = new Inventario();
        ArrayList <Giocattolo> acquisti = new ArrayList<Giocattolo>();


        inventario.aggiungiGiocattolo(g1);
        inventario.aggiungiGiocattolo(g2);
        inventario.aggiungiGiocattolo(g3);
        inventario.aggiungiGiocattolo(g4);

        //registrazione - login;
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci mail: ");
        String mail = input.nextLine();
        System.out.print("Inserisci nome: ");
        String nome = input.nextLine();
        Cliente c1 = new Cliente(nome,mail);
        if((mail.equals("admin")) && (nome.equals("admin"))){

            //menu per admin
            do{
                ritorno = Interfaccia.richiediMetodo(inventario,c1);

            }while(ritorno > 0);

        }else{

            do{
                ritorno = Interfaccia.metodiCliente(inventario,c1,acquisti);
            }while(ritorno > 0);


            
        }


      

        //posso far ritornare un valore della funzione e se è negativo esco dal programma


    }
    
}
