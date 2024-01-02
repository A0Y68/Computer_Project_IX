
import java.text.DecimalFormat;

public class trig {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("\nTrig\t0\t30\t45\t60\t90\n");

        int i=1;

        do{

            if(i==1) System.out.print("Sin\t");
            else if(i==2) System.out.print("Cos\t");
            else System.out.print("Tan\t");

            int theta=0;

            do{
                if(theta != 15 && theta != 75){
                    double angle = Math.toRadians(theta);

                    if(i==1) 
                        System.out.print(df.format(Math.sin(angle))+"\t");

                    else if(i==2) 
                        System.out.print(df.format(Math.cos(angle))+"\t");

                    else{
                        if(theta!=90) 
                            System.out.print(df.format(Math.tan(angle))+"\t");
                        else    
                            System.err.print("Undefined");
                    }
                }
                theta+=15;
            }while(theta<=90);
            System.out.println();
            i++;
        }while(i<=3);
    }
}
