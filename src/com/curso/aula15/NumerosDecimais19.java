package com.curso.aula15;
import java.util.Scanner;

public class NumerosDecimais19 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scan.nextInt();

        int centena = numero / 100;
        int dezena = (numero % 100) / 10;
        int unidade = numero % 10;

        if(numero >= 100 && numero <= 999 && centena > 1 && dezena > 1 && unidade > 1){


                System.out.print(centena + " centenas, " + dezena + " dezenas e " + unidade + " unidades");

        }

        else if(numero >= 100 && numero <= 999 && centena == 1 && dezena > 1 && unidade > 1){


            System.out.print(centena + " centena, " + dezena + " dezenas e " + unidade + " unidades");

        }

        else if(numero >= 100 && numero <= 999 && centena == 1 && dezena == 1 && unidade > 1){


            System.out.print(centena + " centena, " + dezena + " dezena e " + unidade + " unidades");

        }

        else if(numero >= 100 && numero <= 999 && centena == 1 && dezena == 1 && unidade == 1){


            System.out.print(centena + " centena, " + dezena + " dezena e " + unidade + " unidade");

        }

        else if(numero >= 100 && numero <= 999 && centena == 1 && dezena > 1 && unidade == 1){


            System.out.print(centena + " centena, " + dezena + " dezenas e " + unidade + " unidade");

        }

        else if(numero >= 100 && numero <= 999 && centena > 1 && dezena > 1 && unidade == 1){


            System.out.print(centena + " centenas, " + dezena + " dezenas e " + unidade + " unidade");

        }

        else if(numero >= 100 && numero <= 999 && centena > 1 && dezena == 1 && unidade > 1){


            System.out.print(centena + " centenas, " + dezena + " dezena e " + unidade + " unidades");

        }

        else if(numero >= 100 && numero <= 999 && centena > 1 && dezena == 0  && unidade == 0){

            System.out.print(centena + " centenas");

        }

        else if(numero >= 100 && numero <= 999 && centena == 1 && dezena == 0  && unidade == 0){

            System.out.print(centena + " centena");

        }

        else if(numero >= 100 && numero <= 999 && centena > 1 && dezena == 0  && unidade > 1){

            System.out.print(centena + " centenas e " + unidade + " unidades");

        }

        else if(numero >= 100 && numero <= 999 && centena > 1 && dezena == 0  && unidade == 1){

            System.out.print(centena + " centenas e " + unidade + " unidade");

        }

        else if(numero >= 100 && numero <= 999 && centena == 1 && dezena == 0  && unidade == 1){

            System.out.print(centena + " centena e " + unidade + " unidade");

        }

        else if(numero >= 100 && numero <= 999 && centena > 1 && dezena > 1  && unidade == 0){

            System.out.print(centena + " centenas e " + dezena + " dezenas");

        }

        else if(numero >= 100 && numero <= 999 && centena > 1 && dezena == 1  && unidade == 0){

            System.out.print(centena + " centenas e " + dezena + " dezena");

        }

        else if(numero >= 100 && numero <= 999 && centena == 1 && dezena == 1  && unidade == 0){

            System.out.print(centena + " centena e " + dezena + " dezena");

        }

        else if(numero >= 100 && numero <= 999 && centena > 1 && dezena == 1  && unidade == 1){

            System.out.print(centena + " centenas, " + dezena + " dezena e " + unidade + " unidade");

        }


        else if(numero >= 10 && numero <= 99  && dezena > 1 && unidade > 1){

                System.out.print(dezena + " dezenas e " + unidade + " unidades");


        }

        else if(numero >= 10 && numero <= 99 && dezena > 1 && unidade == 1){


            System.out.print(dezena + " dezenas e " + unidade + " unidade");

        }

        else if(numero >= 10 && numero <= 99 && dezena > 1 && unidade == 0){


            System.out.print(dezena + " dezenas");

        }

        else if(numero >= 10 && numero <= 99 && dezena == 1 && unidade == 1){


            System.out.print(dezena + " dezena e " + unidade + " unidade");

        }

        else if(numero >= 10 && numero <= 99 && dezena == 1 && unidade > 1){


            System.out.print(dezena + " dezena e " + unidade + " unidades");

        }

        else if(numero >= 10 && numero <= 99 && dezena == 1 && unidade == 0){


            System.out.print(dezena + " dezena");

        }



        else if(numero > 1 && numero <= 9) {
                System.out.print(unidade + " unidades");
        }

        else {
            System.out.print(unidade + " unidade");
        }
    }
}
