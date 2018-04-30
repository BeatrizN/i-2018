package br.ufg.inf.es.integracao.topico1;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Questao7 {
    public static void main(String[] args) throws IOException {
     
        Path arquivo = Paths.get(args[0]);
        Charset utf8 = Charset.forName("UTF-8");
        BufferedReader br = Files.newBufferedReader(arquivo, utf8);

        FileOutputStream fos = new FileOutputStream(args[1]);
        DataOutputStream dos = new DataOutputStream(fos);
        
        int indice = 0;
        String stg;
        while ((stg = br.readLine()) != null) {
           
           byte[] linha = stg.getBytes(utf8);
           dos.writeInt(indice);
           dos.writeInt(stg.length());
           dos.write(linha, 0, stg.length());
           indice++;
        }

        dos.close();
    }
}
