package com.curso.aula15;
import java.util.Scanner;

public class Fruteira27 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Tabelas de frutas - Até 5 Kg\n - Morango R$ 2,50 por Kg\n - Maçã R$ 1,80 por Kg\n");

        System.out.println("Tabelas de frutas - Acima 5 Kg\n - Morango R$ 2,20 por Kg\n - Maçã R$ 1,50 por Kg\n");


        System.out.println("Quantos Kg deseja comprar de morango? ");
        int kgMorango = scan.nextInt();

        System.out.println("Quantos Kg deseja comprar de maçã?");
        int kgMaca = scan.nextInt();

        int valorTotalKilo = kgMorango + kgMaca;

        if(kgMorango >= 1 && kgMorango <= 5 && kgMaca >= 1 && kgMaca <= 5){
            double precoMorango = 2.50 * kgMorango;
            double precoMaca = 1.80 * kgMaca;
            double precoFrutas = precoMaca + precoMorango;

            if(valorTotalKilo > 8 || precoFrutas > 25){
                precoFrutas =  precoFrutas - (precoFrutas * 0.1);

                System.out.print("Foi comprado " + kgMorango + " kg de morango e " + kgMaca + " kg de maçã, no total ficou: R$ " + precoFrutas);
            }

            else{
                System.out.print("Foi comprado " + kgMorango + " kg de morango e " + kgMaca + " kg de maçã, no total ficou: R$ " + precoFrutas);
            }
        }

        else{
            double precoMorango = 2.20 * kgMorango;
            double precoMaca = 1.50 * kgMaca;
            double precoFrutas = precoMaca + precoMorango;

            if(valorTotalKilo > 8 || precoFrutas > 25){
                precoFrutas = precoFrutas - (precoFrutas * 0.1) ;

                System.out.print("Foi comprado " + kgMorango + " kg de morango e " + kgMaca + " kg de maçã, no total ficou: R$ " + precoFrutas);
            }

            else{
                System.out.print("Foi comprado " + kgMorango + " kg de morango e " + kgMaca + " kg de maçã, no total ficou: R$ " + precoFrutas);
            }

        }
    }
}
