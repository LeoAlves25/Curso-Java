package entities;

public class Bank {
    private int number;
    private String name;
    private double deposit;

    public Bank(int number, String name){
        this.number = number;
        this.name = name;
    }

    public Bank(int number, String name,double initialDeposit){
        this.number = number;
        this.name = name;
        depositValue(initialDeposit);
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDeposit() {
        return deposit;
    }

    public double depositValue(double value){
        this.deposit += value;
        return getDeposit();
    }

    public double withdrawValue(double value){
        this.deposit -= value + 5.00;
        return getDeposit();
    }

    public String toString(){
        return "Account " + getNumber() 
        + ", Holder: " + getName()
        + ", Balance $ " + String.format("%.2f%n", getDeposit());
    }

}
