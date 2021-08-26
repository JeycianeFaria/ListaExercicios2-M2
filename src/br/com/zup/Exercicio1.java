package br.com.zup;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //recebendo e atribuindo os valores
        System.out.println("Dígite o primeiro número: ");
        double num1 = leitor.nextDouble();
        System.out.println("Dígite o segundo número: ");
        double num2 = leitor.nextDouble();


        if (num1 > num2){
            System.out.println("O primeiro número  é maior que o segundo número.");
        }
        else if (num1 == num2){
            System.out.println("Os números são iguais.");
        }
        else{
            System.out.println("O segundo número é maior que o primeiro número.");
        }

    }

}
