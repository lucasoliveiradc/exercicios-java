import java.util.Scanner;

public class Conversao5 {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a metragem: ");
        double metros = scan.nextDouble();

        double conversao = metros * 100;
        System.out.print("Conversão de metros para centimetros: " + conversao);
    }
}
