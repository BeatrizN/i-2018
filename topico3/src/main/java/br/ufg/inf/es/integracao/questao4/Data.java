/*
 * Copyright (c) 2018.
 * Beatriz Nogueira Carvalho da Silveira
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.es.integracao.questao4;
 
import java.util.Calendar;

/**
 * Classe que cria uma instacia de data.
 */
public class Data {

    private Calendar data;
    private String acuracia;

    /**
     * Método que retorna o valor do atributo data.
     */
    public Calendar getData() {
        return data;
    }

    /**
     * Método de acesso ao atributo data.
     */
    public void setData(Calendar data) {
        this.data = data;
    }

    /**
     * Método que retorna o valor do atributo acuracia.
     */
    public String getAcuracia() {
        return acuracia;
    }

    /**
     * Método de acesso ao atributo acuracia.
     */
    public void setAcuracia(String acuracia) {
        this.acuracia = acuracia;
    }
}