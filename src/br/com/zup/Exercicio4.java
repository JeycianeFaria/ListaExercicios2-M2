package br.com.zup;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //receber o valor
        System.out.println("Por favor, dígite o valor atual do seu salário : ");
        double salarioAtual = leitor.nextDouble();

        //declaração das variaveis
        double percentual20 = 0.2;
        double percentual15 = 0.15;
        double percentual10 = 0.1;
        double percentual5 = 0.05;
        double valorAumento20 = salarioAtual * percentual20;
        double valorAumento15 = salarioAtual * percentual15;
        double valorAumento10 = salarioAtual * percentual10;
        double valorAumento5 = salarioAtual * percentual5;


        if (salarioAtual > 0 & salarioAtual <= 280){
            System.out.println("O seu salário atual é R$ " + salarioAtual);
            System.out.println("O seu percentual de aumento será de 20% " );
            System.out.println("O valor do aumento será de R$ " + valorAumento20);
            double salarioAjustado = salarioAtual + valorAumento20;
            System.out.println("O seu sálario atualizado será de R$ " + salarioAjustado);
        }
        else if (salarioAtual > 280 & salarioAtual <= 700){
            System.out.println("O seu salário atual é R$ " + salarioAtual);
            System.out.println("O seu percentual de aumento será de 15%" );
            System.out.println("O valor do aumento será de R$ " + valorAumento15);
            double salarioAjustado = salarioAtual + valorAumento15;
            System.out.println("O seu sálario atualizado será de R$ " + salarioAjustado);

        }
        else if (salarioAtual > 700 & salarioAtual <= 1500){
            System.out.println("O seu salário atual é R$ " + salarioAtual);
            System.out.println("O seu percentual de aumento será de 10% " );
            System.out.println("O valor do aumento será de R$ " + valorAumento10);
            double salarioAjustado = salarioAtual + valorAumento10;
            System.out.println("O seu sálario atualizado será de R$ " + salarioAjustado);

        }
        else if (salarioAtual > 1500 ){
            System.out.println("O seu salário atual é R$ " + salarioAtual);
            System.out.println("O seu percentual de aumento será de 5%" );
            System.out.println("O valor do aumento será de R$ " + valorAumento5);
            double salarioAjustado = salarioAtual + valorAumento5;
            System.out.println("O seu sálario atualizado será de R$ " + salarioAjustado);
        }
        else {
            System.out.println("Salário inválido, digite novamente");
        }

    }

}
