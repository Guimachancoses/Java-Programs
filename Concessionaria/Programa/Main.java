// Guilherme Luiz Machado Machancoses - TADS - 2º semestre - RA: 0005/22-1.
package Concessionaria.Programa;

import java.util.ArrayList;

import Concessionaria.Controller.Venda_Carro_Brasilia;
import Concessionaria.Controller.Venda_Carro_Fusca;
import Concessionaria.Controller.Venda_Carro_Opala;
import Concessionaria.View.Menu;
public class Main {
    public static void main(String[] args) {       
        
        ArrayList<Venda_Carro_Brasilia> Brasilia = new ArrayList<>();
        ArrayList<Venda_Carro_Fusca> Fusca = new ArrayList<>();
        ArrayList<Venda_Carro_Opala> Opala = new ArrayList<>();

        Menu.MenuPrincipal(Brasilia, Fusca, Opala);   
    }

}