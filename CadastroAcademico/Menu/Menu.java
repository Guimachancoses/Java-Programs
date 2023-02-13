package CadastroAcademico.Menu;

import CadastroAcademico.Cadastros.Mensagem_Menu;
import CadastroAcademico.Cadastros.Cadastro_Pessoa_Aluno;
import CadastroAcademico.Cadastros.Cadastro_Pessoa_Nota;
import CadastroAcademico.Cadastros.Cadastro_Pessoa_Professor;
import CadastroAcademico.Classes.Pessoa_Aluno;
import CadastroAcademico.Classes.Pessoa_Nota;
import CadastroAcademico.Classes.Pessoa_Professor;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private static Scanner recebe = new Scanner(System.in);
    private static int opcao;
    private static int mat_prof = 1;
    private static int mat_aluno = 1;
    private static int mat_nota = 1;

    
    public static void MenuPrincipal(ArrayList<Cadastro_Pessoa_Professor> professor, ArrayList<Cadastro_Pessoa_Aluno> aluno, ArrayList<Cadastro_Pessoa_Nota> nota) {

        
        while (0 == 0) {
            
        
            System.out.println("\n===============================================");
            System.out.println("                    MENU PRINCIPAL               ");
            System.out.println("===============================================\n");
            System.out.println("1 - CADASTRAR ");
            System.out.println("2 - CONSULTAR ");
            System.out.println("3 - EDITAR CADASTRO ");
            System.out.println("4 - DELETAR CADASTRO ");
            System.out.println("5 - **SAIR** ");
            System.out.print("\nOpção escolhida: ");
            opcao = recebe.nextInt();
            
            switch (opcao) {

                case 1:
                    MenuCadastro(professor, aluno, nota);
                    break;

                case 2:
                    MenuConsulta(professor, aluno, nota);
                    break;

                case 3:
                    MenuEdicao(professor, aluno, nota);
                    break;

                case 4:
                    MenuExclusao(professor, aluno, nota);
                    break;

                case 5:
                    Mensagem_Menu.Sair();
                    break;

                default:
                    Mensagem_Menu.OpInvalida();
                    break;

            }
            
        }

    }

    
    private static void MenuCadastro(ArrayList<Cadastro_Pessoa_Professor> professor, ArrayList<Cadastro_Pessoa_Aluno> aluno, ArrayList<Cadastro_Pessoa_Nota> nota) {

        while (0 == 0) {

            System.out.println("\n=================================================");
            System.out.println("                    MENU DE CADASTRO               ");
            System.out.println("=================================================\n");
            System.out.println("1 - ALUNO ");
            System.out.println("2 - PROFESSOR ");
            System.out.println("3 - NOTAS ALUNO ");
            System.out.println("4 - **VOLTAR P/ MENU PRINCIPAL**");
            System.out.println("5 - **SAIR** ");
            System.out.print("\nOpção escolhida: ");
            opcao = recebe.nextInt();

            switch (opcao) {

                case 1:
                    Cadastro_Pessoa_Aluno a = new Cadastro_Pessoa_Aluno();
                    a.Cadastra(mat_aluno);
                    aluno.add(a);
                    mat_aluno++;
                    break;

                case 2:
                    Cadastro_Pessoa_Professor p = new Cadastro_Pessoa_Professor();
                    p.Cadastra(mat_prof);
                    professor.add(p);
                    mat_prof++;
                    break;

                case 3:
                    Cadastro_Pessoa_Nota n = new Cadastro_Pessoa_Nota();
                    n.CadastraNota(mat_aluno);
                    nota.add(n);
                    mat_nota++;
                    break;

                case 4:
                    MenuPrincipal(professor, aluno, nota);
                    break;

                case 5:
                    Mensagem_Menu.Sair();
                    break;

                default:
                    Mensagem_Menu.OpInvalida();
                    break;

            }
        }

    }

    
    private static void MenuConsulta(ArrayList<Cadastro_Pessoa_Professor> professor, ArrayList<Cadastro_Pessoa_Aluno> aluno, ArrayList<Cadastro_Pessoa_Nota> nota) {

        while (0 == 0) {

            System.out.println("\n=================================================");
            System.out.println("                    MENU DE CONSULTA               ");
            System.out.println("=================================================\n");
            System.out.println("1 - ALUNO ");
            System.out.println("2 - PROFESSOR ");
            System.out.println("3 - NOTAS ALUNOS");
            System.out.println("4 - **VOLTAR P/ MENU PRINCIPAL**");
            System.out.println("5 - **SAIR** ");
            System.out.print("\nOpção escolhida: ");
            opcao = recebe.nextInt();

            switch (opcao) {

                case 1:

                    if (aluno.isEmpty()) {

                        System.out.println("\nNenhum aluno cadastrado!");

                    } else {

                        System.out.println("\n-----------------------------------------");
                        System.out.println("        RELATÓRIO DE ALUNOS CADASTRADOS");
                        System.out.println("-----------------------------------------\n");

                        for (Cadastro_Pessoa_Aluno a : aluno) {

                            a.Consulta();
                        }
                    }
                    break;

                case 2:

                    if (professor.isEmpty()) {

                        System.out.println("\nNenhum professor cadastrado!");
                    } else {

                        System.out.println("\n------------------------------------------");
                        System.out.println("     RELATÓRIO DE PROFESSORES CADASTRADOS");
                        System.out.println("------------------------------------------\n");

                        for (Cadastro_Pessoa_Professor p : professor) {

                            p.Consulta();
                        }
                    }
                    break;
                
                case 3:

                    if (aluno.isEmpty()) {

                        System.out.println("\nNenhum aluno cadastrado!");
                    } else {

                        System.out.println("\n------------------------------------------");
                        System.out.println("     RELATÓRIO DE NOTAS CADASTRADOS");
                        System.out.println("------------------------------------------\n");

                        for (Cadastro_Pessoa_Nota n : nota) {

                            n.ConsultaNota();
                        }
                    }
                    break;

                case 4:
                    MenuPrincipal(professor, aluno, nota);
                    break;

                case 5:
                    Mensagem_Menu.Sair();
                    break;

                default:
                    Mensagem_Menu.OpInvalida();
                    break;

            }
        }

    }

    
    private static void MenuEdicao(ArrayList<Cadastro_Pessoa_Professor> professor, ArrayList<Cadastro_Pessoa_Aluno> aluno, ArrayList<Cadastro_Pessoa_Nota> nota) {

        while (0 == 0) {

            System.out.println("\n=================================================");
            System.out.println("             MENU DE EDIÇÃO DE CADASTRO            ");
            System.out.println("=================================================\n");
            System.out.println("1 - ALUNO ");
            System.out.println("2 - PROFESSOR ");
            System.out.println("3 - NOTAS ");
            System.out.println("4 - **VOLTAR P/ MENU PRINCIPAL**");
            System.out.println("5 - **SAIR** ");
            System.out.print("\nOpção escolhida: ");
            opcao = recebe.nextInt();

            switch (opcao) {

                case 1:

                    if (aluno.isEmpty()) {

                        System.out.println("\nNenhum aluno cadastrado!");

                    } else {

                        boolean atualizado_al = false;

                        Scanner recebe_mat_al = new Scanner(System.in);
                        String matricula_edita_aluno;

                        System.out.print("\nInforme a matrícula do aluno: ");
                        matricula_edita_aluno = recebe_mat_al.nextLine();

                        for (Cadastro_Pessoa_Aluno a : aluno) {

                            if (a.Edita(matricula_edita_aluno)) {
                                atualizado_al = true;
                                System.out.println("\nCadastro atualizado com sucesso!");
                                a.Consulta();
                            }
                        }

                        if (!atualizado_al) {

                            System.out.println("\nCadastro não localizado!");
                        }
                    }

                    break;

                case 2:

                    if (professor.isEmpty()) {

                        System.out.println("\nNenhum professor cadastrado!");
                    } else {

                        boolean atualizado_prof = false;

                        Scanner recebe_mat_prof = new Scanner(System.in);
                        String matricula_edita_professor;

                        System.out.print("\nInforme a matrícula do professor: ");
                        matricula_edita_professor = recebe_mat_prof.nextLine();

                        for (Cadastro_Pessoa_Professor p : professor) {

                            if (p.Edita(matricula_edita_professor)) {
                                atualizado_prof = true;
                                System.out.println("\nCadastro atualizado com sucesso!");
                                p.Consulta();
                            }
                        }

                        if (!atualizado_prof) {

                            System.out.println("\nCadastro não localizado!");
                        }
                    }

                    break;
                
                case 3:

                    if (aluno.isEmpty()) {

                        System.out.println("\nNenhum aluno cadastrado!");

                    } else {

                        boolean atualizado_nota = false;

                        Scanner recebe_mat_al = new Scanner(System.in);
                        String matric_al;

                        System.out.print("\nInforme a matrícula do aluno: ");
                        matric_al = recebe_mat_al.nextLine();

                        for (Cadastro_Pessoa_Nota n : nota) {

                            if (n.EditaNota(matric_al)) {
                                atualizado_nota = true;
                                System.out.println("\nNotas atualizadas com sucesso!");
                                n.ConsultaNota();
                            }
                        }

                        if (!atualizado_nota) {

                            System.out.println("\nCadastro não localizado!");
                        }
                    }

                    break;

                case 4:
                    MenuPrincipal(professor, aluno, nota);
                    break;

                case 5:
                    Mensagem_Menu.Sair();
                    break;

                default:
                    Mensagem_Menu.OpInvalida();
                    break;

            }
        }

    }

    
    private static void MenuExclusao(ArrayList<Cadastro_Pessoa_Professor> professor, ArrayList<Cadastro_Pessoa_Aluno> aluno, ArrayList<Cadastro_Pessoa_Nota> nota) {

        while (0 == 0) {

            System.out.println("\n=================================================");
            System.out.println("           MENU DE EXCLUSAO DE CADASTRO            ");
            System.out.println("=================================================\n");
            System.out.println("1 - ALUNO ");
            System.out.println("2 - PROFESSOR ");
            System.out.println("3 - NOTAS ");
            System.out.println("4 - **VOLTAR P/ MENU PRINCIPAL**");
            System.out.println("5 - **SAIR** ");
            System.out.print("\nOpção escolhida: ");
            opcao = recebe.nextInt();

            switch (opcao) {

                case 1:

                    if (aluno.isEmpty()) {

                        System.out.println("\nNenhum aluno cadastrado!");

                    } else {

                        boolean removidoA = false;

                        Scanner recebe_mat_al = new Scanner(System.in);
                        String matricula_Aluno;

                        System.out.print("\nInforme a matrícula do aluno: ");
                        matricula_Aluno = recebe_mat_al.nextLine();

                        for (int i = 0; i < aluno.size(); i++) {

                            if (aluno.get(i).Exclui(matricula_Aluno)) {
                                aluno.remove(i);
                                removidoA = true;
                            }
                        }

                        if (removidoA) {
                            System.out.println("\nCadastro excluído!");
                        } else {
                            System.out.println("\nCadastro não localizado!");
                        }
                    }

                    break;

                case 2:

                    if (professor.isEmpty()) {

                        System.out.println("\nNenhum professor cadastrado!");
                    } else {

                        boolean removidoP = false;

                        Scanner recebe_mat_prof = new Scanner(System.in);
                        String matricula_Professor;

                        System.out.print("\nInforme a matrícula do professor: ");
                        matricula_Professor = recebe_mat_prof.nextLine();

                        for (int i = 0; i < professor.size(); i++) {

                            if (professor.get(i).Exclui(matricula_Professor)) {
                                professor.remove(i);
                                removidoP = true;
                            }
                        }

                        if (removidoP) {
                            System.out.println("\nCadastro excluído!");
                        } else {
                            System.out.println("\nCadastro não localizado!");
                        }
                    }
                    break;
                
                case 3:

                    if (aluno.isEmpty()) {

                        System.out.println("\nNenhum aluno cadastrado!");

                    } else {

                        boolean removidoN = false;

                        Scanner recebe_mat_al = new Scanner(System.in);
                        String matricula_Aluno;

                        System.out.print("\nInforme a matrícula do aluno: ");
                        matricula_Aluno = recebe_mat_al.nextLine();

                        for (int i = 0; i < nota.size(); i++) {

                            if (nota.get(i).ExcluiNota(matricula_Aluno)) {
                                nota.remove(i);
                                removidoN = true;
                            }
                        }

                        if (removidoN) {
                            System.out.println("\nTodas as Notas desse Aluno foram excluídas!");
                        } else {
                            System.out.println("\nCadastro não localizado!");
                        }
                    }

                    break;

                case 4:
                    MenuPrincipal(professor, aluno, nota);
                    break;

                case 5:
                    Mensagem_Menu.Sair();
                    break;

                default:
                    Mensagem_Menu.OpInvalida();
                    break;

            }
        }

    }
}
