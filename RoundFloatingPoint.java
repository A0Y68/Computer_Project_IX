
import java.util.Scanner;

public class RoundFloatingPoint {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no");
        double n = sc.nextDouble();
        System.out.println("Enter no of decimal places");
        int c = sc.nextInt();
        n = Math.round(n * Math.pow(10, c)) / Math.pow(10, c);
        System.out.println(n);
        sc.close();
    }
}