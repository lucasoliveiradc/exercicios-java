import java.util.Scanner;

public class DownloadArquivo18 {

    public static void main (String[] args){

        Scanner scan = new Scanner (System.in);

        System.out.println("Tamanho do arquivo: ");
        double tamanho = scan.nextDouble();

        System.out.println("Velocidade da internet: ");
        double velocidadeInternet = scan.nextDouble();

        double conversaoInternet = velocidadeInternet / 8;
        double tempoDownload = tamanho / conversaoInternet;

        int minutos = (int) tempoDownload / 60;
        int segundos = (int) tempoDownload % 60;

        if(minutos > 1){
            System.out.print("O download termina em: " + minutos + " minutos "  + "e "  + segundos + " segundos");
        }

        else if(minutos == 1){
            System.out.print("O download termina em: " + minutos + " minuto " + "e "  + segundos +  " segundos");
        }

        else{
            System.out.print("O download termina em: " + segundos + " segundos");
        }

    }
}
