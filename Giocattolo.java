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

public class Giocattolo{

    static Integer idProgressivo = 1;
    private static String codiceGiocattolo = "";
    String nome;
    private int prezzo;
    private int etàConsigliata;

    public Giocattolo(String nome, int prezzo, int etàConsigliata){
        if( !(nome.equals("")) && (prezzo != 0) && (etàConsigliata != 0 )){
            this.nome = nome;
            this.prezzo = prezzo;
            this.etàConsigliata = etàConsigliata;
            codiceGiocattolo += nome + "_PROD_" + idProgressivo.toString();
            idProgressivo++;
        }
    }



    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        if(!(nome.equals(""))){
            this.nome = nome;
        }else{
            System.out.println("nome inserito non valido");
        }
    }

    public int getPrezzo(){
        return prezzo;
    }

    public void setPrezzo(int prezzo){
        if(prezzo != 0){
            this.prezzo = prezzo;
        }else{
            System.out.println("valori inseriti non validi");
        }
    }

    public int getEtàConsigliata(){
        return etàConsigliata;
    }

    public void setEtàConsigliata(int etàConsigliata){
        this.etàConsigliata = etàConsigliata;
    }

    @Override
    public String toString(){
        return nome + " costa " + prezzo + " e l'età consigliata è: " + etàConsigliata;
    }
}