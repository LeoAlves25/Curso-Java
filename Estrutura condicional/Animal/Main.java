import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String primeiro = sc.next();
        String segundo = sc.next();
        String terceiro = sc.next();

        if(primeiro.equalsIgnoreCase("vertebrado")){
            if(segundo.equalsIgnoreCase("ave")){
                if(terceiro.equalsIgnoreCase("carnivoro")){
                    System.out.println("aguia");
                }else{
                    System.out.println("pomba");
                }
            }else{
                if(terceiro.equalsIgnoreCase("onivoro")){
                    System.out.println("homem");
                }else{
                    System.out.println("vaca");
                }
            }
        }else{
            if(segundo.equalsIgnoreCase("inseto")){
                if(terceiro.equalsIgnoreCase("hematofago")){
                    System.out.println("pulga");
                }else{
                    System.out.println("lagarta");
                }
            }else{
                if(terceiro.equalsIgnoreCase("hematofago")){
                    System.out.println("sanguessuga");
                }else{
                    System.out.println("minhoca");
                }
            }
        }
    }
}