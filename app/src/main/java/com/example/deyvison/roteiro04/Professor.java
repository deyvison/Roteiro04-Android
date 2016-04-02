package com.example.deyvison.roteiro04;

/**
 * Created by Deyvison on 01/04/2016.
 */

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.ArrayList;
import java.util.Collection;

@DatabaseTable
public class Professor {

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField
    private Disciplina disciplina;

    @DatabaseField
    private String nome;

    @ForeignCollectionField
    Collection<Aluno> alunos = new ArrayList<>();

    public Professor(Disciplina disciplina, String nome) {
        this.disciplina = disciplina;
        this.nome = nome;
    }
    public void addAluno(Aluno aluno){
        this.alunos.add(aluno);
    }
    public void removerAluno(Aluno aluno){
        this.alunos.remove(aluno);
    }

    public Professor() {
    }

    public int getId() {
        return id;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "id: "+this.id+"\nnome: "+this.nome+"\ndisciplina: "+this.disciplina;
    }
}