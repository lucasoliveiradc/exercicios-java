import java.util.Scanner;

public class AreaQuadrado7 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um lado do quadrado: ");
        double ladoQuadrado = scan.nextDouble();

        double areaQuadrado = ladoQuadrado * ladoQuadrado;
        System.out.print("O dobro da area do quadrado é: " + areaQuadrado * 2);
    }
}
