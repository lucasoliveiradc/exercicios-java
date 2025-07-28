package com.curso.aula15;
import java.util.Scanner;


public class MediaSemestre14 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Primeira Nota: ");
        double primeiraNota = scan.nextDouble();

        System.out.print("Segunda Nota: ");
        double segundaNota = scan.nextDouble();

        double media = (primeiraNota + segundaNota) / 2;

        if(media >= 9 && media <= 10){

            char conceito = 'A';
            System.out.println("Média de Aproveitamento: " + media);
            System.out.println("Conceito: " + conceito);
            System.out.println("APROVADO");
        }

        else if(media >= 7.5 && media <= 9){

            char conceito = 'B';
            System.out.println("Média de Aproveitamento: " + media);
            System.out.println("Conceito: " + conceito);
            System.out.println("APROVADO");
        }

        else if(media >= 6 && media <= 7.5){

            char conceito = 'C';
            System.out.println("Média de Aproveitamento: " + media);
            System.out.println("Conceito: " + conceito);
            System.out.println("APROVADO");
        }

        else if(media >= 4 && media <= 6){

            char conceito = 'D';
            System.out.println("Média de Aproveitamento: " + media);
            System.out.println("Conceito: " + conceito);
            System.out.println("REPROVADO");
        }

        else{

            char conceito = 'E';
            System.out.println("Média de Aproveitamento: " + media);
            System.out.println("Conceito: " + conceito);
            System.out.println("REPROVADO");
        }
    }
}
