public class Example {
    int c=10; // Instance variable  Accessible by all non-static methods in the class using the object.
    static int x=20; // Shared among all objects of the class (class-level scope)
    //cteation of method -->creation of function
    public int add(int a,int b){
        int d=15;
        return a+b+c+d+x;
    }
    public int sub(int a,int b){
        return a-b-c;
    }
    public static void main(String[] args) {
        Example obj = new Example();  // creation of object
        System.out.println("Addition : "+ obj.add(2,3)); // calling a method using object
        System.out.println("Subtraction : "+obj.sub(20,10));
    }
}































/*
public class Calculator {
    // Method for addition
    public int add(int a, int b) {
        return a + b;
    }

    // Method for subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method for multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method for division
    public double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
    }

    public static void main(String[] args) {
        // Create an object of Calculator
        Calculator calc = new Calculator();

        // Call methods
        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
        System.out.println("Multiplication: " + calc.multiply(10, 5));
        System.out.println("Division: " + calc.divide(10, 5));
    }
}


 */
