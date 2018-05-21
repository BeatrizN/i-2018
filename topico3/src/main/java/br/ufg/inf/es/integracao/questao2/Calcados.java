/*
 * Copyright (c) 2018.
 * Beatriz Nogueira Carvalho da Silveira
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.es.integracao.questao2;

/**
 * Classe que instância um Calçado.
 */

public class Calcados {

    private String marca;
    private float preco;
    /**
     * Método que retor o valor do atributo nome.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Método que acesssa e atualiza a variável nome.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Método que retor o valor do atributo preço.
     */
    public float getPreco() {
        return preco;
    }

    /**
     * Método que acesssa e atualiza a variável preço.
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }

}