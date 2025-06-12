import java.util.Scanner;

public class SalarioMes {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Valor hora trabalhadas: ");
        double valorHora = scan.nextDouble();

        System.out.print("Horas trabalhadas: ");
        double horasTrabalhadas = scan.nextDouble();

        double salarioMes = valorHora * horasTrabalhadas;
        System.out.print("Salário do mês: " + salarioMes);
    }
}
