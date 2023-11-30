
import java.util.Scanner;

public class RoundFloatingPoint {   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter a Floating Point Number:");
        double n = sc.nextDouble();
        
        System.out.print("\nEnter Number of Decimal Places to be Rounded Off: ");
        int c = sc.nextInt();
        
        double round = Math.round(n * Math.pow(10, c)) / Math.pow(10, c);
        System.out.print("\nRounded off Number is: " + round);
        
        sc.close();
    }
}
