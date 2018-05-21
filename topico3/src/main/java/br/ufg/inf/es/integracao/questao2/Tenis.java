/*
 * Copyright (c) 2018.
 * Beatriz Nogueira Carvalho da Silveira
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.es.integracao.questao2;

/**
 * Classe que cria uma instancia de Tenis.
 */
public class Tenis extends Calcados {

    private String esporte;

    /**
     * Método que retorna o valor do atributo esporte.
     */
    public String getEsporte() {
        return esporte;
    }

    /**
     * Método que acesssa e atualiza o atributo esporte.
     */
    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

}