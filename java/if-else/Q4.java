// import java.util.Scanner;


// public class Q3 {
//   //* Write a program that takes a character as input and prints "Vowel"
//   //*if it's a vowel (a, e, i, o, u),and "Consonant" otherwise. */
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter a character: ");
//         char ch = scanner.next().charAt(0);
//         if (isVowel(ch)) {
//             System.out.println(ch + " is a vowel.");
//         } else {
//             System.out.println(ch + " is not a vowel.");
//         }
//     }
    
// }
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.println("Enter a character: ");
    //     char ch = scanner.next().charAt(0);

    //     if (isVowel(ch)) {
    //         System.out.println(ch + " is a vowel.");
    //     } else {
    //         System.out.println(ch + " is not a vowel.");
    //     }
    //     scanner.close();
    // }

    // public static boolean isVowel(char ch) {
    //     String vowels = "aeiouAEIOU";
    //     return vowels.indexOf(ch) != -1;
    // }
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a character: ");
    char ch = scanner.next().charAt(0);
    if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || 
    ch=='a' || ch=='e' || ch=='i' || ch =='o' || ch=='u'){
        System.out.println(ch + " is a vowel.");
    }
    else{
        System.out.println(ch + " is not a vowel.");
        }
        scanner.close();
}
}