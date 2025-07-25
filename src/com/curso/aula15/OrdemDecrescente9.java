package com.curso.aula15;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class OrdemDecrescente9 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        double fN = scan.nextDouble();

        System.out.print("Segundo número: ");
        double sN = scan.nextDouble();

        System.out.print("Terceiro número: ");
        double tN = scan.nextDouble();

        ArrayList<Double> od = new ArrayList<Double>();

        od.add(fN);
        od.add(sN);
        od.add(tN);

        Collections.sort(od, Collections.reverseOrder());
        System.out.print(od);
    }
}
