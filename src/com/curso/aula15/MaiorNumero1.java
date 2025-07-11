package com.curso.aula15;
import java.util.Scanner;


public class MaiorNumero1 {

        public static void main(String[] args){

            Scanner scan = new Scanner(System.in);

            System.out.print("Insira o primeiro numero: ");
            int firsNumber = scan.nextInt();

            System.out.print("Insira o segundo numero: ");
            int secondNumber = scan.nextInt();

            if(firsNumber > secondNumber){
                System.out.println(firsNumber);
            }

            else {
                System.out.println(secondNumber);
            }
        }
}
