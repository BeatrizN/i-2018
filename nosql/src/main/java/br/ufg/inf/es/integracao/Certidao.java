/*
 * Copyright (c) 2018.
 * Beatriz Nogueira Carvalho da Silveira
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.es.integracao;
 
/**
 * Classe que cria uma instância de uma certidão de nascimento.
 */
public class Certidao {

    private String tipo;
    private String cartorio;
    private String livro;
    private int folha;
    private String termo;

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
     * Método que retorna o valor do atributo cartorio.
     */
    public String getCartorio() {
        return cartorio;
    }

    /**
     * Método de acesso ao atributo cartorio.
     */
    public void setCartorio(String cartorio) {
        this.cartorio = cartorio;
    }

    /**
     * Método que retorna o valor do atributo Livro.
     */
    public String getLivro() {
        return livro;
    }

    /**
     * Método de acesso ao atributo Livro.
     */
    public void setLivro(String livro) {
        this.livro = livro;
    }

    /**
     * Método que retorna o valor do atributo folha.
     */
    public int getFolha() {
        return folha;
    }

    /**
     * Método de acesso ao atributo folha.
     */
    public void setFolha(int folha) {
        this.folha = folha;
    }

    /**
     * Método que retorna o valor do atributo termo.
     */
    public String getTermo() {
        return termo;
    }

    /**
     * Método de acesso ao atributo termo.
     */
    public void setTermo(String termo) {
        this.termo = termo;
    }
}