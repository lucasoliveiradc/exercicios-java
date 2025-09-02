package com.curso.aula15;
import java.util.Scanner;


public class Operacao24 {


    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double primeiroNumero = scan.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double segundoNumero = scan.nextDouble();

        System.out.print("Qual operação deseja realizar: ");
        char operacao = scan.next().charAt(0);

        double resultado;

        if(operacao == '-'){
            resultado = primeiroNumero  - segundoNumero;

            if(resultado % 2 == 0 && resultado > 0 && resultado == Math.ceil(resultado)){
                System.out.print("Resultado: " + resultado + "\n" + "O número é par, positivo e inteiro");
            }

            else if(resultado % 2 == 0 && resultado < 0 && resultado == Math.ceil(resultado)){
                System.out.print("Resultado: " + resultado + "\n" + "O número é par, negativo e inteiro");
            }

            else if(resultado > 0 && resultado != Math.ceil(resultado)){
                System.out.print("Resultado: " + resultado + "\n" + "O número é positivo e decimal");
            }

            else if(resultado < 0 && resultado != Math.ceil(resultado)){
                System.out.print("Resultado: " + resultado + "\n" + "O número é negativo e decimal");
            }

            else if(resultado % 2 > 0 && resultado > 0 && resultado == Math.ceil(resultado)){
                System.out.print("Resultado: " + resultado + "\n" + "O número é ímpar, positivo e inteiro");
            }

            else if(resultado % 2 < 0 && resultado < 0 && resultado == Math.ceil(resultado)){
                System.out.print("Resultado: " + resultado + "\n" + "O número é ímpar, negativo e inteiro");
            }



        }

        else if(operacao == '+'){
            resultado = primeiroNumero + segundoNumero;

            if(resultado % 2 == 0 && resultado > 0 && resultado == Math.ceil(resultado)){
                System.out.print("Resultado: " + resultado + "\n" + "O número é par, positivo e inteiro");
            }

            else if(resultado % 2 == 0 && resultado < 0 && resultado == Math.ceil(resultado)){
                System.out.print("Resultado: " + resultado + "\n" + "O número é par, negativo e inteiro");
            }

            else if(resultado > 0 && resultado != Math.ceil(resultado)){
                System.out.print("Resultado: " + resultado + "\n" + "O número é positivo e decimal");
            }

            else if(resultado < 0 && resultado != Math.ceil(resultado)){
                System.out.print("Resultado: " + resultado + "\n" + "O número é negativo e decimal");
            }

            else if(resultado % 2 > 0 && resultado > 0 && resultado == Math.ceil(resultado)){
                System.out.print("Resultado: " + resultado + "\n" + "O número é ímpar, positivo e inteiro");
            }

            else if(resultado % 2 < 0 && resultado < 0 && resultado == Math.ceil(resultado)){
                System.out.print("Resultado: " + resultado + "\n" + "O número é ímpar, negativo e inteiro");
            }
        }

        else if(operacao == '/'){
            resultado = primeiroNumero / segundoNumero;

            if(resultado % 2 == 0 && resultado > 0 && resultado == Math.ceil(resultado)){
                System.out.print("Resultado: " + resultado + "\n" + "O número é par, positivo e inteiro");
            }

            else if(resultado % 2 == 0 && resultado < 0 && resultado == Math.ceil(resultado)){
                System.out.print("Resultado: " + resultado + "\n" + "O número é par, negativo e inteiro");
            }

            else if(resultado > 0 && resultado != Math.ceil(resultado)){
                System.out.print("Resultado: " + resultado + "\n" + "O número é positivo e decimal");
            }

            else if(resultado < 0 && resultado != Math.ceil(resultado)){
                System.out.print("Resultado: " + resultado + "\n" + "O número é negativo e decimal");
            }

            else if(resultado % 2 > 0 && resultado > 0 && resultado == Math.ceil(resultado)){
                System.out.print("Resultado: " + resultado + "\n" + "O número é ímpar, positivo e inteiro");
            }

            else if(resultado % 2 < 0 && resultado < 0 && resultado == Math.ceil(resultado)){
                System.out.print("Resultado: " + resultado + "\n" + "O número é ímpar, negativo e inteiro");
            }
        }

        else if(operacao == '*'){
            resultado = primeiroNumero * segundoNumero;

            if(resultado % 2 == 0 && resultado > 0 && resultado == Math.ceil(resultado)){
                System.out.print("Resultado: " + resultado + "\n" + "O número é par, positivo e inteiro");
            }

            else if(resultado % 2 == 0 && resultado < 0 && resultado == Math.ceil(resultado)){
                System.out.print("Resultado: " + resultado + "\n" + "O número é par, negativo e inteiro");
            }

            else if(resultado > 0 && resultado != Math.ceil(resultado)){
                System.out.print("Resultado: " + resultado + "\n" + "O número é positivo e decimal");
            }

            else if(resultado < 0 && resultado != Math.ceil(resultado)){
                System.out.print("Resultado: " + resultado + "\n" + "O número é negativo e decimal");
            }

            else if(resultado % 2 > 0 && resultado > 0 && resultado == Math.ceil(resultado)){
                System.out.print("Resultado: " + resultado + "\n" + "O número é ímpar, positivo e inteiro");
            }

            else if(resultado % 2 < 0 && resultado < 0 && resultado == Math.ceil(resultado)){
                System.out.print("Resultado: " + resultado + "\n" + "O número é ímpar, negativo e inteiro");
            }
        }
    }
}
