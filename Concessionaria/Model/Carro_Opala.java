// Guilherme Luiz Machado Machancoses - TADS - 2º semestre - RA: 0005/22-1.
package Concessionaria.Model;


abstract public class Carro_Opala extends Carro{
    
    private Double vopala1;
    private Double vopala2;
    private Double vopala3;

    protected Carro_Opala() {
    }

    protected Carro_Opala(Double vopala1, Double vopala2, Double vopala3) {
        this.vopala1 = vopala1;
        this.vopala2 = vopala2;
        this.vopala3 = vopala3;
    }

    protected Carro_Opala(Double vopala1, Double vopala2, Double vopala3, String nome, String modelo, String popcao, String sopcao, String tpocao, String qopcao, String uopcao) {
        super(nome, modelo, popcao, sopcao, tpocao, qopcao, uopcao);
        this.vopala1 = vopala1;
        this.vopala2 = vopala2;
        this.vopala3 = vopala3;
    }
    /*1*/
    protected Double getVopala1() {
        return vopala1;
    }

    protected void setVopala1(Double vopala1) {
        this.vopala1 = vopala1;
    }
    /*2*/
    protected Double getVopala2() {
        return vopala2;
    }

    protected void setVopala2(Double vopala2) {
        this.vopala2 = vopala2;
    }
    /*3*/
    protected Double getVopala3() {
        return vopala3;
    }

    protected void setVopala3(Double vopala3) {
        this.vopala3 = vopala3;
    }
    /*total*/
    public double getTopala(){
        double topala = (vopala1 + vopala2 + vopala3);
        return topala;
    }
}