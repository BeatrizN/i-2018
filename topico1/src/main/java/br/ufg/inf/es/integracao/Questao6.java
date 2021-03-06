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


public class Questao6 {
    public static void main(String[] args) throws IOException {
        Charset uft8 = Charset.forName("UTF-8");
        Path arquivo = Paths.get(args[1]);
        for (String linha : Files.readAllLines(arquivo, uft8)) {
           System.out.println(linha);
        }
    }
}
