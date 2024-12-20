
//* Write a program that takes a grade as input (A, B, C, D, or F) and 
//* prints "Pass" if it's A, B, C, or D, and "Fail" if it's F.

public class Q6 {
    public static void main(String[] args){
        char grade = 'A'; // declare and initialize grade variable
        if (grade == 'A' || grade == 'B' || grade == 'C'
        || grade == 'D'){
            System.out.println("Pass");
            }
            else if (grade == 'F'){
                System.out.println("Fail");
                }         
    }
    
}
