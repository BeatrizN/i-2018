/**
 * Copyright (c) 2018.
 * Beatriz Nogueira Carvalho da Silveira
 * Creative Commons Attribution 4.0 International License.
 */

package main.java.br.ufg.inf.es.integracao;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Classe que recebe como único argumento um nome de arquivo e exibe os
 * 4 primeiros bytes (inteiro de 32 bits) em formato hexadecimal na saída padrão.
 */
public class Questao1 {

    /**
     * Este método exibe o resultado do método retornaHexadecimal para ou usuário.
     * @param args nome do arquivo.
     */
    public static void main (String [] args) {

        try {
            System.out.println(retornaHexadecimal(args[0]));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Este metodo lê o conteúdo de um arquivo e retorna os 4 primeiros bytes (inteiro de 32 bits)
     * em formato hexadecimal.
     * @param nomeArquivo nome do arquivo recebido como parâmetro.
     * @return 4 primeiros bytes do arquivo.
     * @throws IOException apresenção exceção quando o nome do arquivo está em branco.
     */
    public static int retornaHexadecimal (String nomeArquivo) throws IOException {

        if (nomeArquivo.equals(null) || nomeArquivo.trim().isEmpty()) {
            throw new IllegalArgumentException("Arquivo inválido");
        }

        FileInputStream fis = new FileInputStream(nomeArquivo);
        DataInputStream arquivo = new DataInputStream(fis);
        int saidaHexadecimal = arquivo.readInt();
        arquivo.close();

        return Integer.parseInt(Integer.toHexString(saidaHexadecimal));

    }
}
