public class Main{
    public static void main(String[] args) {
        
        double soma = 0;

        for(double i = 1; i<=100; i++){
            soma+=1/i;
        }

        System.out.printf("%.2f%n",soma);
    }
}