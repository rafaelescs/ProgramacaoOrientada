package atividade3;

import java.util.Scanner;

public class DVD extends midia {
    private int nFaixas;

    // Construtor sem parâmetros.
    public DVD() {
        this(0, 0.0, "Nenhum", 0); // Chamada ao construtor com param.
    }

    // Construtor com parâmetros.
    public DVD(int codigo, double preco, String name, int nFaixas) {
        super(codigo, preco, name); // Chamada ao construtor da classe Midia.
        setFaixas(nFaixas);
    }

    // Função para impressão do tipo.
    public String getTipo() {
        return "DVD: ";
    }

    // Função que retorna o conteúdo dos campos desta
    // classe e da classe Midia (usando super!).
    public String getDetalhes() {
        return super.getDetalhes() + "\n" +
                "Número de faixas: " + nFaixas + "\n";
    }

    public void setFaixas(int nfaix) {
        nFaixas = (nfaix > 0) ? nfaix : 0;
    }

    // Função para leitura dos dados via teclado dos
    // campos desta classe e dos campos da classe
    // Midia (usando super!).
    public void inserirDados() {
        // Leitura dos dados contidos nos campos
        // pertencentes à classe Midia.
        super.inserirDados();

        Scanner in = new Scanner(System.in);

        // Leitura dos dados do teclado.
        System.out.printf("\nEntre com o número de faixas: ");
        int nfaix = in.nextInt();

        // Enviando os dados lidos para as funções set.
        setFaixas(nfaix);

        // Closing the Scanner
        in.close();
    }
}