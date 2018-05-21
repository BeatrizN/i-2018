/*
 * Copyright (c) 2018.
 * Beatriz Nogueira Carvalho da Silveira
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.es.integracao.questao4;

import java.util.Calendar;

/**
 * Classe que cria uma instância de utilização.
 */
public class Utilizacao {

    private String uso;
    private Calendar dataInicial;
    private Calendar dataFinal;

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

    /**
     * Método que retorna o valor do atributo data de inicio.
     */
    public Calendar getDataInicial() {
        return dataInicial;
    }

    /**
     * Método de acesso ao atributo data de inicio.
     */
    public void setDataInicial(Calendar dataInicial) {
        this.dataInicial = dataInicial;
    }

    /**
     * Método que retorna o valor do atributo data de fim.
     */
    public Calendar getDataFinal() {
        return dataFinal;
    }

    /**
     * Método de acesso ao atributo data de fim.
     */
    public void setDataFinal(Calendar dataFinal) {
        this.dataFinal = dataFinal;
    }
}