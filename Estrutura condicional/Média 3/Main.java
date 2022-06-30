import java.util.Scanner;
import java.text.DecimalFormat;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        double N1 = sc.nextDouble();
        double N2 = sc.nextDouble();
        double N3 = sc.nextDouble();
        double N4 = sc.nextDouble();
        double media = (N1*2+N2*3+N3*4+N4*1)/10;

        System.out.println("Media: " + df.format(media));

        if(media <= 6.9 && media >= 5){
            System.out.println("Aluno em exame.");
            double NF = sc.nextDouble();
            System.out.println("Nota do exame: "+ df.format(NF));

            double mediaF = (media+NF)/2;

            if(mediaF < 5){
                System.out.println("Aluno reprovado.");
            }else{
                System.out.println("Aluno aprovado.");
            }

            System.out.println("Media final: " + df.format(mediaF));
        }else if(media < 5){
            System.out.println("Aluno reprovado.");
        }else{
            System.out.println("Aluno aprovado.");
        }

        sc.close();
    }
}