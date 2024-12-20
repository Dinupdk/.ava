//? Classify a given age into four categories: baby, child, teenager, or adult.
import java.util.*;
public class Q9 {
    
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        sc.close();
        if (age<6) {
            System.out.println("Baby");
        }
        else if(6<= age  && age <13){
            System.out.println("Child");
        }
        else if(14<= age && age <21){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Adult");
            }
    }
}
