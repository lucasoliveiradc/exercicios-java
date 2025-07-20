package com.curso.aula15;
import java.util.Scanner;


public class VogalConsoante4 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = scan.next().charAt(0);

        switch(letra){

            case 'A':
                System.out.print("Vogal");
                break;

            case 'E':
                System.out.print("Vogal");
                break;

            case 'I':
                System.out.print("Vogal");
                break;

            case 'O':
                System.out.print("Vogal");
                break;

            case 'U':
                System.out.print("Vogal");
                break;

            case 'a':
                System.out.print("Vogal");
                break;

            case 'e':
                System.out.print("Vogal");
                break;

            case 'i':
                System.out.print("Vogal");
                break;

            case 'o':
                System.out.print("Vogal");
                break;

            case 'u':
                System.out.print("Vogal");
                break;

            default:
                System.out.print("Consoante");
        }
        //System.out.print(number);
    }
}
