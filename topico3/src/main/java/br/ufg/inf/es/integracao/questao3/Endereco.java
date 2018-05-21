/*
 * Copyright (c) 2018.
 * Beatriz Nogueira Carvalho da Silveira
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.es.integracao.questao3;

import java.util.Objects;

/**
 * Classe que cria a instancia endereço do estudante.
 */
public class Endereco {

    private String cep;
    private String logradouro;
    private int numero;
    private String complemento;

    /**
     * Método construtor da classe Endereço.
     * @param cep cep do endereço.
     * @param logradouro nome da rua.
     * @param numero número da residencia.
     * @param complemento complemento do endereço.
     */
    public Endereco(String cep, String logradouro, int numero, String complemento) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
    }

    /**
     * Método que retorna o valor do atributo cep.
     */
    public String getCep() {
        return cep;
    }

    /**
     * Método que acesssa e atualiza o atributo cep.
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * Método que retorna o valor do atributo Logradouro.
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * Método que acesssa e atualiza o atributo Logradouro.
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    /**
     * Método que retorna o valor do atributo número.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Método que acesssa e atualiza o atributo Número.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Método que retorna o valor do atributo complemento.
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * Método que acesssa e atualiza o atributo complemento.
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

}