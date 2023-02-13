package CadastroAcademico.Classes;


abstract public class Pessoa_Nota extends Pessoa {
    
    private String materia;
    private double np1;
    private double np2;
    private double na1;
    private double na2;

    protected Pessoa_Nota (){
    }
    
    protected Pessoa_Nota (String materia, double np1, double np2 , double na1 , double na2) {
        this.materia = materia;
        this.np1 = np1;
        this.np2 = np2;
        this.na1 = na1;
        this.na2 = na2;
    }

    protected Pessoa_Nota (String materia, String nome, String cpf, String matricula, int ano, int mes, int dia, double np1, double np2, double na1, double na2) {
        super(nome, cpf, matricula, ano, mes, dia);
        this.materia= materia;
        this.np1 = np1;
        this.np2 = np2;
        this.na1 = na1;
        this.na2 = na2;
    }
    
    public void setNp1(double np1){
        this.np1 = np1;
    }
    
    public double getNp1(){
        return np1;
    }
    
    public void setNp2(double np2){
        this.np2 = np2;
    }
    
    public double getNp2(){
        return np2;
    }
    
    public void setNa1(double na1){
        this.na1 = na1;
    }
    
    public double getNa1(){
        return na1;
    }
    
    public void setNa2(double na2){
        this.na2 = na2;
    }
    
    public double getNa2(){
        return na2;
    }

    protected String getMateria() {
        return materia;
    }

    protected void setMateria(String materia) {
        this.materia = materia;
    }
    
    public double calculaMedia(){
        double max1 = (np1 + na1);
        double max2 = (np2 + na2);
        double media = (max1 + max2) / 2.0;
        return media;
    
    }
        
}
    