/*
 * Copyright (c) 2018.
 * Beatriz Nogueira Carvalho da Silveira
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.es.integracao.questao2;

import java.util.ArrayList;

/**
 * Classe que instancia uma Sapataria.
 */
public class Sapataria {

    private ArrayList<Sapatos> sapatos;
    private ArrayList<Tenis> tenis;

    /**
     * Método que retorna o valor do atributo Sapato.
     */
    public ArrayList<Sapatos> getSapatos() {
        return sapatos;
    }

    /**
     * Método que acesssa e atualiza o atributo Sapato.
     */
    public void setSapatos(ArrayList<Sapatos> sapatos) {
        this.sapatos = sapatos;
    }

    /**
     * Método que retorna o valor do atributo Tenis.
     */
    public ArrayList<Tenis> getTenis() {
        return tenis;
    }

    /**
     * Método que acesssa e atualiza o atributo Tenis.
     */
    public void setTenis(ArrayList<Tenis> tenis) {
        this.tenis = tenis;
    }
}