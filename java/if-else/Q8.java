//* */ #Determine the type of a given number num: even or odd, 
//*# and whether it is positive or negative.
import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num >0){
            if (num%2==0) {
                System.out.println(num + " is a positive even number.");
            }
            else {
                System.out.println(num + " is a positive odd number.");
        }
    
    }
    else if(num<0){
        if (num%2==0) {
            System.out.println(num + " is a negative even number.");
    }
    else {
        System.out.println(num + " is a negative odd number.");
        }
        }
    else{
        System.out.println(num+" : The number is neither positive nor negative.");
    }

    sc.close();
    
}
}
