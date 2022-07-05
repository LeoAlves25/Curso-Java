package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char resp = sc.next().charAt(0);

        Bank bank;

        if(resp == 'y'){
            System.out.print("Enter the initial deposit value: ");
            double deposit = sc.nextDouble();
            bank = new Bank(number, name, deposit);
        }else{
            bank = new Bank(number, name);
        }

        System.out.println("");
        System.out.println("Account data:");
        System.out.print(bank);

        System.out.println("");
        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        bank.depositValue(deposit);
        System.out.println("Account data:");
        System.out.print(bank);

        System.out.println("");
        System.out.print("Enter a withdraw value: ");
        deposit = sc.nextDouble();
        bank.withdrawValue(deposit);
        System.out.println("Account data:");
        System.out.print(bank);

        sc.close();
    }
}