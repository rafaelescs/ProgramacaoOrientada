/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

import java.util.ArrayList;
import java.util.List;


public class Professor extends Pessoa{
    private List<Curso> cursos;

    public Professor(String nome) {
        super(nome);
        this.cursos = new ArrayList<>();
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
        // Se necessário, adicionar o professor ao curso:
        curso.adicionarProfessor(this);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Curso do Professor:");
        for (Curso curso : cursos) {
            System.out.println(" - " + curso.getNome());
        }
    }
}