import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 0;
        double soma = 0;

        while(cont < 2){
            double nota = sc.nextDouble();

            if(nota < 0 || nota > 10){
                System.out.println("nota invalida");
            }else{
                soma+=nota;
                cont++;
            }
        }

        double media = soma/2;

        System.out.printf("media = %.2f%n", media);

        sc.close();
    }
}