import java.util.Scanner;

public class FarenheitGraus9 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Temperatura em Farenheit: ");
        double grausFarenheit = scan.nextDouble();

        double conversaoTemperatura = (grausFarenheit - 32) * (5/9);

        System.out.print("Temperatura em Celsius: " + conversaoTemperatura);
    }
}
