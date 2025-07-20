package com.curso.aula15;
import java.util.Scanner;

public class NotaAluno5 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Primeira nota: ");
        double primeiraNota = scan.nextDouble();

        System.out.print("Segunda nota: ");
        double segundaNota = scan.nextDouble();

        double mediaNota = (primeiraNota + segundaNota) / 2;

        if(mediaNota == 10 ){
            System.out.print("Aprovado com Distinção");
        }

        else if(mediaNota >= 7){
            System.out.print("Aprovado");
        }

        else{
            System.out.print("Reprovado");
        }
    }
}
