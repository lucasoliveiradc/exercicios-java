import java.util.Scanner;

public class MediaNota {

    public static void main (String[] args){

        Scanner scan = new Scanner (System.in);

        System.out.print("Informe a primeira nota: ");
        double primeiraNota = scan.nextDouble();

        System.out.print("Informe a segunda nota: ");
        double segundaNota = scan.nextDouble();

        System.out.print("Informe a terceira nota: ");
        double terceiraNota = scan.nextDouble();

        System.out.print("Informe a quarta nota: ");
        double quartaNota = scan.nextDouble();

        double mediaNotas = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;

        System.out.print("A média das notas foi: " + mediaNotas);
    }
}
