

import java.util.Scanner;


public class patternmenu2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while(true){
            
                System.out.print("\n1 for First Pattern\n2 for Second Pattern\n3 for Third Pattern\n0 to Exit\n\nEnter your choice: ");
                int ch = sc.nextInt();

                int h;
                switch(ch){

                case 0:
                    System.out.println("Hasta La Vista");
                    System.exit(0);
                case 1:

                    System.out.print("Enter Height: ");
                    h = sc.nextInt();

                    System.out.println();

                    for(int i=1 ; i<=h/2 ; i++){
                        for(int j = 1; j<=2*i-1;j++) System.out.print("*");
                        System.out.println();
                    }
                    for(int i=h/2+1 ; i>=1 ; i--){
                        for(int j = 1; j<=2*i-1;j++) System.out.print("*");
                        System.out.println();
                    }
                    break;

                case 2:

                    System.out.print("Enter Length: ");
                    int l = sc.nextInt();

                    System.out.print("Enter Breadth: ");
                    int b = sc.nextInt();

                    System.out.println();

                    for(int i=1;i<=b;i++){
                        for(int j=1;j<=l;j++){
                            if(i==1 || i==b)
                                System.out.print("*");
                            else{
                                if(j==1||j==l)
                                    System.out.print("8");
                                else
                                    System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:

                    System.out.print("Enter Height: ");
                    h = sc.nextInt();

                    System.out.println();

                    int c=h/2;
                    for(int i=1;i<=h/2+1;i++){
                        for(int sp=1;sp<=c;sp++)
                            System.out.print(" ");
                        for(int j=1; j<=2*i-1;j++){
                            if(j==i||i==h/2+1)
                                System.out.print(j);
                            else
                                System.out.print(" ");
                        }
                        c--;
                        System.out.println();
                    }
                    c=1;
                    for(int i=h/2;i>=1;i--){
                        for(int sp=1;sp<=c;sp++)
                            System.out.print(" ");
                        for(int j=1; j<=2*i-1;j++){
                            if(j==i||i==h/2+1)
                                System.out.print(j);
                            else
                                System.out.print(" ");
                        }
                        c++;
                        System.out.println();
                    }
                    break;
                }
            }
        }
    }
}
