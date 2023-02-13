// Guilherme Luiz Machado Machancoses - TADS - 2º semestre - RA: 0005/22-1.
package Concessionaria.View;

import Concessionaria.Controller.Mensagem_Menu;
import Concessionaria.Controller.Venda_Carro_Fusca;
import Concessionaria.Controller.Venda_Carro_Opala;
import Concessionaria.Controller.Venda_Carro_Brasilia;
import java.util.ArrayList;
import java.util.Scanner;
public class Menu {

    private static Scanner recebe = new Scanner(System.in);
    private static int opcao;
    static final String ANSI_RESET = "\u001B[0m";
    static final String ANSI_BLUE_BACKGROUND = "\uu001B[34m";
    
    
    public static void MenuPrincipal(ArrayList<Venda_Carro_Brasilia> brasilia, ArrayList<Venda_Carro_Fusca> fusca, ArrayList<Venda_Carro_Opala> opala) {

        Boolean cond = false;
                    
        while (cond == false) {

            
            System.out.println(ANSI_BLUE_BACKGROUND + "\n==============================================================" + ANSI_RESET);
            System.out.print(ANSI_BLUE_BACKGROUND + "                           MENU PRINCIPAL                       " + ANSI_RESET);
            System.out.println(ANSI_BLUE_BACKGROUND + "\n==============================================================" + ANSI_RESET);
            System.out.println("- Escolha qual carro você quer vender: ");
            System.out.println(ANSI_BLUE_BACKGROUND + "==============================================================\n" + ANSI_RESET);
            System.out.println("1 - BRASILIA ");
            System.out.println("2 - FUSCA ");
            System.out.println("3 - OPALA ");
            System.out.println("4 - **SAIR** ");
            System.out.println(ANSI_BLUE_BACKGROUND + "\n==============================================================" + ANSI_RESET);
            System.out.print("\nOpção escolhida: ");
            opcao = recebe.nextInt();
            
            switch (opcao) {

                case 1:
                    Venda_Carro_Brasilia b = new Venda_Carro_Brasilia();
                    b.Venda();
                    break;

                case 2:
                    Venda_Carro_Fusca f = new Venda_Carro_Fusca();
                    f.Venda();
                    break;

                case 3:
                    Venda_Carro_Opala o = new Venda_Carro_Opala();
                    o.Venda();
                    break;

                case 4:
                    Mensagem_Menu.Sair();
                    cond = true;
                    break;
                default:
                    Mensagem_Menu.OpInvalida();
                    break;

            }

        }
                
    }

}
