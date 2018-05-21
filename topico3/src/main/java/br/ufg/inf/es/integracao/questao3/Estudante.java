/*
 * Copyright (c) 2018.
 * Beatriz Nogueira Carvalho da Silveira
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.es.integracao.questao3;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Classe que cria a instância estudante.
 */
public class Estudante {

    private String nome;
    private int matricula;
    @JsonProperty("Endereço")
    private Endereco endereco;

    /**
     * Método construtor da classe Estudante.
     * @param nome do estudante.
     * @param matricula do estudante.
     * @param endereco do estudante.
     */
    public Estudante(String nome, int matricula, Endereco endereco) {
        this.nome = nome;
        this.matricula = matricula;
        this.endereco = endereco;
    }

    /**
     * Método que retorna o valor do atributo nome.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método que acesssa e atualiza o atributo nome.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método que retorna o valor do atributo matricula.
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * Método que acesssa e atualiza o atributo matricula.
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * Método que retorna o valor do atributo endereço.
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * Método que acesssa e atualiza o atributo endereço.
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}