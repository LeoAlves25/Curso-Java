import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        if(Math.abs(B-C)<A && A<(B+C)){
            double triangulo = A+B+C;
            System.out.printf("Perimetro = %.1f%n",triangulo);
        }else{
            double trapezio = (A+B)*C/2;
            System.out.printf("Area = %.1f%n", trapezio);
        }
    }
}