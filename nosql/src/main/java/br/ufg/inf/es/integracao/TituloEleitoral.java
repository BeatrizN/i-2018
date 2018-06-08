/*
 * Copyright (c) 2018.
 * Beatriz Nogueira Carvalho da Silveira
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.es.integracao;

/**
 * Classe que cria uma instancia de um titulo de Eleitor.
 */
public class TituloEleitoral {

    private int secao;
    private int zona;

    /**
     * Método que retorna o valor do atributo seção.
     */
    public int getSecao() {
        return secao;
    }

    /**
     * Método de acesso ao atributo seção.
     */
    public void setSecao(int secao) {
        this.secao = secao;
    }

    /**
     * Método que retorna o valor do atributo zona.
     */
    public int getZona() {
        return zona;
    }

    /**
     * Método de acesso ao atributo zona.
     */
    public void setZona(int zona) {
        this.zona = zona;
    }
}