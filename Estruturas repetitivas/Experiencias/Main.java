import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int totalCoelhos = 0;
        int totalRatos = 0;
        int totalSapos = 0;

        int N = sc.nextInt();

        for(int i = 1; i<=N; i++){
            int quantidade = sc.nextInt();
            char tipo = sc.next().charAt(0);

            total+=quantidade;
            if(tipo=='C'){
                totalCoelhos+=quantidade;
            }else if(tipo=='R'){
                totalRatos+=quantidade;
            }else{
                totalSapos+=quantidade;
            }
        }

        double percCoelhos = (double) totalCoelhos/total*100;
        double percRatos = (double) totalRatos/total*100;
        double percSapos = (double) totalSapos/total*100;

        System.out.println("Total: "+total+" cobaias");
        System.out.println("Total de coelhos: "+totalCoelhos);
        System.out.println("Total de ratos: "+totalRatos);
        System.out.println("Total de sapos: "+totalSapos);
        System.out.println(String.format("Percentual de coelhos: %.2f", percCoelhos) + " %");
        System.out.println(String.format("Percentual de ratos: %.2f", percRatos) + " %");
        System.out.println(String.format("Percentual de sapos: %.2f", percSapos) + " %");

        sc.close();
    }
}