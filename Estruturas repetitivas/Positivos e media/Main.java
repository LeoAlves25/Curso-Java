import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivos = 0;
        double soma = 0;

        for(int i = 0; i<6; i++){
            double numero = sc.nextDouble();

            if(numero>0){
                positivos++;
                soma+=numero;
            }
        }

        double media = soma/positivos;

        System.out.println(positivos + " valores positivos");
        System.out.printf("%.1f%n", media);

        sc.close();
    }
}