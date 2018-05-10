/**
 * Copyright (c) 2018.
 * Beatriz Nogueira Carvalho da Silveira
 * Creative Commons Attribution 4.0 International License.
 */

package main.java.br.ufg.inf.es.integracao;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Classe que recebe como argumento o nome de um arquivo JPEG e que verifica
 * se o arquivo de imagem JPEG começa com FF D8 e termina com FF D9 ou não.
 */
public class Questao2 {

    /**
     * Este método exibe o resultado do método verificaArquivoJpeg como saída de texto.
     * @param args nome do arquivo.
     */
    public static void main (String [] args) {

        try {
            boolean verificacaoArquivo = verificaArquivoJpeg(args[0]);
            if (verificacaoArquivo) {
                System.out.println("É um arquivo JPEG");
            } else {
                System.out.println("Não é um arquivo JPEG");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Método que verifica se a condição para ser um arquivo JPEG é satisfeita.
     * Os arquivos de imagem JPEG começam com FF D8 e terminam com FF D9.
     * @param nomeArquivo nome do arquivo a ser verificado.
     * @return retorna TRUE se o arquivo é do formato JPEG, caso contrário retorna FALSE.
     * @throws IOException apresenção exceção quando o nome do arquivo está em branco.
     */
    public static boolean verificaArquivoJpeg (String nomeArquivo) throws IOException {

        if (nomeArquivo.equals(null) || nomeArquivo.trim().isEmpty()) {
            throw new IllegalArgumentException("Arquivo inválido");
        }

        byte [] bytes = Files.readAllBytes(new File(nomeArquivo).toPath());

        if ("FF".equals(String.format("%X", bytes[0])) &
                "D8".equals(String.format("%X", bytes[1])) &
                "FF".equals(String.format("%X", bytes[bytes.length-2])) &
                "D9".equals(String.format("%X", bytes[bytes.length-1])) ){
            return true;
        }else{
            return false;
        }
    }
}