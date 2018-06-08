/*
 * Copyright (c) 2018.
 * Beatriz Nogueira Carvalho da Silveira
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.es.integracao;

import java.util.Calendar;

/**
 * Classe que cria uma instância de um identificador.
 */
public class Identificador {

    private String designacao;
    private String area;
    private String emissor;
    private Calendar data;
    private String tipo;
    private Utilizacao utilizacao;
    private Vinculo vinculo;
    private Ctps ctps;
    private Certidao certidao;
    private TituloEleitoral tituloEleitoral;

    /**
     * Método que retorna o valor do atributo designação.
     */
    public String getDesignacao() {
        return designacao;
    }

    /**
     * Método de acesso ao atributo designação.
     */
    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    /**
     * Método que retorna o valor do atributo área.
     */
    public String getArea() {
        return area;
    }

    /**
     * Método de acesso ao atributo área.
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * Método que retorna o valor do atributo emissor.
     */
    public String getEmissor() {
        return emissor;
    }

    /**
     * Método de acesso ao atributo emissor.
     */
    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

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
     * Método que retorna o valor do atributo tipo.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Método de acesso ao atributo tipo.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Método que retorna o valor do atributo utilização.
     */
    public Utilizacao getUtilizacao() {
        return utilizacao;
    }

    /**
     * Método de acesso ao atributo utilização.
     */
    public void setUtilizacao(Utilizacao utilizacao) {
        this.utilizacao = utilizacao;
    }

    /**
     * Método que retorna o valor do atributo Vinculo.
     */
    public Vinculo getVinculo() {
        return vinculo;
    }

    /**
     * Método de acesso ao atributo vinculo.
     */
    public void setVinculo(Vinculo vinculo) {
        this.vinculo = vinculo;
    }

    /**
     * Método que retorna o valor do atributo ctps.
     */
    public Ctps getCtps() {
        return ctps;
    }

    /**
     * Método de acesso ao atributo ctps.
     */
    public void setCtps(Ctps ctps) {
        this.ctps = ctps;
    }

    /**
     * Método que retorna o valor do atributo certidadão.
     */
    public Certidao getCertidao() {
        return certidao;
    }

    /**
     * Método de acesso ao atributo certidão.
     */
    public void setCertidao(Certidao certidao) {
        this.certidao = certidao;
    }

    /**
     * Método que retorna o valor do atributo titulo de eleitor.
     */
    public TituloEleitoral getTituloEleitoral() {
        return tituloEleitoral;
    }

    /**
     * Método de acesso ao atributo titulo de eleitor.
     */
    public void setTituloEleitoral(TituloEleitoral tituloEleitoral) {
        this.tituloEleitoral = tituloEleitoral;
    }
}