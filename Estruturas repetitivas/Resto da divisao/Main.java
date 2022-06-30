import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        int max = Math.max(X, Y);
        int min = Math.min(X, Y);

        for(int i = min+1; i<max; i++){
            if(i%5==2 || i%5==3){
                System.out.println(i);
            }
        }

        sc.close();
    }
}