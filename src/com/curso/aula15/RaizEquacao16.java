package com.curso.aula15;
import java.util.Scanner;
import java.lang.*;
import java.lang.Math;

public class RaizEquacao16 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Valor de a: ");
        int a = scan.nextInt();

        if(a == 0){
            System.out.print("");
            System.exit(0);
        }

        System.out.print("Valor de b: ");
        int b = scan.nextInt();

        System.out.print("Valor de c: ");
        int c = scan.nextInt();

        double delta = (b * b) - 4 * a * c;
        System.out.println("Valor delta: " + delta);


        if(delta < 0){
            System.out.print("");
            System.exit(0);
        }

        else if(delta == 0){

            double raizQuadrada = Math.sqrt(delta);
            double x = (-b) + raizQuadrada;
            double x2 = 2 * a;
            double raiz = x / x2;
            System.out.println("Raíz real: " + raiz);
        }

        else{
            double raizQuadrada = Math.sqrt(delta);
            double x = (-b) + raizQuadrada;
            double xNegativo = (-b) - raizQuadrada;
            double divisao = 2 * a;
            double primeiraRaiz = x / divisao;
            double segundaRaiz = xNegativo / divisao;


            System.out.println("Primeira raíz: " + primeiraRaiz);
            System.out.println("Segunda raíz: " + segundaRaiz);
        }
    }
}
