package com.curso.aula15;
import java.util.Scanner;


public class NumeroInteiro22 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int numero = scan.nextInt();

        if(numero % 2 == 0){
            System.out.print("Par");
        }

        else{
            System.out.print("Ímpar");
        }
    }
}
