// Guilherme Luiz Machado Machancoses - TADS - 2º semestre - RA: 0005/22-1.

package AgendaTelefonica;

public class AbrirArquivos {

    public static void main(String[] args) {
        //cria e abre um novo arquivo
        Arquivo a = Arquivo.abrirEscrita("teste.txt", "new");

        //abre um arquivo que ja existia, e limpa seu conteudo
        Arquivo b = Arquivo.abrirEscrita("teste.txt", "truncate");

        //abre um arquivo que ja existia e mantem seu conteudo
        Arquivo c = Arquivo.abrirEscrita("teste.txt", "append");

        Arquivo d = Arquivo.abrirLeitura("teste.txt");

	//fecha os arquivos
        Arquivo.fechar(a);
        Arquivo.fechar(b);
        Arquivo.fechar(c);
        Arquivo.fechar(d);

	System.out.println("Programa carregou e fechou 4x o arquivo teste.txt");
    }

}