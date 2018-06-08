/*
 * Copyright (c) 2018.
 * Beatriz Nogueira Carvalho da Silveira
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.es.integracao;

import java.util.Calendar;

/**
 * Classe que cria uma instância de vinculo.
 */
public class Vinculo {

    private String relacionamento;
    private Calendar dataInicio;
    private Calendar dataFim;

    /**
     * Método que retorna o valor do atributo relacionamento.
     */
    public String getRelacionamento() {
        return relacionamento;
    }

    /**
     * Método de acesso ao atributo relacionamento.
     */
    public void setRelacionamento(String relacionamento) {
        this.relacionamento = relacionamento;
    }

    /**
     * Método que retorna o valor do atributo data inicial.
     */
    public Calendar getDataInicio() {
        return dataInicio;
    }

    /**
     * Método de acesso ao atributo  data inicial.
     */
    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * Método que retorna o valor do atributo data de fim.
     */
    public Calendar getDataFim() {
        return dataFim;
    }

    /**
     * Método de acesso ao atributo data de fim.
     */
    public void setDataFim(Calendar dataFim) {
        this.dataFim = dataFim;
    }
}