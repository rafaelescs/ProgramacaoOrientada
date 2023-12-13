package br.com.controle;

import java.util.ArrayList;
import java.util.List;


public class Curso {
     private String nome;
    private List<Professor> professores;

    public Curso(String nome) {
        this.nome = nome;
        this.professores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
        // Se necessário, adicionar o curso ao professor:
        // professor.adicionarCurso(this);
    }

    public void imprimir() {
        System.out.println("Nome do Curso: " + nome);
        System.out.println("Professor do Curso:");
        for (Professor professor : professores) {
            System.out.println(" - " + professor.getNome());
        }
    }
}