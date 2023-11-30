
import java.util.Scanner;

public class prime_Adam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int n=Math.min(a, b);n<=Math.max(a, b);n++){
            int c=0;
            for(int i=1;i<=n;i++)
                if(n%i==0)c++;
            if(c==2){
                int d=0,r=0,sqn=n*n,sqr=0,m=0,no=n;
                while (no>0) {
                    d=no%10;
                    r=r*10+d;
                    no/=10;
                }
                sqr=r*r;
                while (sqr>0) {
                    d=sqr%10;
                    m=m*10+d;
                    sqr/=10;
                }
                if(sqn==m) System.out.println(n);
            }
        }
        sc.close();
    }
}