/**
 * TODO nota de copyright aqui
 * TODO altere o nome deste package, por exemplo, para br.ufg.inf.integracao.topico1
 */
package br.ufg.inf.es.integracao.topico1;

import java.io.*;

/**
 * TODO documente a classe
 * Created by Beatriz on 19/03/18.
 */
public class Questao1 {

    public static void main (String [] args) throws IOException {

        FileInputStream fis = new FileInputStream(args[0]);
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        int bytes;
        for (int i = 0; i<4; i++) {

            // FIXME 
            // Conforme documentação, lê um caractere como um inteiro, ou seja,
            // interpreta a entrada como texto. Não é o que desejamos!
            bytes =  br.read();
            System.out.println(Integer.toHexString(bytes));
        }

        br.close();
    }
}
