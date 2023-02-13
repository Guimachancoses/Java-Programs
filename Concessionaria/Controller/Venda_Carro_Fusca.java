// Guilherme Luiz Machado Machancoses - TADS - 2º semestre - RA: 0005/22-1.
package Concessionaria.Controller;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Venda_Carro_Fusca extends Concessionaria.Model.Carro_Fusca implements Interface_Carro{

    private static int op;
    private static int popcinal;
    private static int sopcinal;
    static final String ANSI_RESET = "\u001B[0m";
    static final String ANSI_YELLOW = "\u001B[33m";
    static final String ANSI_RED_BACKGROUND = "\u001B[31m";
    static final String ANSI_BLUE_BACKGROUND = "\uu001B[34m";


    public Venda_Carro_Fusca() {
    }

    public Venda_Carro_Fusca(Double vfusca1, Double vfusca2, Double vfusca3, String nome, String modelo, String popcao, String sopcao, String tpocao, String qopcao, String uopcao) {
        super(vfusca1, vfusca2, vfusca3, nome, modelo, popcao, sopcao, tpocao, qopcao, uopcao);   
    }
    Scanner recebe = new java.util.Scanner(System.in);
    @Override
    public void Venda() {

        try{
                    
            /*Nome do carro*/
            System.out.println(ANSI_BLUE_BACKGROUND + "**************************************************************" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "\n- O carro escolhido foi:\n- Fusca" + ANSI_RESET);
            String nome = "Fusca";
            super.setNome(nome);
            System.out.println(ANSI_BLUE_BACKGROUND + "**************************************************************" + ANSI_RESET);
            System.out.println("*        Temos esses modelos disponiveis para venda           ");
            System.out.println(ANSI_BLUE_BACKGROUND + "**************************************************************" + ANSI_RESET);
            System.out.println("");
            System.out.print("\n*   Basic - Valor: R$ 20.000,00");
            System.out.print("\n*   Sedan - Valor: R$ 27.000,00");
            System.out.print("\n*   Sport - Valor: R$ 28.500,00");
            System.out.print("\n*   Executive - Valor: R$ 32.000,00\n");
            System.out.println("");
            System.out.println(ANSI_BLUE_BACKGROUND + "**************************************************************" + ANSI_RESET);
            
            /*Modelo*/
            System.out.println("Escolha o modelo do carro: ");
            System.out.println(ANSI_BLUE_BACKGROUND + "**************************************************************" + ANSI_RESET);
            System.out.println("");
            System.out.println("1 - BASIC ");
            System.out.println("2 - SEDAN ");
            System.out.println("3 - SPORT ");
            System.out.println("4 - EXECUTIVE ");
            System.out.println("");
            System.out.println(ANSI_BLUE_BACKGROUND + "**************************************************************" + ANSI_RESET);
            System.out.print("\nOpção escolhida: ");
            op = recebe.nextInt();
            String modelo = "";
            Double vfusca1 = 0.0;
            String topcao = "(Opcinal não incluso nesta versão)";
            String qopcao = "(Opcinal não incluso nesta versão)";
            String uopcao = "(Opcinal não incluso nesta versão)";

            switch (op) {

                case 1:
                    System.out.println(ANSI_BLUE_BACKGROUND + "**************************************************************" + ANSI_RESET);
                    System.out.println(ANSI_YELLOW + " - O modelo escolhido foi o 'BASIC'" + ANSI_RESET);
                    System.out.println(ANSI_BLUE_BACKGROUND + "**************************************************************" + ANSI_RESET);
                    modelo = "Basic - Valor: R$ 20.000,00";
                    super.setModelo(modelo);
                    vfusca1 = 20000.00;
                    super.setVfusca1(vfusca1);
                    super.setTopcao(topcao);
                    super.setQopcao(qopcao);
                    Basic();
                    DadosCompra();
                    break;
                case 2:
                    System.out.println(ANSI_BLUE_BACKGROUND + "**************************************************************" + ANSI_RESET);
                    System.out.println(ANSI_YELLOW + "* - O modelo escolhido foi o 'SEDAN'" + ANSI_RESET);
                    System.out.println(ANSI_BLUE_BACKGROUND + "**************************************************************" + ANSI_RESET);
                    System.out.println("* - O modelo possui de fabrica, os suguintes opcionais:");
                    System.out.println("");
                    System.out.println("- TRIO ELÉTRICO ");
                    System.out.println("- AR CONDICIONADO ");
                    System.out.println("");
                    modelo = "Sedan - Valor: R$ 27.000,00";
                    super.setModelo(modelo);
                    vfusca1 = 27000.00;
                    super.setVfusca1(vfusca1);
                    topcao = "Trio Elétrico - (Sem acrécimo de valor)";
                    super.setTopcao(topcao);
                    qopcao = "Ar Condicionado - (Sem acrécimo de valor)";
                    super.setQopcao(qopcao);
                    Sedan();
                    DadosCompra();
                    break;
                case 3:
                System.out.println(ANSI_BLUE_BACKGROUND + "**************************************************************" + ANSI_RESET); 
                    System.out.println(ANSI_YELLOW + "* - O modelo escolhido foi o 'SPORT'" + ANSI_RESET);
                    System.out.println(ANSI_BLUE_BACKGROUND + "**************************************************************" + ANSI_RESET);
                    System.out.println(" * - O modelo possui de fabrica, os suguintes opcionais:");
                    System.out.println("");
                    System.out.println("- TRIO ELÉTRICO ");
                    System.out.println("- AR CONDICIONADO ");
                    System.out.println("- DIREÇÃO HIDRÁULICA ");
                    System.out.println("- BANCOS DE COURO ");
                    System.out.println("");
                    modelo = "Sport - Valor: R$ 28.500,00";
                    super.setModelo(modelo);
                    vfusca1 = 28500.00;
                    super.setVfusca1(vfusca1);
                    topcao = "Trio Elétrico - (Sem acrécimo de valor)";
                    super.setTopcao(topcao);
                    qopcao = "Direção Hidráulica - (Sem acrécimo de valor)";
                    super.setQopcao(qopcao);
                    uopcao = "Bancos de Couro - (Sem acrécimo de valor)";
                    super.setUopcao(uopcao);
                    SportExecutive();
                    DadosCompra();                    
                    break;
                case 4:
                System.out.println(ANSI_BLUE_BACKGROUND + "**************************************************************" + ANSI_RESET); 
                    System.out.println(ANSI_YELLOW + "\nO modelo escolhido foi o 'EXECUTIVE'" + ANSI_RESET);
                    System.out.println(ANSI_BLUE_BACKGROUND + "**************************************************************" + ANSI_RESET);
                    System.out.println(" * - O modelo possui de fabrica, os suguintes opcionais:");
                    System.out.println("");
                    System.out.println("- TRIO ELÉTRICO ");
                    System.out.println("- AR CONDICIONADO ");
                    System.out.println("- DIREÇÃO HIDRÁULICA ");
                    System.out.println("- BANCOS DE COURO ");
                    System.out.println("");
                    modelo = "Executive - Valor: R$ 32.000,00";
                    super.setModelo(modelo);
                    vfusca1 = 32000.00;
                    super.setVfusca1(vfusca1);
                    topcao = "Trio Elétrico - (Sem acrécimo de valor)";
                    super.setTopcao(topcao);
                    qopcao = "Direção Hidráulica - (Sem acrécimo de valor)";
                    super.setQopcao(qopcao);
                    uopcao = "Bancos de Couro - (Sem acrécimo de valor)";
                    super.setUopcao(uopcao);
                    SportExecutive();
                    DadosCompra();
                    break;            
                default:
                    Mensagem_Menu.OpInvalida();
                    break;
            
            }
        }
        catch (RuntimeException e){
            System.out.println(ANSI_RED_BACKGROUND + "ERRO: Verifique o tipo de entrada solicitada!" + ANSI_RESET);                
        }
    }

    @Override
    public void Basic() {

        try{

            /*Escolha de Opcionais*/
            System.out.println(ANSI_BLUE_BACKGROUND + "**************************************************************" + ANSI_RESET);
            System.out.println("Escolha dois opcionais para o carro: ");
            System.out.println(ANSI_BLUE_BACKGROUND + "**************************************************************" + ANSI_RESET);
            System.out.println("");
            System.out.println("1 - TRIO ELÉTRICO - R$ 900,00 ");
            System.out.println("2 - AR CONDICIONADO - R$ 1.200,00 ");
            System.out.println("3 - DIREÇÃO HIDRÁULICA - R$ 1.350,00 ");
            System.out.println("4 - BANCOS DE COURO – R$ 1.850,00 ");
            System.out.println("5 - MULTIMIDIA – R$ 3.200,00 ");
            System.out.println("");
            System.out.println(ANSI_BLUE_BACKGROUND + "**************************************************************" + ANSI_RESET);
            System.out.println("");
            popcinal = recebe.nextInt();
            String popcao = "";
            Double vfusca2 = 0.0;
            boolean  condicao = false;
            
            switch (popcinal) {

                case 1:
                    System.out.println(ANSI_YELLOW + "\nVocê escolheu: 'Trio Elétrico'" + ANSI_RESET);
                    popcao = "Trio Elétrico - R$ 900,00";
                    super.setPopcao(popcao);
                    vfusca2 = 900.00;
                    super.setVfusca2(vfusca2);
                    break;
                case 2: 
                    System.out.println(ANSI_YELLOW + "\nVocê escolheu: 'Ar Condicionado'" + ANSI_RESET);
                    popcao = "Ar Condicionado - R$ 1.200,00";
                    super.setPopcao(popcao);
                    vfusca2 = 1200.00;
                    super.setVfusca2(vfusca2);
                    break;
                case 3: 
                    System.out.println(ANSI_YELLOW + "\nVocê escolheu: 'Direção Hidráulica'" + ANSI_RESET);
                    popcao = "Direção Hidráulica - R$ 1.350,00";
                    super.setPopcao(popcao);
                    vfusca2 = 1350.00;
                    super.setVfusca2(vfusca2);
                    break;
                case 4: 
                    System.out.println(ANSI_YELLOW + "\nVocê escolheu: 'Bancos de Couro'" + ANSI_RESET);
                    popcao = "Bancos de Couro – R$ 1.850,00";
                    super.setPopcao(popcao);
                    vfusca2 = 1850.00;
                    super.setVfusca2(vfusca2);
                    break;
                case 5: 
                    System.out.println(ANSI_YELLOW + "\nVocê escolheu: 'Multimidia'" + ANSI_RESET);
                    popcao = "Multimidia – R$ 3.200,00";
                    super.setPopcao(popcao);
                    vfusca2 = 3200.00;
                    super.setVfusca2(vfusca2);
                    break;            
                default:
                    Mensagem_Menu.OpInvalida();
                    break;
            }

            while(condicao == false){

                System.out.println(ANSI_BLUE_BACKGROUND + "**************************************************************" + ANSI_RESET);
                System.out.println("Escolha o segundo opcinal para o carro: ");
                System.out.println(ANSI_BLUE_BACKGROUND + "**************************************************************" + ANSI_RESET);
                System.out.println("");
                System.out.println("1 - TRIO ELÉTRICO - R$ 900,00 ");
                System.out.println("2 - AR CONDICIONADO - R$ 1.200,00 ");
                System.out.println("3 - DIREÇÃO HIDRÁULICA - R$ 1.350,00 ");
                System.out.println("4 - BANCOS DE COURO – R$ 1.850,00 ");
                System.out.println("5 - MULTIMIDIA – R$ 3.200,00 ");
                System.out.println("");
                System.out.println(ANSI_BLUE_BACKGROUND + "**************************************************************" + ANSI_RESET);
                System.out.println("");
                sopcinal = recebe.nextInt();
                String sopcao = "";
                Double vfusca3 = 0.0;
            
                if(sopcinal == popcinal){
                    System.out.println(ANSI_RED_BACKGROUND + "\nVocê já escolheu este opcinal, por favor escolha outro." + ANSI_RESET);
                }
                
                else {
                    switch (sopcinal) {

                        case 1:
                            System.out.println(ANSI_YELLOW + "\nVocê escolheu: 'Trio Elétrico'" + ANSI_RESET);
                            sopcao = "Trio Elétrico - R$ 900,00";
                            super.setSopcao(sopcao);
                            vfusca3 = 900.00;
                            super.setVfusca3(vfusca3);
                            condicao = true;
                            break;
                        case 2: 
                            System.out.println(ANSI_YELLOW + "\nVocê escolheu: 'Ar Condicionado'" + ANSI_RESET);
                            sopcao = "Ar Condicionado - R$ 1.200,00";
                            super.setSopcao(sopcao);
                            vfusca3 = 1200.00;
                            super.setVfusca3(vfusca3);
                            condicao = true;
                            break;
                        case 3: 
                            System.out.println(ANSI_YELLOW + "\nVocê escolheu: 'Direção Hidráulica'" + ANSI_RESET);
                            sopcao = "Direção Hidráulica - R$ 1.350,00";
                            super.setSopcao(sopcao);
                            vfusca3 = 1350.00;
                            super.setVfusca3(vfusca3);
                            condicao = true;
                            break;
                        case 4: 
                            System.out.println(ANSI_YELLOW + "\nVocê escolheu: 'Bancos de Couro'" + ANSI_RESET);
                            sopcao = "Bancos de Couro – R$ 1.850,00";
                            super.setSopcao(sopcao);
                            vfusca3 = 1850.00;
                            super.setVfusca3(vfusca3);
                            condicao = true;
                            break;
                        case 5: 
                            System.out.println(ANSI_YELLOW + "\nVocê escolheu: 'Multimidia'" + ANSI_RESET);
                            sopcao = "Multimidia – R$ 3.200,00";
                            super.setSopcao(sopcao);
                            vfusca3 = 3200.00;
                            super.setVfusca3(vfusca3);
                            condicao = true;
                            break;            
                        default:
                            Mensagem_Menu.OpInvalida();
                            break;
                    }
                }
            }
        }
        catch (RuntimeException e){
            System.out.println(ANSI_RED_BACKGROUND + "ERRO: Verifique o tipo de entrada solicitada!" + ANSI_RESET);                
        }
    }

    @Override
    public void Sedan() {

        try{

            /*Escolha de Opcionais*/
            System.out.println(ANSI_BLUE_BACKGROUND + "**************************************************************" + ANSI_RESET);
            System.out.println("* Escolha dois opcionais para o carro: ");
            System.out.println(ANSI_BLUE_BACKGROUND + "**************************************************************" + ANSI_RESET);
            System.out.println("");
            System.out.println("1 - DIREÇÃO HIDRÁULICA - R$ 1.350,00 ");
            System.out.println("2 - BANCOS DE COURO – R$ 1.850,00 ");
            System.out.println("3 - MULTIMIDIA – R$ 3.200,00 ");
            System.out.println("");
            System.out.println(ANSI_BLUE_BACKGROUND + "**************************************************************" + ANSI_RESET);
            System.out.println("");
            popcinal = recebe.nextInt();
            String popcao = "";
            Double vfusca2 = 0.0;
            boolean  condicao = false;
            
            switch (popcinal) {

                case 1: 
                    System.out.println(ANSI_YELLOW + "\nVocê escolheu: 'Direção Hidráulica'" + ANSI_RESET);
                    popcao = "Direção Hidráulica - R$ 1.350,00";
                    super.setPopcao(popcao);
                    vfusca2 = 1350.00;
                    super.setVfusca2(vfusca2);
                    break;
                case 2: 
                    System.out.println(ANSI_YELLOW + "\nVocê escolheu: 'Bancos de Couro'" + ANSI_RESET);
                    popcao = "Bancos de Couro – R$ 1.850,00";
                    super.setPopcao(popcao);
                    vfusca2 = 1850.00;
                    super.setVfusca2(vfusca2);
                    break;
                case 3: 
                    System.out.println(ANSI_YELLOW + "\nVocê escolheu: 'Multimidia'" + ANSI_RESET);
                    popcao = "Multimidia – R$ 3.200,00";
                    super.setPopcao(popcao);
                    vfusca2 = 3200.00;
                    super.setVfusca2(vfusca2);
                    break;            
                default:
                    Mensagem_Menu.OpInvalida();
                    break;
            }

            while(condicao == false){

                System.out.println(ANSI_BLUE_BACKGROUND + "**************************************************************" + ANSI_RESET);
                System.out.println("Escolha o segundo opcinal para o carro: ");
                System.out.println(ANSI_BLUE_BACKGROUND + "**************************************************************" + ANSI_RESET);
                System.out.println("");
                System.out.println("1 - DIREÇÃO HIDRÁULICA - R$ 1.350,00 ");
                System.out.println("2 - BANCOS DE COURO – R$ 1.850,00 ");
                System.out.println("3 - MULTIMIDIA – R$ 3.200,00 ");
                System.out.println("");
                System.out.println(ANSI_BLUE_BACKGROUND + "**************************************************************" + ANSI_RESET);
                System.out.println("");
                sopcinal = recebe.nextInt();
                String sopcao = "";
                Double vfusca3 = 0.0;
                
                if(sopcinal == popcinal){
                    System.out.println(ANSI_RED_BACKGROUND + "\nVocê já escolheu este opcinal, por favor escolha outro." + ANSI_RESET);
                }

                else {
                    switch (sopcinal) {


                        case 1: 
                            System.out.println(ANSI_YELLOW + "\nVocê escolheu: 'Direção Hidráulica'" + ANSI_RESET);
                            sopcao = "Direção Hidráulica - R$ 1.350,00";
                            super.setSopcao(sopcao);
                            vfusca3 = 1350.00;
                            super.setVfusca3(vfusca3);
                            condicao = true;
                            break;
                        case 2: 
                            System.out.println(ANSI_YELLOW + "\nVocê escolheu: 'Bancos de Couro'" + ANSI_RESET);
                            sopcao = "Bancos de Couro – R$ 1.850,00";
                            super.setSopcao(sopcao);
                            vfusca3 = 1850.00;
                            super.setVfusca3(vfusca3);
                            condicao = true;
                            break;
                        case 3: 
                            System.out.println(ANSI_YELLOW + "\nVocê escolheu: 'Multimidia'" + ANSI_RESET);
                            sopcao = "Multimidia – R$ 3.200,00";
                            super.setSopcao(sopcao);
                            vfusca3 = 3200.00;
                            super.setVfusca3(vfusca3);
                            condicao = true;
                            break;            
                        default:
                            Mensagem_Menu.OpInvalida();
                            break;
                    }
                }
            }
        }
        catch (RuntimeException e){
            System.out.println(ANSI_RED_BACKGROUND + "ERRO: Verifique o tipo de entrada solicitada!" + ANSI_RESET);                
        }
    }

    @Override
    public void SportExecutive() {

        try{

            /*Escolha de Opcionais*/
            System.out.println(ANSI_BLUE_BACKGROUND + "**************************************************************" + ANSI_RESET);
            System.out.println("* Deseja acrecer este opicinal? ");
            System.out.println(ANSI_BLUE_BACKGROUND + "**************************************************************" + ANSI_RESET);
            System.out.println("");
            System.out.println("* MULTIMIDIA – R$ 3.200,00 ");
            System.out.println("1 - SIM ");
            System.out.println("2 - NÃO ");
            System.out.println("");
            System.out.println(ANSI_BLUE_BACKGROUND + "**************************************************************" + ANSI_RESET);
            System.out.println("");
            popcinal = recebe.nextInt();
            String popcao = "";
            Double vfusca2 = 0.0;
            String sopcao = "Ar Condicionado - (Sem acrécimo de valor)";
            
            switch (popcinal) {

                case 1: 
                    System.out.println(ANSI_YELLOW + "\nVocê escolheu: 'Multimidia'" + ANSI_RESET);
                    popcao = "Multimidia – R$ 3.200,00";
                    super.setPopcao(popcao);
                    vfusca2 = 3200.00;
                    super.setVfusca2(vfusca2);
                    super.setSopcao(sopcao);
                    break;
                case 2:
                    System.out.println(ANSI_YELLOW + "\nVocê escolheu: 'Não'" + ANSI_RESET);
                    popcao = "(Opicional não incluso)";
                    super.setPopcao(popcao);
                    super.setVfusca2(vfusca2);
                    super.setSopcao(sopcao);
                    break;

                default:
                    Mensagem_Menu.OpInvalida();
                    break;
            }

        }
        catch (RuntimeException e){
            System.out.println(ANSI_RED_BACKGROUND + "ERRO: Verifique o tipo de entrada solicitada!" + ANSI_RESET);                
        }
    }

    @Override
    public void DadosCompra() {

        try{
            
            /*Imprime resultado da venda*/
            System.out.println(ANSI_BLUE_BACKGROUND + "**************************************************************" + ANSI_RESET);
            System.out.println(ANSI_BLUE_BACKGROUND + "                       DADOS DA COMPRA                        " + ANSI_RESET);
            System.out.println(ANSI_BLUE_BACKGROUND + "**************************************************************" + ANSI_RESET);
            System.out.println("\nCarro: " + super.getNome());
            System.out.println("Modelo: " + super.getModelo());
            System.out.println("Opcinais:\n - " + super.getPopcao() + "\n - " + super.getSopcao() + "\n - " + super.getTopcao() + "\n - " + super.getQopcao()  + "\n - " + super.getUopcao());
            DecimalFormat df = new DecimalFormat("##,###.##");
            System.out.println("");
            System.out.println(ANSI_BLUE_BACKGROUND + "**************************************************************" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "Valor Total do veículo: R$ " + df.format(super.getTfusca()) + ",00" + ANSI_RESET);
            System.out.println(ANSI_BLUE_BACKGROUND + "**************************************************************" + ANSI_RESET);
            System.out.println(ANSI_RED_BACKGROUND + "Fim da venda..." + ANSI_RESET);
        }
        catch (RuntimeException e){
            System.out.println(ANSI_RED_BACKGROUND + "ERRO: Verifique o tipo de entrada solicitada!" + ANSI_RESET);                
        }
    }    
    
}