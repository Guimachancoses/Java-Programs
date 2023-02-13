// Guilherme Luiz Machado Machancoses - TADS - 2º semestre - RA: 0005/22-1.
package Concessionaria.Model;
abstract public class Carro_Brasilia extends Carro{
    
    private Double vbrasilia1;
    private Double vbrasilia2;
    private Double vbrasilia3;

    protected Carro_Brasilia() {
    }

    protected Carro_Brasilia(Double vbrasilia1, Double vbrasilia2, Double vbrasilia3) {
        this.vbrasilia1 = vbrasilia1;
        this.vbrasilia2 = vbrasilia2;
        this.vbrasilia3 = vbrasilia3;
    }

    protected Carro_Brasilia(Double vbrasilia1, Double vbrasilia2, Double vbrasilia3, String nome, String modelo, String popcao, String sopcao, String tpocao, String qopcao, String uopcao) {
        super(nome, modelo, popcao, sopcao, tpocao, qopcao, uopcao);
        this.vbrasilia1 = vbrasilia1;
        this.vbrasilia2 = vbrasilia2;
        this.vbrasilia3 = vbrasilia3;
    }
    /*1*/
    protected Double getVbrasilia1() {
        return vbrasilia1;
    }

    protected void setVbrasilia1(Double vbrasilia1) {
        this.vbrasilia1 = vbrasilia1;
    }
    /*2*/
    protected Double getVbrasilia2() {
        return vbrasilia2;
    }

    protected void setVbrasilia2(Double vbrasilia2) {
        this.vbrasilia2 = vbrasilia2;
    }
    /*3*/
    protected Double getVbrasilia3() {
        return vbrasilia3;
    }

    protected void setVbrasilia3(Double vbrasilia3) {
        this.vbrasilia3 = vbrasilia3;
    }
    /*total*/
    public double getTbrasilia(){

        double tbrasilia = (vbrasilia1 + vbrasilia2 + vbrasilia3);
        return tbrasilia;
    }

}