import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int calcular = 0;

        while(calcular!=2){
            int i = 0;
            double soma=0;
            calcular=0;

            while(i<2){
                double nota = sc.nextDouble();
                if(nota<0 || nota >10){
                    System.out.println("nota invalida");
                }else{
                    soma+=nota;
                    i++;
                }
            }

            double media = soma/2;
            System.out.printf("media = %.2f%n", media);

            while(calcular!=1 && calcular !=2){
                System.out.println("novo calculo (1-sim 2-nao)");
                calcular = sc.nextInt();
            }
        }

        sc.close();
    }
}