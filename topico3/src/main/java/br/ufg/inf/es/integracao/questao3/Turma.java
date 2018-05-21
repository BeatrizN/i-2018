/*
 * Copyright (c) 2018.
 * Beatriz Nogueira Carvalho da Silveira
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.es.integracao.questao3;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Classe que cria instancia de uma turma e seus estudantes.
 */
public class Turma {

    private String disciplina;
    @JsonProperty("Estudante")
    private List<Estudante> estudantes;

    /**
     * Método que retorna o valor do atributo disciplina.
     */
    public String getDisciplina() {
        return disciplina;
    }

    /**
     * Método que acesssa e atualiza o atributo disciplina.
     */
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    /**
     * Método que retorna o valor do atributo estudante.
     */
    public List<Estudante> getEstudantes() {
        return estudantes;
    }

    /**
     * Método que acesssa e atualiza o atributo estudante.
     */
    public void setEstudantes(Estudante estudantes) {
        this.estudantes.add(estudantes);
    }

}