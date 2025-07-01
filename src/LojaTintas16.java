import java.util.Scanner;

public class LojaTintas16 {


    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a area m²: ");
        double area = scan.nextDouble();

        double tintaLitros = 18;
        double valorTinta = 80;
        double cobertura = (area / 3) / tintaLitros;
        double valorLatas =  valorTinta * Math.ceil(cobertura);

        System.out.println("Quantidades de latas a serem compradas: " + Math.ceil(cobertura));
        System.out.print("Preço total: R$ " + valorLatas );


    }
}
