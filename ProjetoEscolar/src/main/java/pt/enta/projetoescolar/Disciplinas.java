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
public class Disciplinas implements Serializable {

    private static final long serialVersionUID = 1L;
    private int idDisciplina;
    private String nomeDisciplina;
    private int horasDisciplina;

    public Disciplinas(int idDisciplina, String nomeDisciplina, int horasDisciplina) {
        this.idDisciplina = idDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.horasDisciplina = horasDisciplina;
    }

    Disciplinas() {
        
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

    public int getHorasDisciplina() {
        return horasDisciplina;
    }

    public void setHorasDisciplina(int horasDisciplina) {
        this.horasDisciplina = horasDisciplina;
    }

    @Override
    public String toString() {
        return "ID: " + idDisciplina + "\n" + "Nome: " + nomeDisciplina + "\n" + "Horas: " + horasDisciplina + "\n" + "\n";
    }
}
