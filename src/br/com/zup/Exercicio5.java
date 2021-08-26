package br.com.zup;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Olá, esses são os numeros correspondentes a cada dia da semana : ");
        System.out.println("1. Domingo");
        System.out.println("2. Segunda-feira");
        System.out.println("3. Terça-feira");
        System.out.println("4. Quarta-feira");
        System.out.println("5. Quinta-feira");
        System.out.println("6. Sexta-feira");
        System.out.println("7. Sábado");

        System.out.println("Por favor dígite o numero do dia da semana que você quer selecionar:");
        double diaSemana = leitor.nextDouble();

        if (diaSemana == 1){
            System.out.println("O dia selecionado foi o Domingo!");
        }
        else if (diaSemana == 2){
            System.out.println("O dia selecionado foi a Segunda-feira!");
        }
        else if (diaSemana == 3){
            System.out.println("O dia selecionado foi a Terça-feira!");
        }
        else if (diaSemana == 4){
            System.out.println("O dia selecionado foi a Quarta-feira!");
        }
        else if (diaSemana == 5){
            System.out.println("O dia selecionado foi a Quinta-feira!");
        }
        else if (diaSemana == 6){
            System.out.println("O dia selecionado foi a Sexta-feira!");
        }
        else if (diaSemana == 7){
            System.out.println("O dia selecionado foi o Sábado");
        }
        else{
            System.out.println("Valor inválido");
        }



    }

}
