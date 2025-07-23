package com.curso.aula15;
import java.util.Scanner;

public class MaiorMenor7 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        double firstNumber = scan.nextDouble();

        System.out.print("Informe o segundo número: ");
        double secondNumber = scan.nextDouble();

        System.out.print("Informe o terceiro número: ");
        double thirdNumber = scan.nextDouble();

        if(firstNumber > secondNumber && secondNumber > thirdNumber){
            System.out.println(firstNumber);
            System.out.print(thirdNumber);
        }

        else if(secondNumber > firstNumber && thirdNumber > secondNumber){
            System.out.println(thirdNumber);
            System.out.print(firstNumber);
        }

        else if(secondNumber > thirdNumber && firstNumber > thirdNumber){
            System.out.println(secondNumber);
            System.out.print(thirdNumber);
        }

        else if(thirdNumber > firstNumber && firstNumber > secondNumber){
            System.out.println(thirdNumber);
            System.out.print(secondNumber);
        }

        else if(firstNumber > thirdNumber && thirdNumber > secondNumber){
            System.out.println(firstNumber);
            System.out.print(secondNumber);
        }

        else{
            System.out.println(secondNumber);
            System.out.print(firstNumber);
        }
    }
}
