package com.curso.aula15;
import java.util.Scanner;

public class PositivoNegativo2 {

        public static void main(String[] args){

            Scanner scan = new Scanner(System.in);

            System.out.print("Digite um numero: ");
            int valor = scan.nextInt();

            if(valor >= 0){
                System.out.print("Positivo");
            }

            else{
                System.out.print("Negativo");
            }
        }

}
