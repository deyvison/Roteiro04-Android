package com.example.deyvison.roteiro04;

/**
 * Created by Deyvison on 01/04/2016.
 */

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "aluno")
public class Aluno {
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField
    private String matricula;
    @DatabaseField
    private String nome;
    @DatabaseField(foreign = true)
    private Professor professor;

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public Aluno() {
    }

    public int getId() {
        return id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return "id: "+this.id+"\nnome: "+this.nome+"\nmatricula: "+this.matricula;
    }
}