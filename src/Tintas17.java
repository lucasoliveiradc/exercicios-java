import java.util.Scanner;

public class Tintas17 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a área em m²: ");
        double areaMetros = scan.nextDouble();

        double valorLata = 80;
        double lata = 18;

        double galoes = 3.6;
        double valorGalao = 25;

        double coberturaTintas = (areaMetros / 6) / lata;
        double precoCoberturaLata = valorLata * Math.ceil(coberturaTintas);

        double coberturaGalao = (areaMetros / 6) / galoes;
        double precoCoberturaGalao = valorGalao * Math.ceil(coberturaGalao);

        double misturaLataGalao = ((coberturaGalao / 2) + (coberturaTintas / 2)) / 2;
        double precoMistura = valorLata - valorGalao;
        double desconto = precoMistura * 0.10;




        System.out.println("Quantidades de latas: " + Math.ceil(coberturaTintas));
        System.out.println("Preço cobertura latas: R$ " + precoCoberturaLata);

        System.out.println("Quantidade de galoes: " + Math.ceil(coberturaGalao));
        System.out.println("Preço cobertura galões: R$ " + Math.ceil(precoCoberturaGalao));

        System.out.println("Quantidade mistura galao : " + Math.ceil(misturaLataGalao));
        System.out.println("Preço mistura: R$ " + Math.ceil(precoMistura + desconto));
    }
}
