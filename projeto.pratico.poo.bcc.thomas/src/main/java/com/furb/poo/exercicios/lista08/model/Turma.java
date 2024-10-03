/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.furb.poo.exercicios.lista08.model;

/**
 *
 * @author liandrar
 */
public class Turma {
    private String disciplina;
    private Professor professor;
    private Aluno aluno;
    private Turno turno;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    public Professor getProfessor(){
        return professor;
    }
    
}
