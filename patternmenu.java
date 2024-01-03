
import java.util.Scanner;

public class patternmenu {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            while(true){

                System.out.print("\n1 for First Pattern\n2 for Second Pattern\n0 to Exit\n\nEnter your choice: ");
                int ch = sc.nextInt();

                int h;

                switch(ch){

                    case 1:
                        System.out.print("\nEnter Height: ");
                        h = sc.nextInt();

                        System.out.println();

                        for(int i=1;i<=h;i++){

                            for(int j=1;j<=i;j++)
                                System.out.print(i%2==0?(char)(64+i):(char)(64+j));

                            for(int sp=1;sp<=2*(h-i)-1;sp++)
                                System.out.print(" ");

                            for(int j=i;j>=1;j--)
                                if(j!=h)
                                    System.out.print(i%2==0?(char)(64+i):(char)(64+j));

                            System.out.println();
                        }
                        break;
                    
                    case 2:
                        System.out.print("\nEnter Height: ");
                        h = sc.nextInt();

                        System.out.println();

                        for(int i = h;i>=1;i--){
                            for(int j=1;j<=i;j++)
                                    System.out.print(j);

                            for(int sp=1;sp<=2*(h-i)-1;sp++)
                                if(sp == 1 || sp == 2*(h-i)-1)
                                    System.out.print("#");
                                else
                                    System.out.print(" ");

                            for(int j=i;j>=1;j--)
                                if(j!=h)
                                    System.out.print(j);;
                                                              
    
                            System.out.println();
                        }
                        for(int i=1; i<=2*h-1;i++){
                            if(i==1||i==2*h-1)
                                System.out.print(1);
                            else
                                System.out.print(" ");
                        }
                        System.err.println();
                        break;

                        case 0: System.out.println("\nHasta La Vista"); System.exit(0);
                        default: System.out.println("\nInvalid Choice");
                }
            }
        }
    }
}
