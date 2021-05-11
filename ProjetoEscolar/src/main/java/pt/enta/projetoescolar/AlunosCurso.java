/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.enta.projetoescolar;

import java.io.Serializable;

/**
 *
 * @author Messias Rodrigues
 */
class AlunosCurso implements Serializable {
    private static final long serialVersionUID = 1L;
    private int idCurso;
    private String nomeCurso;
    private int idAluno;
    private String nomeAluno;

    public AlunosCurso(int idCurso, String nomeCurso, int idAluno, String nomeAluno) {
        this.idCurso = idCurso;
        this.nomeCurso = nomeCurso;
        this.idAluno = idAluno;
        this.nomeAluno = nomeAluno;
    }

    AlunosCurso() {
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    @Override
    public String toString() {
        return "Curso: " + nomeCurso + ", Aluno: " + nomeAluno + "\n";
    }
}
