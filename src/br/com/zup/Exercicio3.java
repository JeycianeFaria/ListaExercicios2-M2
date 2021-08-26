package br.com.zup;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner leitor =new Scanner(System.in);

        //variaveis
        double nota1;
        double nota2;
        double somaNotas;
        double mediaAluno;

        //Recebendo valores
        System.out.println("Por favor dígite a sua Primeira nota");
        nota1 = leitor.nextDouble();
        System.out.println("Por favor dígite a sua Segunda nota");
        nota2 = leitor.nextDouble();

        //calculando Média do Aluno
        somaNotas = nota1 + nota2;
        mediaAluno = somaNotas/2;

        //Tomada de Decisão e mensagem
        if (mediaAluno > 0 & mediaAluno < 7 ){
            System.out.println("Você está Reprovado, com a nota " + mediaAluno);
        }
        else if (mediaAluno >= 7 & mediaAluno < 10){
            System.out.println("Você está Aprovado, com a nota " + mediaAluno);
        }
        else if (mediaAluno == 10){
            System.out.println("Você está Aprovado com Distinção, com a nota " + mediaAluno);
        }
        else{
            System.out.println("Você digitou notas inválidas!. Digite novamente.");
        }

    }

}
