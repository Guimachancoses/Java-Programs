// Guilherme Luiz Machado Machancoses - TADS - 2º semestre - RA: 0005/22-1.

package AgendaTelefonica;

import java.util.Scanner;

public class CadastroClientesArquivo {
    // nome do arquivo em que os dados sao armazenadoss.
    static String nomeAquivo = "Agenda_de_contatos.txt";
    static final String ANSI_RESET = "\u001B[0m";
    static final String ANSI_YELLOW = "\u001B[33m";
    static final String ANSI_RED_BACKGROUND = "\u001B[31m";
    static final String ANSI_RED_BLUE_BACKGROUND = "\uu001B[34m";

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // habilita a tecla enter como separador de conteúdo.
        teclado.useDelimiter(System.getProperty("line.separator"));

        int opcao;

        do {
            
            // exibe o menu de navegação do usúario.
            montaMenu();
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                // insere os contatos na agenda.
                    System.out.println(ANSI_YELLOW + "-- Inserindo contatos na agenda --------" + ANSI_RESET);
                    System.out.println("Informe o nome: ");
                    String nome = teclado.next();
                    
                    System.out.println("\nInforme o número de telefone ou celular: ");
                    String num = teclado.next();
                    
                // grava dados no arquivo.
                    grava(nome, num);
                    System.out.println(ANSI_RED_BLUE_BACKGROUND + "-----------------------------------------" + ANSI_RESET);
                    break;
                // Lista os contatos existentes.
                case 2:
                    System.out.println(ANSI_YELLOW + "----------- Listando contatos -----------" + ANSI_RESET);
                    System.out.println("");
                // Le dados do arquivo
                    lista();
                    System.out.println("");
                    System.out.println(ANSI_YELLOW + "-----------------------------------------" + ANSI_RESET);
                    break;
                // edita o contato da agenda.
                case 3:
                    System.out.println(ANSI_YELLOW + "-- Editar contato da lista ----------" + ANSI_RESET);
                    System.out.println("Digite o nome do contato que deseja editar: ");
                    String nomeEdita = teclado.next();
                    edita(nomeEdita);
                    System.out.println(ANSI_YELLOW + "-----------------------------------------" + ANSI_RESET);
                    break;
                // apaga o contato da agenda.
                case 4:
                    System.out.println(ANSI_YELLOW + "-- Apagar contato da lista ----------" + ANSI_RESET);
                    System.out.println("");
                    System.out.println("Digite o nome do contato que deseja remover: ");
                    String nomeRemover = teclado.next();
                    remove(nomeRemover);
                    System.out.println("");
                    System.out.println(ANSI_YELLOW + "-----------------------------------------" + ANSI_RESET);
                    break;                
                case 5:
                    System.out.println(ANSI_RED_BACKGROUND + "-- FINALIZANDO SISTEMA..." + ANSI_RESET);
                    break;
                default:
                    System.out.println(ANSI_RED_BACKGROUND + "Opção inválida!" + ANSI_RESET);
                    break;
            }

        } while (opcao != 5);

    }


    /*
     * Procedimento monta na console um menu de navegação.
     */
    static void montaMenu() {
        System.out.println(ANSI_RED_BLUE_BACKGROUND + "-----------------------------------------" + ANSI_RESET);
        System.out.println(ANSI_RED_BLUE_BACKGROUND + "|               MENU AGENDA             |" + ANSI_RESET);
        System.out.println(ANSI_RED_BLUE_BACKGROUND + "-----------------------------------------" + ANSI_RESET);
        System.out.println("");
        System.out.println("1 - Cadastrar contatos");
        System.out.println("2 - Listar contatos");
        System.out.println("3 - Editar contatos");
        System.out.println("4 - Apagar contatos");
        System.out.println("5 - Finalizar");
        System.out.println("");
        System.out.println(ANSI_RED_BLUE_BACKGROUND + "-----------------------------------------" + ANSI_RESET);
        System.out.println(ANSI_RED_BLUE_BACKGROUND + "|        DIGITE A OPÇÃO DESEJADA:       |" + ANSI_RESET);
        System.out.println(ANSI_RED_BLUE_BACKGROUND + "-----------------------------------------" + ANSI_RESET);
        System.out.println("");
    }

    /*
     * Procedimento responsável por cadastrar os dados do cliente no arquivo.
     */
    static void grava(String nome, String num) {
        Arquivo a = Arquivo.abrirEscrita(nomeAquivo, "append");
    // mantem um cliente por linha no arquivo, ex: 01232|Jose da Silva.
        Arquivo.escrever(a, num + "|" + nome);
        System.out.println(ANSI_YELLOW + "Novo contato cadastrado!!" + ANSI_RESET);
        Arquivo.fechar(a);
    }

    /*
     * Procedimento responsável por imprimir todos os clientes (linhas) cadastrados no arquivo.
     */
    static void lista() {
        Arquivo a = Arquivo.abrirLeitura(nomeAquivo);
        String linha;
        while ((linha = Arquivo.lerLinha(a)) != null) {
            String[] dados = Arquivo.separaTokens(linha, "|");
            String num = dados[0];
            String nome = dados[1];
            System.out.println("Nome: " + dados[1] + " - Numéro: " + dados[0]);
        }
        Arquivo.fechar(a);
    }

    /*
     * Procedimento remove o registro do cliente (linha) do arquivo, se existir.
     */
    static void remove(String nomeRemover) {
        //renomeia o arquivo original
        Arquivo.renomear(nomeAquivo, "Agenda_de_contatos.temp");
        Arquivo original = Arquivo.abrirLeitura("Agenda_de_contatos.temp");
        Arquivo novo = Arquivo.abrirEscrita(nomeAquivo, "new");
        String linha;

	boolean removeu = false;

    // copia do original todos os clientes com nome diferente do informado.

        while ((linha = Arquivo.lerLinha(original)) != null) {
            String[] dados = Arquivo.separaTokens(linha, "|");
            String nome = dados[1];

            if (nome.equals(nomeRemover)) {
                removeu = true;            
	    } else {
                Arquivo.escrever(novo, linha);
            }
        }

        if (removeu) {
            System.out.println(ANSI_YELLOW + "Removeu o contato " + nomeRemover + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED_BACKGROUND + "Contato não encontrado, verifique se digitou corretamente." + ANSI_RESET);
        }

        Arquivo.fechar(original);
        Arquivo.fechar(novo);

        Arquivo.apagar("Agenda_de_contatos.temp");
     
    }

    /*
     * Procedimento edita o registro do cliente (linha) do arquivo, se existir.
     */

    static void edita(String nomeEdita) {
    // renomeia o arquivo original
        Arquivo.renomear(nomeAquivo, "Agenda_de_contatos.temp");
        Arquivo original = Arquivo.abrirLeitura("Agenda_de_contatos.temp");
        Arquivo novo = Arquivo.abrirEscrita(nomeAquivo, "new");
        String linha;

	boolean editou = false;

    // copia do original todos os clientes com nome diferente do informado.

        while ((linha = Arquivo.lerLinha(original)) != null) {
            String[] dados = Arquivo.separaTokens(linha, "|");
            String nome = dados[1];

            if (nome.equals(nomeEdita)) {
                editou = true;
	    } else {
                Arquivo.escrever(novo, linha);
            }
        }

        if (editou) {
    // pede ao usuário novos dados para gravar na agenda.        
            Scanner edita = new Scanner(System.in);
            System.out.println("Informe o novo nome: ");
            String nome = edita.next();
            System.out.println("Informe o novo número: ");
            String num = edita.next();
            grava(nome,num);
            System.out.println(ANSI_YELLOW + "Contado alterado com sucesso, de " + nomeEdita + ", para " + nome + ANSI_RESET);
        
        } else {
            System.out.println(ANSI_RED_BACKGROUND + "Contato não encontrado, verifique se digitou corretamente." + ANSI_RESET);
        }

        Arquivo.fechar(original);
        Arquivo.fechar(novo);

        Arquivo.apagar("Agenda_de_contatos.temp");
    }

}