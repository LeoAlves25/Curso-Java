import java.util.Locale;//Importar a ferramenta Locale

public class Main {
    public static void main(String[] args) {
        String nome = "Leonardo";
        int y = 10, idade = 25;
        double x = 10.35784,  renda = 800.56;

        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);

        Locale.setDefault(Locale.US);//Poder configurar a saída para o padrão americano, trocando o "," por "."
        System.out.printf("%.2f%n", x);

        System.out.println("Resultado = " + x + " metros");
        System.out.printf("Resultado = %.2f metros%n", x);

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }    
}