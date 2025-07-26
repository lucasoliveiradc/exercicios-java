package com.curso.aula15;
import java.util.Scanner;

public class TurnoEstudo10 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Qual turno você estuda: ");
        char turno = scan.next().charAt(0);

        if(turno == 'M'){
            System.out.print("Bom Dia!");
        }

        else if(turno == 'V'){
            System.out.print("Boa Tarde!");
        }

        else if(turno == 'N'){
            System.out.print("Boa Noite!");
        }

        else{
            System.out.print("Valor Inválido!");
        }
    }
}
