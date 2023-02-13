package CadastroAcademico.Programa;

import java.util.ArrayList;

import CadastroAcademico.Cadastros.Cadastro_Pessoa_Aluno;
import CadastroAcademico.Cadastros.Cadastro_Pessoa_Nota;
import CadastroAcademico.Cadastros.Cadastro_Pessoa_Professor;
import CadastroAcademico.Menu.Menu;

public class Main {
    public static void main(String[] args) {       
        
        ArrayList<Cadastro_Pessoa_Aluno> Aluno = new ArrayList<>();
        ArrayList<Cadastro_Pessoa_Professor> Professor = new ArrayList<>();
        ArrayList<Cadastro_Pessoa_Nota> Nota = new ArrayList<>();

        Menu.MenuPrincipal(Professor, Aluno, Nota);   
    }

}