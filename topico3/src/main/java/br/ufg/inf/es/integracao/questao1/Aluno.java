/*
 * Copyright (c) 2018.
 * Beatriz Nogueira Carvalho da Silveira
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.es.integracao.questao1;

// import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe de objetos aluno.
 */
@XmlRootElement(name = "aluno")
public class Aluno {

    private String nome;
    private String email;

    /**
     * Método que retor o valor do atributo nome.
     * @return Nome do aluno.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método que retor o valor do atributo email.
     * @return Email do aluno.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Método que acesssa e atualiza a variável nome.
     * @param nome Nome do aluno.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método que acesssa e atualiza a variável email·
     * @param email Email do aluno.
     */
    public void setEmail(String email) {
        this.email = email;
    }
}