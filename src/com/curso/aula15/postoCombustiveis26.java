package com.curso.aula15;
import java.util.Scanner;


public class postoCombustiveis26 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Tabela de combustível\n Álcool:\n - Até 20 litros, desconto de 3% por litro \n - Acima de 20 litros, desconto de 3% por litro\n");
        System.out.println("Gasolina:\n - Áte 20 litros, desconto de 4% por litro\n - Acima de 20 litros, desconto de 6% por litro\n");

        System.out.println("Voce deseja colocar qual combustível? Álcool ou gasolina?");
        String combustivel = scan.nextLine();

        System.out.println("Quantos litros deseja colocar?");
        int litros = scan.nextInt();

        double valorGasolina = 2.50;
        double valorBrutoGasolina = litros * valorGasolina;

        double valorAlcool = 1.90;
        double valorBrutoAlcool = litros * valorAlcool;

        if (combustivel.equals("A")) {
            if (litros >= 1 && litros <= 20) {
                double desconto = (0.03 * litros) + litros;
                double valorTotal = valorBrutoAlcool - desconto;

                System.out.println("Foram vendidos " + litros + " litros de Álcool no valor de: R$ " + valorTotal);
            }

            else if(litros > 20){
                double desconto = (0.05 * litros) + litros;
                double valorTotal = valorBrutoAlcool - desconto;

                System.out.println("Foram vendidos " + litros + " litros de Álcool no valor de: R$ " + valorTotal);
            }
        }

        else if(combustivel.equals("G")){
            if(litros >= 1 && litros <= 20){
                double desconto = (0.04 * litros) + litros;
                double valorTotal = valorBrutoGasolina - desconto;

                System.out.print("Foram vendidos " + litros + " litros de Gasolina no valor de: R$ " + valorTotal);

            }

            else if(litros > 20){
                double desconto = (0.06 * litros) + litros;
                double valorTotal = valorBrutoGasolina - desconto;

                System.out.print("Foram vendidos " + litros + " litros de Gasolina no valor de: R$ " + valorTotal);
            }
        }


    }
}
