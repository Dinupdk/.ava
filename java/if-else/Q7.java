//! Check if a given number num is positive, negative, or zero.
import java.util.*;
public class Q7 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num > 0){
            System.out.println(num + " is a positive number.");
        }
        else if (num <0){
            System.out.println(num + " is a negative number.");
        }
        else{
            System.out.println(num + " is zero.");
        }
        sc.close();

    }
    
}
