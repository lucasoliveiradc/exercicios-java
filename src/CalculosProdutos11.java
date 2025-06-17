import java.util.Scanner;

public class CalculosProdutos11 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o primeiro numero inteiro: ");
        int primeiroNumero = scan.nextInt();

        System.out.print("Informe o segundo numero inteiro: ");
        int segundoNumero = scan.nextInt();

        System.out.print("Informe o numero real: ");
        double numeroReal = scan.nextDouble();

        int calculoUm = (primeiroNumero * 2) * (segundoNumero / 2);
        double calculoDois = (segundoNumero * 3) + numeroReal;
        double calculoTres = numeroReal * numeroReal * numeroReal;

        System.out.println("Primeiro calculo: " + calculoUm);
        System.out.println("Segundo calculo: " + calculoDois);
        System.out.println("Terceiro calculo: " + calculoTres);
    }
}
