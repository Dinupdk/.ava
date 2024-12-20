import java.util.*;  
public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year :");
        int year= scanner.nextInt();
        if (year%4==0) {
            System.out.println(year+"It is a leap year");
        }
        else {
            System.out.println(year+"It is not a leap year");
            }
        scanner.close();

    }
    
}
