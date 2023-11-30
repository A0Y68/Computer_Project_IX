
import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter height: ");
        int h = sc.nextInt();
        System.out.println();
        for(int i = 1;i<=h;i++){

            for(int sp = 1; sp <= h-i; sp++)
                System.out.print(" ");
            
            for(int j = i; j>=1;j--)
                System.out.print(j);
            
            for(int j = 2; j<=i;j++)
                System.out.print(j);
            
            System.out.println();
        }
        sc.close();
    }
}
