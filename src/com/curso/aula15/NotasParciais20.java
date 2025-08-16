package com.curso.aula15;
import java.util.Scanner;

public class NotasParciais20 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Primeira nota: ");
        double primeiraNota = scan.nextDouble();

        System.out.print("Segunda nota: ");
        double segundaNota = scan.nextDouble();

        System.out.print("Terceira nota: ");
        double terceiraNota = scan.nextDouble();

        double media = (primeiraNota + segundaNota + terceiraNota) / 3;

        if(media == 10){
            System.out.print("Aprovado com Distinção");
        }

        else if(media >= 7){
            System.out.print("Aprovado");
        }

        else{
            System.out.print("Reprovado");
        }
    }
}
