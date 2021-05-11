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
public class DisciplinasCurso implements Serializable {
    private static final long serialVersionUID = 1L;
    private int idDisciplina;
    private String nomeDisciplina;
    private int idCurso;
    private String nomeCurso;

    public DisciplinasCurso(int idDisciplina, String nomeDisciplina, int idCurso, String nomeCurso) {
        this.idDisciplina = idDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.idCurso = idCurso;
        this.nomeCurso = nomeCurso;
    }

    DisciplinasCurso() {
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
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

    @Override
    public String toString() {
        return "Curso: " + nomeCurso + ", Disciplina: " + nomeDisciplina + "\n";
    }
}



