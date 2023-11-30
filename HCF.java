
import java.util.Scanner;

public class HCF  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        if (n < 2) {
            System.out.println("At least two numbers are required to calculate HCF.");
            System.exit(0);
        }

        System.out.print("Enter the first number: ");
        int hcf = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.print("Enter the next number: ");
            int num = scanner.nextInt();
            
            int a = hcf;
            int b = num;
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            
            hcf = a;
        }

        System.out.println("The HCF of the entered numbers is: " + hcf);

        scanner.close();
    }
}
