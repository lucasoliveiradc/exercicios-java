package com.curso.aula15;
import java.util.Scanner;


public class MaiorNumero6 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double number = scan.nextDouble();

        System.out.print("Digite o segundo número: ");
        double segundoNumero = scan.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double terceiroNumero = scan.nextDouble();

        if(number > segundoNumero && number > terceiroNumero){
            System.out.print(number);
        }

        else if(segundoNumero > number && segundoNumero > terceiroNumero){
            System.out.print(segundoNumero);
        }

        else {
            System.out.print(terceiroNumero);
        }
    }
}
