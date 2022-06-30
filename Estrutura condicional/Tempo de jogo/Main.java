import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H1 = sc.nextInt();
        int H2 = sc.nextInt();

        if(H2<=H1){
            H2+=24;
        }

        int tempo = H2-H1;

        System.out.println("O JOGO DUROU "+tempo+" HORA(S)");
    }
}