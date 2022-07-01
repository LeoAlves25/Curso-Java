package util;

public class CurrencyConverter {
    
    public static double price;
    public static double dolar;

    public static double Convert(){
        return (price*dolar)+(price*dolar*6)/100;
    }
}
