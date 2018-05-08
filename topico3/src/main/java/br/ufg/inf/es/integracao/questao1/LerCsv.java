package main.java.br.ufg.inf.es.integracao.questao1;

import java.io.*;
import java.util.Formatter;

/**
 * Created by Beatriz on 07/05/18.
 */
public class LerCsv {

    public static void main(String[] args) {

        String arquivoCSV = "/home/aluno/teste.csv";
        BufferedReader br = null;
        String linha = "";
        String csvDivisor = ",";
        try {
/**
 br = new BufferedReader(new FileReader(arquivoCSV));
 while ((linha = br.readLine()) != null) {

 String[] pais = linha.split(csvDivisor);

 System.out.println("País [code= " + pais[pais.length-2]
 + " , name=" + pais[pais.length-1] + "]");

 }

 */



            br = new BufferedReader(new FileReader(arquivoCSV));
            while ((linha = br.readLine()) != null) {

                String[] liiinha = linha.split(csvDivisor);

                System.out.println("País [code= " + liiinha[liiinha.length - 2]
                        + " , name=" + liiinha[liiinha.length - 1] + "]");

            }




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        String diretorio = "/home/aluno/Arquivo.xml";

        StringBuilder xml = new StringBuilder();

        xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>")
                .append("<Recibo>")


                .append("<nome>" + "ola" + "</nome")
                .append("<email>" + "oi" + "</email>")
                .append("</Recibo>");

        String str = new String();
        str = xml.toString();

        //salvar(str, diretorio);


        File dirXml = new File(diretorio);
        if (!dirXml.exists()) {
            try {
                try (Formatter saida = new Formatter (diretorio)){
                    saida.format(str);
                }
            } catch (FileNotFoundException ex) {
                System.out.println("Não foi possível criar o arquivo.");
            }
        }
    }

}
