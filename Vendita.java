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

public class Vendita {
    
    public static int idProgeressivo = 1;
    public String vendita= "";
    int id;
    Giocattolo g;
    Cliente p;

    public Vendita(Giocattolo g, Cliente p){
        this.g = g;
        this.p = p;
        idProgeressivo++;
    }

}
