//* Assign a grade to a given percentage, considering the following grade scale:
//*  A (90-100), B (80-89), C (70-79), D (60-69), and F (below 60).
import java.util.*;
public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a percentage: ");
        int percentage = sc.nextInt();
        if (percentage<100 && percentage>=90) {
            System.out.println("Geade A");
        }
        else if (percentage<90 && percentage>=80) {
            System.out.println("Grade B");
        }
        else if (percentage<80 && percentage>=70) {
            System.out.println("Grade C");
        }
        else if (percentage<70 && percentage>=60) {
            System.out.println("Grade D");
        }
        else {
            System.out.println("Grade F");
            }
            sc.close();

    
    }
    
}
