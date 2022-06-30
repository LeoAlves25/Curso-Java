import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H1 = sc.nextInt();
        int M1 = sc.nextInt();
        int H2 = sc.nextInt();
        int M2 = sc.nextInt();

        int tempo1 = H1*60+M1;
        int tempo2 = H2*60+M2;

        if(tempo1>=tempo2){
            tempo2+=24*60;
        }

        int tempoTotal = tempo2-tempo1;

        int horaFinal = tempoTotal/60;
        int minutoFinal = tempoTotal%60;

        System.out.println("O JOGO DUROU " + horaFinal + " HORA(S) E " + minutoFinal + " MINUTO(S)");
    }
}