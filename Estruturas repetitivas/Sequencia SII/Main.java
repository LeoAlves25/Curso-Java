public class Main{
    public static void main(String[] args) {
        double denominador = 1;
       
        double soma = 0;

        for(double i = 1; i<=39; i+=2){
            soma+=i/denominador;
            denominador=denominador*2;
        }

        System.out.printf("%.2f%n",soma);
    }
}