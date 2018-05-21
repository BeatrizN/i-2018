/*
 * Copyright (c) 2018.
 * Beatriz Nogueira Carvalho da Silveira
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.es.integracao.questao4;

/**
 * Classe que cria uma instância de linha de endereço.
 */
public class LinhaEndereco {

    private int ordem;
    private int linha;

    /**
     * Método que retorna o valor do atributo ordem.
     */
    public int getOrdem() {
        return ordem;
    }

    /**
     * Método de acesso ao atributo ordem.
     */
    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    /**
     * Método que retorna o valor do atributo Linha.
     */
    public int getLinha() {
        return linha;
    }

    /**
     * Método de acesso ao atributo Linha.
     */
    public void setLinha(int linha) {
        this.linha = linha;
    }
}