import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int maxAux = Math.max(A,B);
        int max1 = Math.max(maxAux, C);
        int max2;
        int max3;

        if(max1 == A){
            max2=Math.max(B,C);
            max3=Math.min(B,C);
        }else if(max1 == B){
            max2=Math.max(A,C);
            max3=Math.min(A,C);
        }else{
            max2=Math.max(B,A);
            max3=Math.min(B,A);
        }

        System.out.println(max3);
        System.out.println(max2);
        System.out.println(max1);
        System.out.println("");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}