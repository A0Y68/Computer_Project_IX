
import java.util.Scanner;

public class digit5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a Five-Digit Number: ");
        int n = sc.nextInt();
        if(n >= 10000 && n <= 99999 ){
            int c = 1, extreme = 0, middle = 0, d;
            while(n>0){
                d = n%10;
                if(c==1 || c==5)
                     extreme+=d;
                else 
                    middle+=d;
                n/=10;
                c++;
            }
            if(extreme==middle)
                System.out.print("\nSum Extreme and Middle are equal.");
            else
                System.out.print("\nSum Extreme and Middle are not equal.");
        }
        else
            System.out.print("\nNumber not Five-Digit Number");
        sc.close();
    }
}
