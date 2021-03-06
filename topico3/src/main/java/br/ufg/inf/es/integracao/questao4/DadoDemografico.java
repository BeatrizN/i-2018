/*
 * Copyright (c) 2018.
 * Beatriz Nogueira Carvalho da Silveira
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.es.integracao.questao4;
 
/**
 * Classe que cria uma instância dos dados demograficos.
 */
public class DadoDemografico {

    private Data nascimento;
    private Data obito;
    private Nacionalidade nacionalidade;
    private String sexo;
    private String nomeMae;
    private String nomePai;
    private String situacaoFamiliar;
    private String raca;
    private String comentario;
    private String fonteNotificacaoObito;
    private String nascimentoPluralidade;
    private String nascimentoOrdem;
    private String nascimentoseguinte;

    /**
     * Método que retorna o valor do atributo data de nascimento.
     */
    public Data getNascimento() {
        return nascimento;
    }

    /**
     * Método de acesso ao atributo data de nascimento.
     */
    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

    /**
     * Método que retorna o valor do atributo data de obito.
     */
    public Data getObito() {
        return obito;
    }

    /**
     * Método de acesso ao atributo data de obito.
     */
    public void setObito(Data obito) {
        this.obito = obito;
    }

    /**
     * Método que retorna o valor do atributo nacionalidade.
     */
    public Nacionalidade getNacionalidade() {
        return nacionalidade;
    }

    /**
     * Método de acesso ao atributo nacionalidade.
     */
    public void setNacionalidade(Nacionalidade nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    /**
     * Método que retorna o valor do atributo sexo.
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Método de acesso ao atributo sexo.
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * Método que retorna o valor do atributo nome da mãe.
     */
    public String getNomeMae() {
        return nomeMae;
    }

    /**
     * Método de acesso ao atributo nome da mãe.
     */
    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    /**
     * Método que retorna o valor do atributo nome do pai.
     */
    public String getNomePai() {
        return nomePai;
    }

    /**
     * Método de acesso ao atributo nome do pai.
     */
    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    /**
     * Método que retorna o valor do atributo situação familiar.
     */
    public String getSituacaoFamiliar() {
        return situacaoFamiliar;
    }

    /**
     * Método de acesso ao atributo situação familiar.
     */
    public void setSituacaoFamiliar(String situacaoFamiliar) {
        this.situacaoFamiliar = situacaoFamiliar;
    }

    /**
     * Método que retorna o valor do atributo raça.
     */
    public String getRaca() {
        return raca;
    }

    /**
     * Método de acesso ao atributo raça.
     */
    public void setRaca(String raca) {
        this.raca = raca;
    }

    /**
     * Método que retorna o valor do atributo comentario.
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * Método de acesso ao atributo comentario.
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * Método que retorna o valor do atributo fonte de notificação de obito.
     */
    public String getFonteNotificacaoObito() {
        return fonteNotificacaoObito;
    }

    /**
     * Método de acesso ao atributo fonte de notificação de obito.
     */
    public void setFonteNotificacaoObito(String fonteNotificacaoObito) {
        this.fonteNotificacaoObito = fonteNotificacaoObito;
    }

    /**
     * Método que retorna o valor do atributo nascimento pluralidade.
     */
    public String getNascimentoPluralidade() {
        return nascimentoPluralidade;
    }

    /**
     * Método de acesso ao atributo pluralidade.
     */
    public void setNascimentoPluralidade(String nascimentoPluralidade) {
        this.nascimentoPluralidade = nascimentoPluralidade;
    }

    /**
     * Método que retorna o valor do atributo nasciemnto ordem.
     */
    public String getNascimentoOrdem() {
        return nascimentoOrdem;
    }

    /**
     * Método de acesso ao atributo nascimento ordem.
     */
    public void setNascimentoOrdem(String nascimentoOrdem) {
        this.nascimentoOrdem = nascimentoOrdem;
    }

    /**
     * Método que retorna o valor do atributo nascimento seguinte.
     */
    public String getNascimentoseguinte() {
        return nascimentoseguinte;
    }

    /**
     * Método de acesso ao atributo nascimento seguinte.
     */
    public void setNascimentoseguinte(String nascimentoseguinte) {
        this.nascimentoseguinte = nascimentoseguinte;
    }
}