import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int j = 0;
        
        for(int i=1; i<=Y/X ;i++){
            String texto="";
            if(i==1){
                j=1;
            } else{
                j=((i-1)*X)+1;
            }
            while(j<=X*i){
                if(j==(X*i)){
                    texto+=j;
                    j++;
                } else{
                    texto+=j+" ";
                    j++;
                }
            }
            System.out.println(texto);
        }
        
        sc.close();
    }
}