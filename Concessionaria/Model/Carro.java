// Guilherme Luiz Machado Machancoses - TADS - 2º semestre - RA: 0005/22-1.
package Concessionaria.Model;

abstract public class Carro {

    private String nome;
    private String modelo;
    private String popcao;
    private String sopcao;
    private String topcao;
    private String qopcao;
    private String uopcao;



    protected Carro() {
    }

    protected Carro(String nome, String modelo, String popcao, String sopcao, String topcao, String qopcao, String uopcao) {
        this.nome = nome;
        this.modelo = modelo;
        this.popcao = popcao;
        this.sopcao = sopcao;
        this.topcao = topcao;
        this.qopcao = qopcao;
        this.uopcao = uopcao;
    }

    /*nome*/
    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }
    /*modelo */
    protected String getModelo() {
        return modelo;
    }

    protected void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /*Primeira opcao */
    protected String getPopcao() {
        return popcao;
    }

    protected void setPopcao(String popcao) {
        this.popcao = popcao;
    }
    /*Segunda opcao */
    protected String getSopcao() {
        return sopcao;
    }

    protected void setSopcao(String sopcao) {
        this.sopcao = sopcao;
    }
    /*Terceira opcao */
    protected String getTopcao() {
        return topcao;
    }

    protected void setTopcao(String topcao) {
        this.topcao = topcao;
    }
    /*Quarta opcao */
    protected String getQopcao() {
        return qopcao;
    }

    protected void setQopcao(String qopcao) {
        this.qopcao = qopcao;
    }
    /*Ultima opcao */
    protected String getUopcao() {
        return uopcao;
    }

    protected void setUopcao(String uopcao) {
        this.uopcao = uopcao;
    }   
    
}