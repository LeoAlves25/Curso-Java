import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anterior = 0;
        int atual = 1;
        int proximo = 1;

        int N = sc.nextInt();
        String texto = "";

        for(int i = 1; i<=N; i++){
            if(i!=N){
                texto+=anterior+" ";
                proximo=atual+anterior;
                anterior = atual;
                atual=proximo;
            }else{
                texto+=anterior;
                proximo=atual+anterior;
                anterior = atual;
                atual=proximo;
            }
        }

        System.out.println(texto);
        sc.close();
    }
}