package com.curso.aula15;
import java.util.Scanner;

public class AnoBissexto17 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);


        System.out.print("Informe o ano: ");
        int ano = scan.nextInt();

        int anoBissexto = ano % 4;

        if(anoBissexto == 0){
            System.out.print("Ano bissexto");
        }

        else{
            System.out.print("Não bissexto");
        }
    }
}
