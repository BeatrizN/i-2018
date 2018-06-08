/*
 * Copyright (c) 2018.
 * Beatriz Nogueira Carvalho da Silveira
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.es.integracao;

/**
 * Classe que cria uma instância de formas de  meios de comunicação.
 */
public class Comunicacao {

    private String meio;
    private String preferencia;
    private String detalhes;
    private String uso;


    /**
     * Método que retorna o valor do atributo meio.
     */
    public String getMeio() {
        return meio;
    }

    /**
     * Método de acesso ao atributo meio.
     */
    public void setMeio(String meio) {
        this.meio = meio;
    }

    /**
     * Método que retorna o valor do atributo preferencia.
     */
    public String getPreferencia() {
        return preferencia;
    }

    /**
     * Método de acesso ao atributo preferencia.
     */
    public void setPreferencia(String preferencia) {
        this.preferencia = preferencia;
    }

    /**
     * Método que retorna o valor do atributo detalhes.
     */
    public String getDetalhes() {
        return detalhes;
    }

    /**
     * Método de acesso ao atributo detalhes.
     */
    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    /**
     * Método que retorna o valor do atributo uso.
     */
    public String getUso() {
        return uso;
    }

    /**
     * Método de acesso ao atributo uso.
     */
    public void setUso(String uso) {
        this.uso = uso;
    }
}