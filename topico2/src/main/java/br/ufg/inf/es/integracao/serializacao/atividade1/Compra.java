/**
 * Copyright (c) 2018.
 * Beatriz Nogueira Carvalho da Silveira
 * Creative Commons Attribution 4.0 International License.
 */

package main.java.br.ufg.inf.es.integracao.serializacao.atividade1;

/**
 *
 * @author Beatriz
 */

import java.io.Serializable;

public class Compra implements Serializable {
    private String pessoa;
    private Produto[] produtos;

    public Compra(String nome, Produto[] produto) {
        this.pessoa = nome;
        this.produtos = produto;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String nome) {
        this.pessoa = nome;
    }

}
