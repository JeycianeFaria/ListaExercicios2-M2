package br.com.zup;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //variaveis
        double valorProduto1;
        double valorProduto2;
        double valorProduto3;

        //Recebendo valores
        System.out.println("Digite o valor do Produto 1");
        valorProduto1 = leitor.nextDouble();
        System.out.println("Digite o valor do Produto 2");
        valorProduto2 = leitor.nextDouble();
        System.out.println("Digite o valor do Produto 3");
        valorProduto3 = leitor.nextDouble();

        //Verificando qual produto é mais barato
        if (valorProduto1 < valorProduto2 & valorProduto1 < valorProduto3){
            System.out.println("Você deve comprar o Produto 1, pois ele é o mais barato");
        }
        else if (valorProduto2 < valorProduto1 & valorProduto2 < valorProduto3){
            System.out.println("Você deve comprar o Produto 2, pois ele é o mais barato");
        }
        else {
            System.out.println("Você deve comprar o Produto 3, pois ele é o mais barato");
        }

    }

}
