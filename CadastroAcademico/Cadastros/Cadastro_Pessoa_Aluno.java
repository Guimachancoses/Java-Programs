package CadastroAcademico.Cadastros;

import java.time.LocalDate;
import java.util.Scanner;

public class Cadastro_Pessoa_Aluno extends CadastroAcademico.Classes.Pessoa_Aluno implements Interface_Pessoa {

    
    public Cadastro_Pessoa_Aluno() {
    }
    

    public Cadastro_Pessoa_Aluno(String turma, String nome, String cpf, String matricula, int ano, int mes, int dia) {
        super(turma, nome, cpf, matricula, ano, mes, dia);
    }   

    
        @Override
        public void Cadastra(int mat) {

            try {

                    Scanner recebe = new java.util.Scanner(System.in);

                    /*Nome*/
                    System.out.print("\nNome: ");
                    super.setNome(recebe.nextLine());

                    /*Data de Nascimento*/
                    System.out.print("Data de Nascimento(dd/mm/aaaa): ");
                    String[] data = recebe.nextLine().split("/");

                    int dia = Integer.parseInt(data[0]);
                    int mes = Integer.parseInt(data[1]);
                    int ano = Integer.parseInt(data[2]);

                    super.setNascimento(ano, mes, dia);

                    /*CPF*/
                    System.out.print("CPF(111.222.333-44):");
                    super.setCpf(recebe.nextLine());

                    /*Turma*/
                    System.out.print("Turma: ");
                    super.setTurma(recebe.nextLine());

                    /*Matrícula*/
                    String matricula = "RA" + LocalDate.now().getYear()+LocalDate.now().getMonthValue() + "-0" + mat;

                    super.setMatricula(matricula);
                }
            catch (RuntimeException e){
                System.out.println("ERRO: Verifique o tipo de entrada solicitada!");                
            }
        }

        @Override
        public void Consulta() {
            try{

                System.out.println("\nNome: " + super.getNome());
                System.out.println("Matricula: " + super.getMatricula());
                System.out.println("Turma: " + super.getTurma());
                System.out.println("CPF: " + super.getCpf());
                System.out.println("Data de Nascimento: " + super.getNascimento());
                System.out.println("**************************************************************");
            }
            catch (RuntimeException e){
                System.out.println("ERRO: Verifique o tipo de entrada solicitada!");
            }
        }

        @Override
        public boolean Edita(String matricula) {

            if (super.getMatricula().equalsIgnoreCase(matricula)) {
                try{

                    Scanner recebe = new java.util.Scanner(System.in);

                    /*Nome*/
                    System.out.print("\nNome: ");
                    super.setNome(recebe.nextLine());

                    /*Data de Nascimento*/
                    System.out.print("Data de Nascimento(dd/mm/aaaa): ");
                    String[] data = recebe.nextLine().split("/");

                    int dia = Integer.parseInt(data[0]);
                    int mes = Integer.parseInt(data[1]);
                    int ano = Integer.parseInt(data[2]);

                    super.setNascimento(ano, mes, dia);

                    /*CPF*/
                    System.out.print("CPF(111.222.333-44):");
                    super.setCpf(recebe.nextLine());

                    /*Turma*/
                    System.out.print("Turma: ");
                    super.setTurma(recebe.nextLine());
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
        public boolean Exclui(String matricula) {

            if (super.getMatricula().equalsIgnoreCase(matricula)) {

                return true;
            } else {
                return false;
            }
        }
       
}