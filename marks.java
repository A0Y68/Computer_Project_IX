
import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students:");
        int n = sc.nextInt();

        System.out.print("\nEnter number of marks per student:");
        int m = sc.nextInt();

        int max= 0, min = 2147483647;

        for(int i = 1; i <= n;i++){
           int total = 0;
           for(int j=1;j<=m;j++){
            System.out.print("\nEnter marks for Student "+ i+" : ");
            int marks = sc.nextInt();
            total+=marks;
           }
           if(total>max) max = total;
           if(total<min) min = total;
            
        }        
        System.out.println("\nMaximum Total: " + max + "\n" + "Minimum Total: " + min);
        sc.close();
    }
}