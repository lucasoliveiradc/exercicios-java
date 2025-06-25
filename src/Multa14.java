import java.util.Scanner;

public class Multa14 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Peso do peixe: ");
        double pesoPeixe = scan.nextDouble();

        if(pesoPeixe >= 51){
            double excesso = pesoPeixe - 50;
            double multa = excesso * 4;
            System.out.print("Valor da multa: R$ " + multa);
        }

        else{
            double excesso = 0;
            double multa = 0;
            System.out.print(multa);
        }
    }
}
