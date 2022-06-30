import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double maxAux = Math.max(A, B);
        double max1 = Math.max(maxAux, C);
        double max2;
        double max3;

        if(max1 == A){
            max2 = Math.max(B, C);
            max3 = Math.min(B, C);
        }else if(max1 == B){
            max2 = Math.max(A, C);
            max3 = Math.min(A, C);
        }else{
            max2 = Math.max(B, A);
            max3 = Math.min(B, A);
        }


        if(max1>=(max2+max3)){
            System.out.println("NAO FORMA TRIANGULO");
        }else{
            if(Math.pow(max1,2)==(Math.pow(max2,2)+Math.pow(max3,2))){
                System.out.println("TRIANGULO RETANGULO");
            }else if(Math.pow(max1,2)>(Math.pow(max2,2)+Math.pow(max3,2))){
                System.out.println("TRIANGULO OBTUSANGULO");
            }else{
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if(max1==max2 && max2==max3){
                System.out.println("TRIANGULO EQUILATERO");
            }else if(max1==max2 || max2==max3 || max1==max3){
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}