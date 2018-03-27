package atividade1;

import java.io.*;

/**
 * Created by Beatriz on 19/03/18.
 */
public class Questao1 {

    public static void main (String [] args) throws IOException {

        FileInputStream fis = new FileInputStream(args[0]);
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        int bytes;
        for (int i = 0; i<4; i++) {

            bytes =  br.read();
            System.out.println(Integer.toHexString(bytes));
        }

        br.close();
    }
}
