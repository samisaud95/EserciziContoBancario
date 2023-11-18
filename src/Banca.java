import java.util.Arrays;

public class Banca {
    public double saldoTotale;
    private String nomeBanca;
    private ContoBancario[] contoBancarioArray;
    private int numConti;

    public Banca(String nomeBanca, int maxConti) {
        this.nomeBanca = nomeBanca;
        this.contoBancarioArray = new ContoBancario[maxConti];
        this.numConti = 0;
    }
    public ContoBancario[] getContoBancarioArray() {
        return contoBancarioArray;
    }
    public String getnomeBanca() {
        return nomeBanca;
    }
    public void setContoBancarioArray() {
        this.contoBancarioArray = contoBancarioArray;
    }
    public void setNomeBanca() {
        this.nomeBanca = nomeBanca;
    }
    public int getNumConti() {
        return numConti;
    }

    public void setNumConti() {
        this.numConti = numConti;
    }

    public void aggiungiConto(ContoBancario conto) {
        if (numConti < contoBancarioArray.length) {
            contoBancarioArray[numConti] = conto;
            numConti++;
        } else {
            System.out.println("hai aggiunto l'importo massimo" + getnomeBanca() + "il massimo" + contoBancarioArray.length + "conti");
        }
    }
    public void visuaLizzaInformazioniConti() {
        System.out.println("Nome Banca" + nomeBanca);
        for (int i = 0; i < numConti; i++) {
            contoBancarioArray[i].stampaTutti();
        }
    }
     public double saldoTotale (){
        double saldo =0.0;
           for (int i = 0; i < numConti; i++) {
                    saldo = saldo + contoBancarioArray[i].getSaldo();
                }
                return saldo;
            }
    }









