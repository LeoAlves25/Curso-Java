import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String original = "abcde FGHIJ ABC abc DEFG    ";

        String s1 = original.toLowerCase();
        String s2 = original.toUpperCase();
        String s3 = original.trim();
        String s4 = original.substring(2);
        String s5 = original.substring(2, 9);
        String s6 = original.replace("a","X");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");


        System.out.println("Original: -"+original+"-");
        System.out.println("toLowerCase: -"+s1+"-");
        System.out.println("toUpperCase: -"+s2+"-");
        System.out.println("trim: -"+s3+"-");
        System.out.println("substring(2): -"+s4+"-");
        System.out.println("substring(2,9): -"+s5+"-");
        System.out.println("replace: -"+s6+"-");
        System.out.println("Index of 'bc': "+i);
        System.out.println("Last index of 'bc': "+j);
        
        sc.close();
    }
}