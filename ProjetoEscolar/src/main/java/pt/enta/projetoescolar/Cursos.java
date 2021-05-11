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
public class Cursos implements Serializable {

    private static final long serialVersionUID = 1L;
    private int idCurso;
    private int vagasCurso;
    private String nomeCurso;

    public Cursos(int idCurso, int vagasCurso, String nomeCurso) {
        this.idCurso = idCurso;
        this.vagasCurso = vagasCurso;
        this.nomeCurso = nomeCurso;
    }

    Cursos() {
        
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

    public int getVagasCurso() {
        return vagasCurso;
    }

    public void setVagasCurso(int vagasCurso) {
        this.vagasCurso = vagasCurso;
    }

    @Override
    public String toString() {
        return "ID: " + idCurso + "\n" + "Nome: " + nomeCurso + "\n" + "Vagas: " + vagasCurso + "\n" + "\n";
    }   
}
