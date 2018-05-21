/**
 * Copyright (c) 2018.
 * Beatriz Nogueira Carvalho da Silveira
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.es.integracao.questao2;

/**
 * Classe que cria uma instância de Sapatos.
 */
public class Sapatos extends Calcados {

    private int red;
    private int green;
    private int blue;

    /**
     * Método que retorna o valor do atributo red.
     */
    public int getRed() {
        return red;
    }

    /**
     * Método que acesssa e atualiza o atributo red.
     */
    public void setRed(int red) {
        this.red = red;
    }

    /**
     * Método que retorna o valor do atributo green.
     */
    public int getGreen() {
        return green;
    }

    /**
     * Método que acesssa e atualiza o atributo green.
     */
    public void setGreen(int green) {
        this.green = green;
    }

    /**
     * Método que retorna o valor do atributo blue.
     */
    public int getBlue() {
        return blue;
    }

    /**
     * Método que acesssa e atualiza o atributo blue.
     */
    public void setBlue(int blue) {
        this.blue = blue;
    }
}