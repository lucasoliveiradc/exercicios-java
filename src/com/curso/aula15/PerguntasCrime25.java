package com.curso.aula15;
import java.util.Scanner;


public class PerguntasCrime25 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Telefonou para a vítima? ");
        String primeiraPergunta = scan.next();

        System.out.println("Esteve no local do crime? ");
        String segundaPergunta = scan.next();

        System.out.println("Mora perto da vítima?  ");
        String terceiraPergunta = scan.next();

        System.out.println("Devia para a vítima? ");
        String quartaPergunta = scan.next();

        System.out.println("Já trabalhou para a vítima? ");
        String quintaPergunta = scan.next();

        String[] perguntas = {primeiraPergunta, segundaPergunta, terceiraPergunta, quartaPergunta, quintaPergunta};
        String condenacao = "Sim";
        int quantidadePunicao = 0;

        for (String suspeitos : perguntas) {

                if(suspeitos.equals(condenacao)){
                    quantidadePunicao++;
                }
        }

        if(quantidadePunicao == 2){
            System.out.print("Suspeito");
        }

        else if(quantidadePunicao >= 3 && quantidadePunicao <= 4){
            System.out.print("Cúmplice");
        }

        else if(quantidadePunicao == 5){
            System.out.print("Assasino");
        }

        else{
            System.out.print("Inocente");
        }
    }
}
