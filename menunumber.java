
import java.util.Scanner;

public class menunumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while(true){
                System.out.print("1 for Prime\n2 for Perfect\n3 for Armstrong\n0 to Exit\n\nEnter your choice:   ");
                int ch = sc.nextInt();
                int i,j;
                if(ch>=0&&ch<=3){
                    System.out.print("\nEnter Range Start:   ");
                    int a = sc.nextInt();
                    System.out.print("\nEnter Range End:   ");
                    int b = sc.nextInt();
                    switch (ch) {
                        case 0:System.out.println("\nHasta La Vista"); System.exit(0);
                        case 1:
                                i = Math.min(a, b);
                                while(i <= Math.max(a, b)) {
                                    int c=0;j=1;
                                    while (j <= i){ 
                                        if (i%j==0)
                                            c++;
                                        j++;
                                    }  
                                    if(c==2) System.out.println(i + " is Prime"); 
                                    i++;                       
                                }                
                            break;
                        case 2:
                                i = Math.min(a, b);
                                while(i <= Math.max(a, b)){
                                    int s=0;
                                    j=1;
                                    while( j <= i-1){ 
                                        if (i%j==0)
                                            s+=j;
                                        j++;
                                    }
                                    if(s==i) System.out.println(i + " is Perfect");  
                                    i++;                      
                                }
                                break;
                        case 3:
                                i = Math.min(a, b);
                                while(i <= Math.max(a, b)) {
                                    int d=0,s=0,n=i;
                                    while (n>0) {
                                        d=n%10;
                                        s+=d*d*d;
                                        n/=10;
                                    } 
                                    if(s==i) System.out.println(i + " is Armstrong");   
                                    i++;                   
                                }  
                                break;       
                    
                    }
                }
                else
                    System.out.println("Invalid");
            }
        }
    }
}
