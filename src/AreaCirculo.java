import java.util.Scanner;

public class AreaCirculo {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o raio do circulo: ");
        double raioCirculo = scan.nextDouble();

        double areaCirculo = 3.14 * (raioCirculo * raioCirculo);

        System.out.print("O valor da área é: " + areaCirculo);
    }

}
