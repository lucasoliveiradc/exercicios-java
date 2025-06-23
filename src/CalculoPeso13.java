import java.util.Scanner;

public class CalculoPeso13 {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a altura: ");
        double altura = scan.nextDouble();

        System.out.print("Informe o sexo: ");
        char sexo = scan.next().charAt(0);


        System.out.print("Informe o seu peso: ");
        double pesoAtual = scan.nextDouble();

        double pesoHomem = (72.7 * altura) - 58;
        double pesoMulher = (62.1 * altura) - 44.7;

        if(sexo == 'F' && pesoAtual == pesoMulher){
            System.out.print("O peso está ideal");
        }

        else if(sexo == 'F' && pesoAtual > pesoMulher){
            System.out.print("O peso está acima");
        }

        else if (sexo == 'F' && pesoAtual < pesoMulher){
            System.out.print("o peso está abaixo");
        }

        if(sexo == 'M' && pesoAtual == pesoHomem){
            System.out.print("O peso está ideal");
        }

        else if(sexo == 'M' && pesoAtual > pesoHomem){
            System.out.print("O peso está acima");
        }

        else if (sexo == 'M' && pesoAtual < pesoHomem){
            System.out.print("O peso está abaixo");
        }



    }
}
