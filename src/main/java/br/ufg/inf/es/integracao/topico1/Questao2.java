package br.ufg.inf.es.integracao.topico1;

import java.io.*;
import java.nio.file.Files;

/**
 * Created by Beatriz on 26/03/18.
 *
 * Os arquivos de imagem JPEG começam FF D8 e terminam com FF D9.
 */

public class Questao2 {

    public static void main (String [] args) throws IOException {
        byte [] bytes = Files.readAllBytes(new File(args[0]).toPath());

        if ("FF".equals(String.format("%X", bytes[0])) &
            "D8".equals(String.format("%X", bytes[1])) &
            "FF".equals(String.format("%X", bytes[bytes.length-2])) &
            "D9".equals(String.format("%X", bytes[bytes.length-1])) ){
                System.out.println("É um arquivo JPEG");
        }else{
            System.out.println("Não é um arquivo JPEG");
        }
    }
}