package com.example.deyvison.roteiro04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Aluno aluno1 = new Aluno("123", "Guerrero");
        Aluno aluno2 = new Aluno("456", "Sheik");
        Aluno aluno3 = new Aluno("789", "Cirino");

        Disciplina disciplina1 = new Disciplina("LP",3);
        Disciplina disciplina2 = new Disciplina("POO",4);
        Disciplina disciplina3 = new Disciplina("APS", 5);

        Professor professor1 = new Professor(disciplina1,"Vanessa");
        Professor professor2 = new Professor(disciplina2,"Ayla");
        Professor professor3 = new Professor(disciplina3,"Rodrigo Vilar");

        DB db = new DB(this);

        //-------------------------------------------insert de alunos
        try {
            db.insertAluno(aluno1);
            db.insertAluno(aluno2);
            db.insertAluno(aluno3);
        } catch (SQLException e) {
            Log.e("ayty", "Erro ao inserir aluno");
        }
        //-------------------------------------------insert de professores
        try {
            db.insertProfessor(professor1);
            db.insertProfessor(professor2);
            db.insertProfessor(professor3);
        } catch (SQLException e) {
            Log.e("ayty", "Erro ao inserir professor");
        }
        //-----------------------------------------insert de disciplinas
        try {
            db.insertDisciplina(disciplina1);
            db.insertDisciplina(disciplina2);
            db.insertDisciplina(disciplina3);
        } catch (SQLException e) {
            Log.e("ayty", "Erro ao inserir disciplinas");
        }
        //-----------------------------------------------------select de disciplinas
        List<Disciplina> disciplinas = new ArrayList<>();
        try {
            disciplinas = db.selectDisciplina();
            for(Disciplina d: disciplinas){
                Log.i("disciplinas", d.toString());
            }
        } catch (SQLException e) {
            Log.e("ayty", "Erro ao selecionar todas as disciplinas");
        }
        //-----------------------------------------select de alunos
        List<Aluno> alunos = new ArrayList<>();
        try {
            alunos = db.selectAluno();
            for(Aluno aluno : alunos){
                Log.i("ayty", aluno.toString());
            }
        } catch (SQLException e) {
            Log.e("ayty", "Erro ao selecionar todos os alunos");
        }
        //----------------------------------------------------select de professores
        List<Professor> professores = new ArrayList<>();
        try {
            professores = db.selectProfessor();
            for(Professor professor : professores){
                Log.i("ayty", professor.toString());
            }
        } catch (SQLException e) {
            Log.e("ayty", "Erro ao selecionar todos os alunos");
        }
    }
}


