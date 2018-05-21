/**
 * Copyright (c) 2018.
 * Beatriz Nogueira Carvalho da Silveira
 * Creative Commons Attribution 4.0 International License.
 */

package main.java.br.ufg.inf.es.integracao;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Classe cujo primeiro argumento é o nome de um arquivo e cujo segundo
 * argumento  é uma sequência de caracteres.
 * Quando executado, a sequência de caracteres fornecida como o segundo
 * argumento é persistida no arquivo cujo nome é fornecido como primeiro
 * argumento. O texto deve ser persistido no formato UTF-8.
 */
public class Questao4 {

    /**
     * O método o chama método "retornaNomeArquivo" e apresenta o resultado.
     * @param args
     */
    public static void main (String [] args) {
        try {
            retornaNomeArquivo(args[0], args[1]);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * O método verifica o nome do arquivo e o arquivo está vazio, caso não
     * esteja ele imprime/exibe o nome do arquivo e o conteúdo do arquivo.
     * @param nomeArquivo é o nome do arquivo
     * @param arquivo parametro que recebe o conteúdo do arquivo.
     * @throws IOException caso o nome do arquivo esteja vazio ou null o
     * sistema apresenta excessão.
     */
    public static void retornaNomeArquivo (String nomeArquivo, String arquivo) throws IOException {

        if (nomeArquivo.equals(null) || nomeArquivo.equals("")) {
            throw new IllegalArgumentException("Arquivo inválido");
        }

        if(arquivo.equals(null) || arquivo.equals("")) {
            throw  new  IllegalArgumentException("Arquivo inválido");
        }

        PrintWriter pw = new PrintWriter(nomeArquivo, "UTF-8");
        pw.write(arquivo);
        pw.close();
    }
}
