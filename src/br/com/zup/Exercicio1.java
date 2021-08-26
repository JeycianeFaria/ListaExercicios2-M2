package br.com.zup;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //recebendo e atribuindo os valores
        System.out.println("Dígite o primeiro numero: ");
        double num1 = leitor.nextDouble();
        System.out.println("Dígite o segundo numero: ");
        double num2 = leitor.nextDouble();


        if (num1 > num2){
            System.out.println("O número 1 é maior que o número 2.");
        }
        else if (num1 == num2){
            System.out.println("Os numeros são iguais.");
        }
        else{
            System.out.println("O número 2 é maior que o número 1.");
        }

    }

}
