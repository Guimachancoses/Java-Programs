// Guilherme Luiz Machado Machancoses - TADS - 2º semestre - RA: 0005/22-1.
package Concessionaria.Model;


abstract public class Carro_Fusca extends Carro{
    
    private Double vfusca1;
    private Double vfusca2;
    private Double vfusca3;

    protected Carro_Fusca() {
    }

    protected Carro_Fusca(Double vfusca1, Double vfusca2, Double vfusca3) {
        this.vfusca1 = vfusca1;
        this.vfusca2 = vfusca2;
        this.vfusca3 = vfusca3;
    }

    protected Carro_Fusca(Double vfusca1, Double vfusca2, Double vfusca3, String nome, String modelo, String popcao, String sopcao, String tpocao, String qopcao, String uopcao) {
        super(nome, modelo, popcao, sopcao, tpocao, qopcao, uopcao);
        this.vfusca1 = vfusca1;
        this.vfusca2 = vfusca2;
        this.vfusca3 = vfusca3;
    }
    /*1*/
    protected Double getVfusca1() {
        return vfusca1;
    }

    protected void setVfusca1(Double vfusca1) {
        this.vfusca1 = vfusca1;
    }
    /*2*/
    protected Double getVfusca2() {
        return vfusca2;
    }

    protected void setVfusca2(Double vfusca2) {
        this.vfusca2 = vfusca2;
    }
    /*3*/
    protected Double getVfusca3() {
        return vfusca3;
    }

    protected void setVfusca3(Double vfusca3) {
        this.vfusca3 = vfusca3;
    }
    /*total*/
    public double getTfusca(){
        double tfusca = (vfusca1 + vfusca2 + vfusca3);
        return tfusca;
    }
}