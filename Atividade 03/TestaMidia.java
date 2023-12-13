package atividade3;

import java.util.Scanner;

public class TestaMidia {
    public static void main(String args[]) {
        // Cria um vetor de elementos que são objetos da classe Midia.
        midia[] lista = new midia[10];

        int opcao;

        // Preenchendo o vetor com CDs.
        for (int i = 0; i < 2; i++) {
            // Usuário escolhe se quer cadastrar CD ou DVD.
            System.out.println("Digite 1 para CD e 2 para DVD");
            Scanner in = new Scanner(System.in);
            opcao = in.nextInt();

            if (opcao == 1) // Criar CD.
                lista[i] = new CD();
            else // Criar DVD.
                lista[i] = new DVD();

            lista[i].inserirDados(); // Inserir dados no objeto criado seja CD ou DVD.

            // Explicitly close the Scanner.
            in.close();
        }

        // Imprimindo o conteúdo de cada elemento do vetor de acordo com a classe a que
        // ele pertence
        // (isto é, usando polimorfismo).
        for (int i = 0; i < 2; i++)
            System.out.println(lista[i].getDetalhes());
    }
}