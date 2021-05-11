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
public class Alunos implements Serializable {

    private static final long serialVersionUID = 1L;
    private int idAluno;
    private String nomeAluno;
    private int idadeAluno;
    private String generoAluno;
    private String paisAluno;

    public Alunos(int idAluno, String nomeAluno, int idadeAluno, String generoAluno, String paisAluno) {
        this.idAluno = idAluno;
        this.nomeAluno = nomeAluno;
        this.idadeAluno = idadeAluno;
        this.generoAluno = generoAluno;
        this.paisAluno = paisAluno;
    }

    Alunos() {
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

    public int getIdadeAluno() {
        return idadeAluno;
    }

    public void setIdadeAluno(int idadeAluno) {
        this.idadeAluno = idadeAluno;
    }

    public String getGeneroAluno() {
        return generoAluno;
    }

    public void setGeneroAluno(String generoAluno) {
        this.generoAluno = generoAluno;
    }

    public String getPaisAluno() {
        return paisAluno;
    }

    public void setPaisAluno(String paisAluno) {
        this.paisAluno = paisAluno;
    }
    
    @Override
    public String toString() {
        return "ID: " + idAluno + "\n" + "Nome: " + nomeAluno + "\n" + "Idade: " + idadeAluno + "\n" + "Género: " + generoAluno + "\n" + "País: " + paisAluno + "\n" + "\n";
    }   
    
}
