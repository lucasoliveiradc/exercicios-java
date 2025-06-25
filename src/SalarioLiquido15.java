import java.util.Scanner;

public class SalarioLiquido15 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Valor hora: ");
        double valorHora = scan.nextDouble();

        System.out.print("Horas trabalhas no mês: ");
        double horaMes = scan.nextDouble();

        double salarioBruto = valorHora * horaMes;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double impostoRenda = salarioBruto * 0.11;
        double descontos = inss + sindicato + impostoRenda;
        double salarioLiquido = salarioBruto - descontos;

        System.out.println("Salario Bruto: " + salarioBruto);
        System.out.println("Descontos : R$" + descontos);
        System.out.print("Salario Líquido: " + salarioLiquido);

    }
}
