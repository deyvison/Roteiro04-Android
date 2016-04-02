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
public class Disciplina {

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField
    private String nome;

    @DatabaseField
    private int quantCreditos;

    @ForeignCollectionField
    Collection<Professor> professores = new ArrayList<>();

    public Disciplina(String nome, int quantCreditos) {
        this.nome = nome;
        this.quantCreditos = quantCreditos;
    }

    public int getQuantCreditos() {
        return quantCreditos;
    }

    public void setQuantCreditos(int quantCreditos) {
        this.quantCreditos = quantCreditos;
    }

    public void addProfessor(Professor professor){
        this.professores.add(professor);
    }

    public void removerProfessor(Professor professor){
        this.professores.remove(professor);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", quantCreditos=" + quantCreditos +
                '}';
    }
}
