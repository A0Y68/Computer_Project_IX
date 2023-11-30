
import java.util.Scanner;

public class twinprimerange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int n = Math.min(a, b);n <= Math.max(a, b) - 2; n++){
            int c=0,x=0;
            for(int i=1;i<=n;i++) if(n%i==0)c++;
            for(int i=1;i<=(n+2);i++) if((n+2)%i==0)x++;
            if(c==2&&x==2) System.out.println(n+" & "+(n+2));
        }
        sc.close();
    }
}
