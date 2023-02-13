// Guilherme Luiz Machado Machancoses - TADS - 2º semestre - RA: 0005/22-1.

package AgendaTelefonica;

public class LerConteudoArquivo {

    public static void main(String[] args) {
        String nomeArquivo = "teste.txt";
        Arquivo meuArquivo = Arquivo.abrirLeitura(nomeArquivo);

        System.out.println("Início do conteúdo do arquivo " + nomeArquivo + ".\n");
        System.out.println("--------------------------------------");

        String linha = Arquivo.lerLinha(meuArquivo);
        //enquanto existir conteúdo, imprima
        while (linha != null) {
            System.out.println(linha);
            linha = Arquivo.lerLinha(meuArquivo);
        }

        Arquivo.fechar(meuArquivo);
        System.out.println("--------------------------------------");
        System.out.println("\nFim do conteúdo do arquivo " + nomeArquivo + ".");
    }

}
