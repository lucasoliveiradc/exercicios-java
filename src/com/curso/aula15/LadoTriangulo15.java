package com.curso.aula15;
import java.util.Scanner;

public class LadoTriangulo15 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor do primeiro lado do triangulo: ");
        double primeiroLado = scan.nextDouble();

        System.out.print("Informe o valor do segundo do lado do triangulo: ");
        double segundoLado = scan.nextDouble();

        System.out.print("Informe o valor do terceiro lado do triangulo: ");
        double terceiroLado = scan.nextDouble();

        if(primeiroLado == segundoLado && segundoLado == terceiroLado){
            System.out.print("Triângulo Equilátero");
        }

        else if(primeiroLado != segundoLado && segundoLado != terceiroLado){
            System.out.print("Triângulo Escaleno");
        }

        else{
            System.out.print("Triângulo Isósceles");
        }
    }
}
