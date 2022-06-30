import java.text.DecimalFormat;

public class Main{
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");

        for(double i = 0; i <= 2; i+=0.2){
            for(double j = i+1; (j-i)<=3.1; j++){
                if (df.format(i).endsWith("0")) {
					System.out.println("I=" + df.format(i).substring(0, 1) + " J=" + df.format(j).substring(0, 1));
				} else {
					System.out.println("I=" + df.format(i) + " J=" + df.format(j));
				}
            }
        }

    }
}