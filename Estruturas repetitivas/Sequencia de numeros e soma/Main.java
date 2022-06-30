import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        while(N>0 && M>0){
    
            int max = Math.max(M,N);
            int min = Math.min(M,N);

            String texto = "";
            int soma=0;

            for(int i = min; i <= max; i++){
                soma+=i;
                texto+=i+" ";
            }

            texto+="Sum="+soma;

            System.out.println(texto);

            M = sc.nextInt();
            N = sc.nextInt();
        }
        sc.close();
    }
}