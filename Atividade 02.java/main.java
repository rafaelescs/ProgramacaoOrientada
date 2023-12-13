package br.com.visao;

import br.com.controle.Curso;
import br.com.controle.Professor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite o nome do professor: ");
        String nomeProfessor = scanner.nextLine();
        Professor professor = new Professor(nomeProfessor);

   
        System.out.print("Digite o nome da disciplina: ");
        String nomeDisciplina = scanner.nextLine();
        Curso disciplina = new Curso(nomeDisciplina);

        
        disciplina.adicionarProfessor(professor);

        
        System.out.println("\nInformacaoes:");
        professor.imprimir();
        disciplina.imprimir();

        scanner.close();
    }
}