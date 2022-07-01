import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student std = new Student();

        std.name = sc.nextLine();
        std.note1 = sc.nextDouble();
        std.note2 = sc.nextDouble();
        std.note3 = sc.nextDouble();

        double total = std.FinalGrade();
        System.out.printf("FINAL GRADE = %.2f%n",total);

        std.Result(total);

        sc.close();
    }
}