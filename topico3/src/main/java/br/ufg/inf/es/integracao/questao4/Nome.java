/*
 * Copyright (c) 2018.
 * Beatriz Nogueira Carvalho da Silveira
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.es.integracao.questao4;

import java.util.List;

/**
 * Classe que cria uma instância de nome de um parciente.
 */
public class Nome {

    private List<Representacao> representacao;
    private List<Utilizacao> utilizacoe;
    private String titulos;
    private String nomes;
    private String sobrenomes;
    private String sufixos;
    private String prefereido;
    private String usoCondicional;

    /**
     * Método que retorna o valor do atributo representação.
     */
    public List<Representacao> getRepresentacao() {
        return representacao;
    }

    /**
     * Método de acesso ao atributo representação.
     */
    public void setRepresentacao(List<Representacao> representacao) {
        this.representacao = representacao;
    }

    /**
     * Método que retorna o valor do atributo utilizações.
     */
    public List<Utilizacao> getUtilizacoe() {
        return utilizacoe;
    }

    /**
     * Método de acesso ao atributo utilizações.
     */
    public void setUtilizacoe(List<Utilizacao> utilizacoe) {
        this.utilizacoe = utilizacoe;
    }

    /**
     * Método que retorna o valor do atributo titulos.
     */
    public String getTitulos() {
        return titulos;
    }

    /**
     * Método de acesso ao atributo titulos.
     */
    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    /**
     * Método que retorna o valor do atributo nomes.
     */
    public String getNomes() {
        return nomes;
    }

    /**
     * Método de acesso ao atributo nomes.
     */
    public void setNomes(String nomes) {
        this.nomes = nomes;
    }

    /**
     * Método que retorna o valor do atributo sobrenomes.
     */
    public String getSobrenomes() {
        return sobrenomes;
    }

    /**
     * Método de acesso ao atributo sobrenomes.
     */
    public void setSobrenomes(String sobrenomes) {
        this.sobrenomes = sobrenomes;
    }

    /**
     * Método que retorna o valor do atributo sufixos.
     */
    public String getSufixos() {
        return sufixos;
    }

    /**
     * Método de acesso ao atributo sufixos.
     */
    public void setSufixos(String sufixos) {
        this.sufixos = sufixos;
    }

    /**
     * Método que retorna o valor do atributo preferido.
     */
    public String getPrefereido() {
        return prefereido;
    }

    /**
     * Método de acesso ao atributo preferido.
     */
    public void setPrefereido(String prefereido) {
        this.prefereido = prefereido;
    }

    /**
     * Método que retorna o valor do atributo condicional.
     */
    public String getUsoCondicional() {
        return usoCondicional;
    }

    /**
     * Método de acesso ao atributo condicional.
     */
    public void setUsoCondicional(String usoCondicional) {
        this.usoCondicional = usoCondicional;
    }
}