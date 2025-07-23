package com.curso.aula15;
import java.util.Scanner;


public class PrecoProduto8 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Preço do pão: R$ ");
        double precoPao = scan.nextDouble();

        System.out.print("Preço do frango: R$ ");
        double precoFrango = scan.nextDouble();

        System.out.print("Preço do leite: R$ ");
        double precoLeite = scan.nextDouble();

        if(precoPao < precoFrango && precoPao < precoLeite){
            System.out.print("O produto ideal para compra é Pão no valor de R$: " + precoPao);
        }
        else if(precoFrango < precoLeite && precoFrango < precoPao){
            System.out.print("O produto ideal para compra é Frango no valor de R$: " + precoFrango);
        }

        else{
            System.out.print("O produto ideal para compra é Leite no valor de R$: " + precoLeite);
        }
    }
}
