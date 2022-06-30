import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 1; i <= N; i++){
            int numero = sc.nextInt();
            int soma = 0;
            for(int j = 1; j < numero; j++){
                if(numero%j==0){
                    soma+=j;
                }
            }

            if(numero==soma){
                System.out.println(numero+" eh perfeito");
            }else{
                System.out.println(numero+" nao eh perfeito");
            }
        }

        sc.close();
    }
}