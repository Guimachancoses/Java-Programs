// Guilherme Luiz Machado Machancoses - TADS - 2º semestre - RA: 0005/22-1.
package Concessionaria.Controller;

public class Mensagem_Menu {

    static final String ANSI_RESET = "\u001B[0m";
    static final String ANSI_RED_BACKGROUND = "\u001B[31m";
    
    public static void Sair(){
        
        System.out.println(ANSI_RED_BACKGROUND + "\n----------------------------------------" + ANSI_RESET);
        System.out.println(ANSI_RED_BACKGROUND + "            SAINDO DO SISTEMA..." + ANSI_RESET);
        System.out.println(ANSI_RED_BACKGROUND + "----------------------------------------\n" + ANSI_RESET);
        
        // System.exit(0);
    }
    
    public static void OpInvalida(){
        
        System.out.println(ANSI_RED_BACKGROUND + "\n----------------------------------------" + ANSI_RESET);
        System.out.println(ANSI_RED_BACKGROUND + "     OPÇÃO INVÁLIDA, TENTE NOVAMENTE!" + ANSI_RESET);
        System.out.println(ANSI_RED_BACKGROUND + "----------------------------------------\n" + ANSI_RESET);
        
    }
}