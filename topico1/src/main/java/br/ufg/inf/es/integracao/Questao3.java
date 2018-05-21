/**
 * Copyright (c) 2018.
 * Beatriz Nogueira Carvalho da Silveira
 * Creative Commons Attribution 4.0 International License.
 */

package main.java.br.ufg.inf.es.integracao;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Classe que exibe o conteúdo de um arquivo texto, formato UTF-8, na saída padrão.
 */
public class Questao3 {

    /**
     * Método que exibe o resultado do método exibeArquivo.
     * @param args arquivo a ser exibido.
     */
    public static void main (String [] args) {

        try {
            System.out.println(exibeArquivo(args[0]));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Método que retorna a string com o conteúdo do arquivo.
     * @param nomeArquivo nome do arquivo a ser exibido.
     * @return retorna uma String com o conteúdo do arquivo.
     * @throws IOException apresenção exceção quando o nome do arquivo está em branco.
     */
    public static String exibeArquivo (String nomeArquivo) throws IOException {

        if (nomeArquivo.equals(null) || nomeArquivo.trim().isEmpty()) {
            throw new IllegalArgumentException("Arquivo inválido");
        }

        Charset utf8 = Charset.forName("UTF-8");
        Path arquivo = Paths.get(nomeArquivo);
        StringBuilder arq = new StringBuilder();
        for (String linha : Files.readAllLines(arquivo, utf8)) {
            arq.append(linha)
                    .append("\n");
        }

        return arq.toString();
    }
}
