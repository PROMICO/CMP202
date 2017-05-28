
package assignment2;
import java.util.Scanner;
/**
 *
 * @author Promise NDIAGWALU
 */
public class Assignment2 {

    public static void main(String[] args) {
        for(;;){
        int sir;
        boolean isPrime=true;
        Scanner a= new Scanner(System.in);
       System.out.print("Enter Number:");
       int pro=a.nextInt();
       for(int i=2;i<=pro/2;i++)
       {
       sir=pro%i;
       if(sir==0){
       isPrime=false;
       break;
       }
       }
       if(isPrime)
           System.out.println(pro+" is Prime Number");
       else
           System.out.println(pro+ " is not Prime Number");
    }
    
}
}