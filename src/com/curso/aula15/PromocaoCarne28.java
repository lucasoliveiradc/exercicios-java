package com.curso.aula15;
import java.util.Scanner;


public class PromocaoCarne28 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Promoção de Carnes: \nAté 5 Kg\n - Filé Duplo R$ 4.90 por Kg");
        System.out.println(" - Alcatra R$ 5.90 por Kg");
        System.out.println(" - Picanha R$ 6.90 por Kg\n");
        System.out.println("Acima de 5 kg\n - File Duplo R$ 5.80 por Kg");
        System.out.println(" - Alcatra R$ 5.90 por Kg");
        System.out.println(" - Picanha R$ 6.90 por Kg\n");


        System.out.println("Deseja qual tipo de carne?");
        String carne = scan.nextLine();

        System.out.println("Qual sera a forma de pagamento?");
        String pagamento = scan.nextLine();
        String cartao = "Cartao Tabajara";

        System.out.println("Quantos kilos deseja levar?");
        double kilos = scan.nextDouble();


        if (carne.equals("File Duplo") && pagamento.equals(cartao)) {
            if (kilos >= 1 && kilos <= 5) {
                double valorFile = 4.90 * kilos;
                double descontoFile = valorFile * 0.05;
                double valorTotal = valorFile - (valorFile * 0.05);

                System.out.print(" - Nota Fiscal:\n" + " - " + carne + " - " + kilos + " kg" + "\n - Valor: R$ " + valorFile + "\n - Forma de pagamento: " + pagamento + "\n - Desconto: R$ " + descontoFile + "\n - Valor Total: R$ " + valorTotal);

            } else if (kilos > 5) {
                double valorFile = 5.80 * kilos;
                double descontoFile = valorFile * 0.05;
                double valorTotal = valorFile - (valorFile * 0.05);

                System.out.print(" - Nota Fiscal:\n" + " - " + carne + " - " + kilos + " kg" + "\n - Valor: R$ " + valorFile + "\n - Forma de pagamento: " + pagamento + "\n - Desconto: R$ " + descontoFile + "\n - Valor Total: R$ " + valorTotal);
            }
        }

        else if(carne.equals("File Duplo")){
            if (kilos >= 1 && kilos <= 5) {
                double valorFile = 4.90 * kilos;

                System.out.print(" - Nota Fiscal:\n" + " - " + carne + " - " + kilos + " kg" + "\n - Valor: R$ " + valorFile + "\n - Forma de pagamento: " + pagamento + "\n - Valor Total: R$ " + valorFile);

            }

            else if (kilos > 5) {
                double valorFile = 5.80 * kilos;

                System.out.print(" - Nota Fiscal:\n" + " - " + carne + " - " + kilos + " kg" + "\n - Valor: R$ " + valorFile + "\n - Forma de pagamento: " + pagamento  + "\n - Valor Total: R$ " + valorFile);
            }

        }

        else if (carne.equals("Alcatra") && pagamento.equals(cartao)) {
            if (kilos >= 1 && kilos <= 5) {
                double valorAlcatra = 5.90 * kilos;
                double descontoAlcatra = valorAlcatra * 0.05;
                double valorTotal = valorAlcatra - (valorAlcatra * 0.05);

                System.out.print(" - Nota Fiscal:\n" + " - " + carne + " - " + kilos + " kg" + "\n - Valor: R$ " + valorAlcatra + "\n - Forma de pagamento: " + pagamento + "\n - Desconto: R$ " + descontoAlcatra + "\n - Valor Total: R$ " + valorTotal);

            }

            else if (kilos > 5) {
                double valorAlcatra = 6.80 * kilos;
                double descontoAlcatra = valorAlcatra * 0.05;
                double valorTotal = valorAlcatra - (valorAlcatra * 0.05);

                System.out.print(" - Nota Fiscal:\n" + " - " + carne + " - " + kilos + " kg" + "\n - Valor: R$ " + valorAlcatra + "\n - Forma de pagamento: " + pagamento + "\n - Desconto: R$ " + descontoAlcatra + "\n - Valor Total: R$ " + valorTotal);
            }
        }

        else if(carne.equals("Alcatra")){
            if (kilos >= 1 && kilos <= 5) {
                double valorAlcatra = 5.90 * kilos;

                System.out.print(" - Nota Fiscal:\n" + " - " + carne + " - " + kilos + " kg" + "\n - Valor: R$ " + valorAlcatra + "\n - Forma de pagamento: " + pagamento + "\n - Valor Total: R$ " + valorAlcatra);

            } else if (kilos > 5) {
                double valorAlcatra = 6.80 * kilos;

                System.out.print(" - Nota Fiscal:\n" + " - " + carne + " - " + kilos + " kg" + "\n - Valor: R$ " + valorAlcatra + "\n - Forma de pagamento: " + pagamento + "\n - Valor Total: R$ " + valorAlcatra);
            }

        }

        else if (carne.equals("Picanha") && pagamento.equals(cartao)) {
            if (kilos >= 1 && kilos <= 5) {
                double valorPicanha = 6.90 * kilos;
                double descontoPicanha = valorPicanha * 0.05;
                double valorTotal = valorPicanha - (valorPicanha * 0.05);

                System.out.print(" - Nota Fiscal:\n" + " - " + carne + " - " + kilos + " kg" + "\n - Valor: R$ " + valorPicanha + "\n - Forma de pagamento: " + pagamento + "\n - Desconto: R$ " + descontoPicanha + "\n - Valor Total: R$ " + valorTotal);

            } else if (kilos > 5) {
                double valorPicanha = 7.80 * kilos;
                double descontoPicanha = valorPicanha * 0.05;
                double valorTotal = valorPicanha - (valorPicanha * 0.05);

                System.out.print(" - Nota Fiscal:\n" + " - " + carne + " - " + kilos + " kg" + "\n - Valor: R$ " + valorPicanha + "\n - Forma de pagamento: " + pagamento + "\n - Desconto: R$ " + descontoPicanha + "\n - Valor Total: R$ " + valorTotal);
            }
        }

        else if(carne.equals("Picanha")){
            if (kilos >= 1 && kilos <= 5) {
                double valorPicanha = 6.90 * kilos;;

                System.out.print(" - Nota Fiscal:\n" + " - " + carne + " - " + kilos + " kg" + "\n - Valor: R$ " + valorPicanha + "\n - Forma de pagamento: " + pagamento + "\n - Valor Total: R$ " + valorPicanha);

            } else if (kilos > 5) {
                double valorPicanha = 7.80 * kilos;;

                System.out.print(" - Nota Fiscal:\n" + " - " + carne + " - " + kilos + " kg" + "\n - Valor: R$ " + valorPicanha + "\n - Forma de pagamento: " + pagamento + "\n - Valor Total: R$ " + valorPicanha);
            }

        }

    }
}






