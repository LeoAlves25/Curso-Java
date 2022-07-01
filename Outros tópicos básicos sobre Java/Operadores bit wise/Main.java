import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ref = 0b100000;
        int numero = sc.nextInt();

        if((ref & numero) != 0){ //& representa "E", assim como | represente "OU" e ^ "XOR"
            System.out.println("O 6º bit vale 1.");
        }else{
            System.out.println("O 6º bit não vale 1.");
        }

        sc.close();
    }
}