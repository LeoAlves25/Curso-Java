import java.util.Locale;
import java.util.Scanner;

import Entities.Rectangle;

public class Program{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle width and height:");
        Rectangle X = new Rectangle();

        X.width = sc.nextDouble();
        X.height = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", X.Area());
        System.out.printf("PERIMETER = %.2f%n", X.Perimeter());
        System.out.printf("DIAGONAL = %.2f%n", X.Diagonal());

        sc.close();
    }
}