package CadastroAcademico.Cadastros;

import java.time.LocalDate;
import java.util.Scanner;


public class Cadastro_Pessoa_Nota extends CadastroAcademico.Classes.Pessoa_Nota implements Interface_Nota {

    
    public Cadastro_Pessoa_Nota() {
    }


    public Cadastro_Pessoa_Nota (String materia, String nome, String cpf, String matricula, int ano, int mes, int dia, double np1, double np2, double na1, double na2) {
        super(materia, nome, cpf, matricula, ano, mes, dia, np1, np2, na1, na2);
    }


        @Override
        public void CadastraNota(int mat) {

            try{
                

                Scanner recebe = new Scanner(System.in);

                System.out.print("Digite RA do aluno que deseja cadastrar as notas: ");
                super.setMatricula(recebe.nextLine());
                System.out.print("Digite nome do aluno que deseja cadastrar as notas: ");
                super.setNome(recebe.nextLine());
                System.out.print("Digite qual matéria você deseja inseria as notas do aluno: ");
                super.setMateria(recebe.nextLine());
                System.out.print("Digite a nota da P1: ");
                super.setNp1(recebe.nextDouble());
                System.out.print("Digite a nota da P2: ");
                super.setNp2(recebe.nextDouble());
                System.out.print("Digite a nota da A.I(1): ");
                super.setNa1(recebe.nextDouble());
                System.out.print("Digite a nota da A.I(2): ");
                super.setNa2(recebe.nextDouble());
                
            }
            catch (RuntimeException e){
                System.out.println("ERRO: Verifique o tipo de entrada solicitada!");
            }
                
        }


        @Override
        public boolean EditaNota(String matricula) {

            if (super.getMatricula().equalsIgnoreCase(matricula)) {

                try{

                    Scanner recebe = new Scanner(System.in);

                    System.out.print("Digite a nota da P1: ");
                    super.setNp1(recebe.nextDouble());
                    System.out.print("Digite a nota da P2: ");
                    super.setNp2(recebe.nextDouble());
                    System.out.print("Digite a nota da A.I(1): ");
                    super.setNa1(recebe.nextDouble());
                    System.out.print("Digite a nota da A.I(2): ");
                    super.setNa2(recebe.nextDouble());
                    
                }
                catch (RuntimeException e){
                    System.out.println("ERRO: Verifique o tipo de entrada solicitada!");
                }
                return true;
            } else {
                return false;
            }
        }

        @Override
        public void ConsultaNota() {

            try{

                System.out.println("**************************************************************");
                System.out.println("\nNome: " + super.getNome());
                System.out.println("Matricula: " + super.getMatricula());
                System.out.println("Materia: " + super.getMateria());
                System.out.println("Nota da P1: " + super.getNp1());
                System.out.println("Nota da P2: " + super.getNp2());
                System.out.println("Nota da A.I(1): " + super.getNa1());
                System.out.println("Nota da A.I(2): " + super.getNa2());
                System.out.println("**************************************************************");
            }
            catch (RuntimeException e){
                System.out.println("ERRO: Verifique o tipo de entrada solicitada!");
            }
        }

        
            
        public boolean ExcluiNota(String matricula) {

                
            if (super.getMatricula().equalsIgnoreCase(matricula)) {

                return true;
            } else {
                return false;
            }
        }
       
}

