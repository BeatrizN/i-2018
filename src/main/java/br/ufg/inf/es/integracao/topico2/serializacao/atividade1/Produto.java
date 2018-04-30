package br.ufg.inf.es.integracao.topico2.serializacao.atividade1;
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