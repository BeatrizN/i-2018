package br.ufg.inf.es.integracao.topico2.serializacao.atividade1;

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
