package com.curso.aula15;
import java.util.Scanner;

public class AumentoSalario11 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Salário: R$ ");
        double salario = scan.nextDouble();

        if(salario <= 280){
            double salarioNovo = (salario * 0.2) + salario;
            double porcentagem = 20;
            double valorPorcentagem = salario * 0.2;
            System.out.println("O salario antes do reajuste era: R$ " + salario);
            System.out.println("Percentual do aumento: " + porcentagem + "%");
            System.out.println("Valor do aumento: R$ " + valorPorcentagem);
            System.out.print("Novo salário: R$ " + salarioNovo);
        }

        else if(salario >= 280 && salario <= 700){
            double salarioNovo = (salario * 0.15) + salario;
            double porcentagem = 15;
            double valorPorcentagem = salario * 0.15;
            System.out.println("O salario antes do reajuste era: R$ " + salario);
            System.out.println("Percentual do aumento: " + porcentagem + "%");
            System.out.println("Valor do aumento: R$ " + valorPorcentagem);
            System.out.print("Novo salário: R$ " + salarioNovo);
        }

        else if(salario >= 700 && salario <= 1500){
            double salarioNovo = (salario * 0.1) + salario;
            double porcentagem = 10;
            double valorPorcentagem = salario * 0.1;
            System.out.println("O salario antes do reajuste era: R$ " + salario);
            System.out.println("Percentual do aumento: " + porcentagem + "%");
            System.out.println("Valor do aumento: R$ " + valorPorcentagem);
            System.out.print("Novo salário: R$ " + salarioNovo);
        }

        else{
            double salarioNovo = (salario * 0.05) + salario;
            double porcentagem = 5;
            double valorPorcentagem = salario * 0.05;
            System.out.println("O salario antes do reajuste era: R$ " + salario);
            System.out.println("Percentual do aumento: " + porcentagem + "%");
            System.out.println("Valor do aumento: R$ " + valorPorcentagem);
            System.out.print("Novo salário: R$ " + salarioNovo);
        }
    }
}
