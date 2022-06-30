import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] comeco = sc.nextLine().split(" ");
        String[] tempoInicial = sc.nextLine().replace(" ","").split(":");
        String[] fim = sc.nextLine().split(" ");
        String[] tempoFinal = sc.nextLine().replace(" ","").split(":");

        int diaInicial = Integer.parseInt(comeco[1]);
        int horaInicial = Integer.parseInt(tempoInicial[0]);
        int minutoInicial = Integer.parseInt(tempoInicial[1]);
        int segundoInicial = Integer.parseInt(tempoInicial[2]);

        int diaFinal = Integer.parseInt(fim[1]);
        int horaFinal = Integer.parseInt(tempoFinal[0]);
        int minutoFinal = Integer.parseInt(tempoFinal[1]);
        int segundoFinal = Integer.parseInt(tempoFinal[2]);

        int totalInicial = diaInicial*24*60*60+horaInicial*60*60+minutoInicial*60+segundoInicial;
        int totalFinal = diaFinal*24*60*60+horaFinal*60*60+minutoFinal*60+segundoFinal;

        int total = totalFinal-totalInicial;

        int dia = total/(24*60*60);
        total=total%(24*60*60);
        int hora = total/(60*60);
        total=total%(60*60);
        int minuto = total/60;
        int segundo = total%60;

        System.out.println(dia + " dia(s)");
        System.out.println(hora + " hora(s)");
        System.out.println(minuto + " minuto(s)");
        System.out.println(segundo + " segundo(s)");
        
        sc.close();
    }
}