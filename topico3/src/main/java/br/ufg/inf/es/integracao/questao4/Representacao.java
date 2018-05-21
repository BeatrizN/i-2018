/*
 * Copyright (c) 2018.
 * Beatriz Nogueira Carvalho da Silveira
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.es.integracao.questao4;

/**
 * Classe que cria uma instância de uma representação.
 */
public class Representacao {

    private String utilizacao;
    private String alternativa;

    /**
     * Método que retorna o valor do atributo utilização.
     */
    public String getUtilizacao() {
        return utilizacao;
    }

    /**
     * Método de acesso ao atributo utilização.
     */
    public void setUtilizacao(String utilizacao) {
        this.utilizacao = utilizacao;
    }

    /**
     * Método que retorna o valor do atributo alternativa.
     */
    public String getAlternativa() {
        return alternativa;
    }

    /**
     * Método de acesso ao atributo alternativa.
     */
    public void setAlternativa(String alternativa) {
        this.alternativa = alternativa;
    }

}