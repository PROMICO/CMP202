
package assignment1;
import java.util.Scanner;
/**
 *
 * @author Promise NDIAGWALU
 */
public class Assignment1 {

    
    public static void main(String[] args) {
        for(;;){
       Scanner a= new Scanner(System.in);
       System.out.print("Enter Number:");
       int pro=a.nextInt();
       if (pro==0){System.out.println("Error");}
       else if(pro%2==0){System.out.println(pro+" is an even number");}
       else System.out.println(pro+" is an odd number");
        }
    }
    
}
