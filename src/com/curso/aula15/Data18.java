package com.curso.aula15;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Data18 {

    public static void main(String[] args){

        Scanner scan= new Scanner(System.in);

        System.out.print("Informe uma data: ");
        String data = scan.nextLine();

        DateTimeFormatter dataAtual = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try{
            LocalDate dataFormato = LocalDate.parse(data, dataAtual);
            System.out.print("Data escolhida: " + dataFormato);
        }

        catch(Exception e){
            System.out.print("Data inválida: " + e.getMessage());
        }
    }
}
