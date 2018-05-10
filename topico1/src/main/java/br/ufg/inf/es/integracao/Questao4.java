/**
 * Copyright (c) 2018.
 * Beatriz Nogueira Carvalho da Silveira
 * Creative Commons Attribution 4.0 International License.
 */

package main.java.br.ufg.inf.es.integracao;


import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Classe cujo primeiro argumento é o nome de um arquivo e cujo segundo argumento  é uma sequência de caracteres.
 * Quando executado, a sequência de caracteres fornecida como o segundo argumento é persistida no arquivo cujo
 * nome é fornecido como primeiro argumento. O texto deve ser persistido no formato UTF-8.
 */
public class Questao4 {

    public static void main (String [] args) {
        try {
            String a = retorna(args[0]);
            System.out.println((String) args[0]);
            System.out.println(args[1]);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String retorna (String nomeArquivo) throws IOException {
        PrintWriter pw = new PrintWriter(nomeArquivo, "UTF-8");
        pw.write(nomeArquivo);
        pw.write("\n");
        pw.close();

        Charset uft8 = Charset.forName("UTF-8");
        Path arquivo = Paths.get(nomeArquivo);
        System.out.println((String) nomeArquivo);
        System.out.println(nomeArquivo);
        String a = "Deve ser corrigido";

        return a;
    }
}
