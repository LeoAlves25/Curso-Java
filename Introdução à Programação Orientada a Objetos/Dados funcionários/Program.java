import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee x = new Employee();

        System.out.print("Name: ");
        x.name = sc.nextLine();
        System.out.print("Gloss Salary: ");
        x.glossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        x.tax  = sc.nextDouble();

        System.out.println();
        System.out.printf("Employee: %s, $ %.2f%n",x.name, x.NetSalary());

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percent = sc.nextDouble();
        x.IncreaseSalary(percent);

        System.out.println();
        System.out.printf("Updated data: %s, $ %.2f%n", x.name , x.NetSalary());

        sc.close();
    }
}