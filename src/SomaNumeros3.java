import java.util.Scanner;


public class SomaNumeros3 {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int firstNumber = scan.nextInt();


        System.out.print("Digite o segundo numero: ");
        int secondNumber = scan.nextInt();

        int sumNumber = firstNumber + secondNumber;
        System.out.println("Soma total: " + sumNumber);
    }
}
