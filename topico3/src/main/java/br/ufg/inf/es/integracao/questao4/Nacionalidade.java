/*
 * Copyright (c) 2018.
 * Beatriz Nogueira Carvalho da Silveira
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.es.integracao.questao4;

import java.util.Calendar;

/**
 * Classe que cria uma instância da nacionalidade de um parciente.
 */
public class Nacionalidade {

    private String municipio;
    private String estado;
    private String pais;
    private Calendar entradaPais;

    /**
     * Método que retorna o valor do atributo municipio.
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * Método de acesso ao atributo municipio.
     */
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
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

    /**
     * Método que retorna o valor do atributo país.
     */
    public String getPais() {
        return pais;
    }

    /**
     * Método de acesso ao atributo país.
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Método que retorna o valor do atributo data de entrada no país.
     */
    public Calendar getEntradaPais() {
        return entradaPais;
    }

    /**
     * Método de acesso ao atributo data de entrada no país.
     */
    public void setEntradaPais(Calendar entradaPais) {
        this.entradaPais = entradaPais;
    }
}