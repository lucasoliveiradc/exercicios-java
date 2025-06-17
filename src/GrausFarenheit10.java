import java.util.Scanner;

public class GrausFarenheit10 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a temperatura em Celsius: ");
        double celsius = scan.nextDouble();

        double conversorTemperatura = (celsius * 1.8) + 32;

        System.out.print("A temperatura em Farenheit é: " + conversorTemperatura);


    }
}
