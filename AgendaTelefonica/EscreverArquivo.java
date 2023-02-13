// Guilherme Luiz Machado Machancoses - TADS - 2º semestre - RA: 0005/22-1.

package AgendaTelefonica;

public class EscreverArquivo {

    public static void main(String[] args) {
        String nomeArquivo = "teste.txt";
        Arquivo meuArquivo = Arquivo.abrirEscrita(nomeArquivo, "append");
        
        Arquivo.escrever(meuArquivo, "Olá, este é meu primeiro arquivo");
        Arquivo.escrever(meuArquivo, "Testando gravação de dados em arquivo texto (em Java).");

        Arquivo.fechar(meuArquivo);

        System.out.println("Conteúdo foi armazenado no arquivo " + nomeArquivo + "!");
    }

}