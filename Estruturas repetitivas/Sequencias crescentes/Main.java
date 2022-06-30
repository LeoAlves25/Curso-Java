import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        while(X!=0){
            String texto="";

            for(int i = 1; i <=X; i++){
                if(i==X){
                    texto+=i;
                }else{
                    texto+=i+" ";
                }
            }

            System.out.println(texto);

            X = sc.nextInt();
        }
        sc.close();
    }
}