package br.com.zup;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //receber o valor
        System.out.println("Por favor, dígite o valor atual do seu salário : ");
        double salarioAtual = leitor.nextDouble();

        if (salarioAtual > 0 & salarioAtual <= 280){
            System.out.println("O seu salário atual é R$ " + salarioAtual);

            String percentual20 = "20%";
            System.out.println("O seu percentual de aumento será de " + percentual20);

            double valorAumento20 = salarioAtual * 0.2;
            System.out.println("O valor do aumento será de R$ " + valorAumento20);

            double salarioAjustado = salarioAtual + valorAumento20;
            System.out.println("O seu sálario atualizado será de R$ " + salarioAjustado);
        }
        else if (salarioAtual > 280 & salarioAtual <= 700){
            System.out.println("O seu salário atual é R$ " + salarioAtual);

            String percentual15 = "15%";
            System.out.println("O seu percentual de aumento será de " + percentual15);

            double valorAumento15 = salarioAtual * 0.15;
            System.out.println("O valor do aumento será de R$ " + valorAumento15);

            double salarioAjustado = salarioAtual + valorAumento15;
            System.out.println("O seu sálario atualizado será de R$ " + salarioAjustado);

        }
        else if (salarioAtual > 700 & salarioAtual <= 1500){
            System.out.println("O seu salário atual é R$ " + salarioAtual);

            String percentual10 = "10%";
            System.out.println("O seu percentual de aumento será de " + percentual10);

            double valorAumento10 = salarioAtual * 0.1;
            System.out.println("O valor do aumento será de R$ " + valorAumento10);

            double salarioAjustado = salarioAtual + valorAumento10;
            System.out.println("O seu sálario atualizado será de R$ " + salarioAjustado);

        }
        else if (salarioAtual > 1500 ){
            System.out.println("O seu salário atual é R$ " + salarioAtual);

            String percentual5 = "5%";
            System.out.println("O seu percentual de aumento será de " + percentual5);

            double valorAumento5 = salarioAtual * 0.05;
            System.out.println("O valor do aumento será de R$ " + valorAumento5);

            double salarioAjustado = salarioAtual + valorAumento5;
            System.out.println("O seu sálario atualizado será de R$ " + salarioAjustado);
        }
        else {
            System.out.println("Salário inválido, digite novamente");
        }

    }

}
