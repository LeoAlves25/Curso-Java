package entities;

public class Employee {
    
    public String name;
    public double glossSalary;
    public double tax;

    public double NetSalary(){
        return glossSalary - tax;
    }

    public void IncreaseSalary(double percentage){
        this.glossSalary+=this.glossSalary*percentage/100;
    }
}
