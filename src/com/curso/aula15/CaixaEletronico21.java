package com.curso.aula15;
import java.util.Scanner;


public class CaixaEletronico21 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Valor do Saque: ");
        int valorSaque = scan.nextInt();

        int notaCem = valorSaque / 100;
        int notaCinquenta = (valorSaque % 100) / 50;
        int notaDez = (valorSaque % 50) / 10;
        int notaCinco = (valorSaque % 10 )/ 5;
        int notaUm = valorSaque % 5;
        int[] notasSaque = {notaCem, notaCinquenta, notaDez, notaCinco, notaUm};

        System.out.println("Quantidade de notas 100/50/10/5/1 - Nesta Ordem: ");

        if(valorSaque >= 100 && valorSaque <= 600){

            for(int notas : notasSaque){
                if(notas > 0){

                    System.out.println(notas);

                }
            }

        }

        else if(valorSaque >= 10 && valorSaque <= 99){

            for(int notas : notasSaque){
                if(notas > 0){

                    System.out.println(notas);

                }
            }

        }

    }
}
