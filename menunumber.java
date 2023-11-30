
import java.util.Scanner;

public class menunumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 for Prime\n2 for Perfect\n3 for Armstrong\n0 to Exit\n\nEnter your choice:   ");
        int ch = sc.nextInt();
        if(ch>=0&&ch<=3){
            System.out.print("\nEnter Range Start:   ");
            int a = sc.nextInt();
            System.out.print("\nEnter Range End:   ");
            int b = sc.nextInt();
            switch (ch) {
                case 0:System.out.println("\nHasta La Vista"); System.exit(0);
                case 1:
                        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
                            int c=0;
                            for (int j = 1; j <= i; j++) if (i%j==0)c++;  
                            if(c==2) System.out.println(i + " is Prime");                        
                        }                
                    break;
                case 2:
                        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
                            int s=0;
                            for (int j = 1; j <= i-1; j++) if (i%j==0)s+=j;  
                            if(s==i) System.out.println(i + " is Perfect");                        
                        }
                        break;
                case 3:
                        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
                            int d=0,s=0,n=i;
                            while (n>0) {
                                d=n%10;
                                s+=d*d*d;
                                n/=10;
                            } 
                            if(s==i) System.out.println(i + " is Armstrong");                        
                        }  
                        break;  
                default:System.out.println("\nInvalid Choice");       
            
            }
        }
        else
            System.out.println("Invalid");
        sc.close();
    }
}
