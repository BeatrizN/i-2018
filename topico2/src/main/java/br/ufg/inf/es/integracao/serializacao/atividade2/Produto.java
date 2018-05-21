/**
 * Copyright (c) 2018.
 * Beatriz Nogueira Carvalho da Silveira
 * Creative Commons Attribution 4.0 International License.
 */

package main.java.br.ufg.inf.es.integracao.serializacao.atividade2;

/**
 *
 * @author Beatriz
 */
public class Produto {
    public String nome;
    public String descricao;   

    public Produto(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setPreco(String descricao) {
        this.descricao = descricao;
    }
}
