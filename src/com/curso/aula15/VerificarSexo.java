package com.curso.aula15;
import java.util.Scanner;

public class VerificarSexo {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o seu sexo: ");
        char sexo = scan.next().charAt(0);

        if(sexo == 'F' || sexo == 'f'){
            System.out.print("Feminino");
        }

        else if(sexo == 'M' || sexo == 'm'){
            System.out.print("Masculino");
        }

        else{
            System.out.print("Sexo Inválido");
        }
    }
}
