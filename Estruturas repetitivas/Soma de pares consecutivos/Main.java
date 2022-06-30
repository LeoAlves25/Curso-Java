import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        while(numero!=0){

            int cont = 0;
            int soma = 0;

            while(cont<5){
                if(numero%2==0){
                    soma+=numero;
                    numero++;
                    cont++;
                }else{
                    numero++;
                }
            }

            System.out.println(soma);

            numero=sc.nextInt();
        }

        sc.close();
    }
}