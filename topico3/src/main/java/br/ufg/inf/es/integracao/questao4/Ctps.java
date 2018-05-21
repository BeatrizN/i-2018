/*
 * Copyright (c) 2018.
 * Beatriz Nogueira Carvalho da Silveira
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.es.integracao.questao4;
 
/**
 * Classe que cria uma instancia de CTPS.
 */
public class Ctps {

    private String serie;
    private String estado;

    /**
     * Método que retorna o valor do atributo serie.
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Método de acesso ao atributo serie.
     */
    public void setSerie(String serie) {
        this.serie = serie;
    }

    /**
     * Método que retorna o valor do atributo estado.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Método de acesso ao atributo estado.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
}