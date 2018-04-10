package br.ufg.inf.integracao.topico1;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by aluno on 26/03/18.
 */
public class Questao4 {

    public static void main (String [] args) throws IOException {
        PrintWriter pw = new PrintWriter(args[0], "UTF-8");
        pw.write(args[1]);
        pw.write("\n");
        pw.close();

        Charset uft8 = Charset.forName("UTF-8");
        Path arquivo = Paths.get(args[0]);
        System.out.println((String) args[0]);
        System.out.println(args[1]);
    }
}
