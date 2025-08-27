package com.curso.aula15;
import java.util.Scanner;


public class InteiroDecimal23 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scan.nextDouble();

        if(numero == Math.ceil(numero)){

            System.out.print("Número inteiro");
        }

        else{
            System.out.print("Número decimal");
        }
    }
}
