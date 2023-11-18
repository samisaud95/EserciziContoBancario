public class Main {
    public static void main(String[] args) {
 ContoBancario conto1 = new ContoBancario("Vz 01023334657894",760);
 ContoBancario conto2= new ContoBancario("Vz 01347658954970",29);
 Banca BBVA= new Banca("BBVA :",40);
 BBVA.aggiungiConto(conto1);
 BBVA.aggiungiConto(conto2);
 BBVA.visuaLizzaInformazioniConti();
 System.out.println("Saldo Totale della Banca :"+  BBVA.saldoTotale());
    }
}