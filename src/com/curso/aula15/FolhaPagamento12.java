package com.curso.aula15;
import java.util.Scanner;

public class FolhaPagamento12 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Valor hora de trabalho: ");
        double valorHora = scan.nextDouble();

        System.out.print("Horas trabalhas no mês: ");
        double horasTrabalhadas = scan.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        double inss = salarioBruto * 0.1;
        double fgts = salarioBruto * 0.11;


        if(salarioBruto <= 900){
            double impostoRenda = 0;
            double totalDescontos = inss + impostoRenda;
            double salarioLiquido = salarioBruto - totalDescontos;

            System.out.println("Salário Bruto: " + "( " + valorHora + " * " + horasTrabalhadas + ")"
            + " : R$ " + salarioBruto);
            System.out.println("(-)  IR (0%)                  : R$ 0.00");
            System.out.println("(-)  INSS (10%)               : R$ " + inss);
            System.out.println("FGTS (11%)                    : R$ " + fgts);
            System.out.println("Total de descontos            : R$ " + totalDescontos);
            System.out.print("Salário Liquído               : R$ " + salarioLiquido);
        }

        else if(salarioBruto <= 1500){
            double impostoRenda = salarioBruto * 0.05;
            double totalDescontos = inss + impostoRenda;
            double salarioLiquido = salarioBruto - totalDescontos;

            System.out.println("Salário Bruto: " + "( " + valorHora + " * " + horasTrabalhadas + ")"
                    + " : R$ " + salarioBruto);
            System.out.println("(-)  IR (5%)                    : R$ " + impostoRenda);
            System.out.println("(-)  INSS (10%)                 : R$ " + inss);
            System.out.println("FGTS (11%)                      : R$ " + fgts);
            System.out.println("Total de descontos              : R$ " + totalDescontos);
            System.out.print("Salário Liquído                : R$ " + salarioLiquido);
        }

        else if(salarioBruto <= 2500){
            double impostoRenda = salarioBruto * 0.1;
            double totalDescontos = inss + impostoRenda;
            double salarioLiquido = salarioBruto - totalDescontos;

            System.out.println("Salário Bruto: " + "( " + valorHora + " * " + horasTrabalhadas + ")"
                    + "  : R$ " + salarioBruto);
            System.out.println("(-)  IR (10%)                   : R$ " + impostoRenda);
            System.out.println("(-)  INSS (10%)                 : R$ " + inss);
            System.out.println("FGTS (11%)                      : R$ " + fgts);
            System.out.println("Total de descontos              : R$ " + totalDescontos);
            System.out.print("Salário Liquído                 : R$ " + salarioLiquido);
        }

        else{
            double impostoRenda = salarioBruto * 0.25;
            double totalDescontos = inss + impostoRenda;
            double salarioLiquido = salarioBruto - totalDescontos;

            System.out.println("Salário Bruto: " + "( " + valorHora + " * " + horasTrabalhadas + ")"
                    + " : R$ " + salarioBruto);
            System.out.println("(-)  IR (20%)                   : R$ " + impostoRenda);
            System.out.println("(-)  INSS (10%)                 : R$ " + inss);
            System.out.println("FGTS (11%)                      : R$ " + fgts);
            System.out.println("Total de descontos              : R$ " + totalDescontos);
            System.out.print("Salário Liquído                 : R$ " + salarioLiquido);
        }
    }
}
