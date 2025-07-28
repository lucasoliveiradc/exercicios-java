package com.curso.aula15;
import java.util.Scanner;

public class DiaDaSemana13 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número que informe o dia da semana: ");
        int dia = scan.nextInt();

        switch (dia){

            case 1:
                System.out.print("Domingo");
                break;

            case 2:
                System.out.print("Segunda");
                break;

            case 3:
                System.out.print("Terça");
                break;

            case 4:
                System.out.print("Quarta");
                break;

            case 5:
                System.out.print("Quinta");
                break;

            case 6:
                System.out.print("Sexta");
                break;

            case 7:
                System.out.print("Sábado");
                break;

            default:
                System.out.print("Valor inválido");
        }
    }
}
