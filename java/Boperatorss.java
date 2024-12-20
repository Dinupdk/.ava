public class Boperatorss {
    public static void main(String[] args) {
    int x=10;
    int y=20;

    // unary operator increment, decrement Operators ++ and --
    System.out.println("increment ,decrement operators");
    System.out.println("starting Value of x ="+x);
    System.out.println("Before increment x = "+ x++);//10-->11 print after increase
    System.out.println("Value of x ="+x);
    System.out.println("after increment x = "+ ++x);//20-->21  before print increase
    System.out.println("Value of x ="+x);
    System.out.println("Before decrement x = "+ x--); //11-->10 print after decrease
    System.out.println("Value of x ="+x);
    System.out.println("after decrement x = "+ --x);//21-->20  before print decrease
    System.out.println("Value of x ="+x);
    System.out.println("                            ");


    // Arthematic operators 
    // +, -, *, /, % , ++, --

    System.out.println("Arthematic operators");
    System.out.println("addition x+y ="+(x+y));
    System.out.println("subtraction x-y ="+(x-y));
    System.out.println("multiply x*y ="+(x*y));
    System.err.println("Division x/y ="+(x/y));
    System.out.println("modulus x%y ="+(x%y));
    System.out.println("                            ");



    // shift operators <<,>>
    System.out.println("Shift operators");
    System.out.println("left shift x<<y ="+(x<<y)); //x*2^y
    System.out.println("Right shift x>>y ="+(x>>y)); //x/2^y
    System.out.println("                            ");


    //logical opertors && and,|| or ,! not
    boolean a=true;
    boolean b=false;
    System.out.println("logical operators");
    System.out.println("logical AND a&&b = "+(a&&b));
    System.out .println("logical OR a||b = "+(a||b));
    System.err.println("logical NOT !a = "+(!a));
    System.out.println("                            ");



    // bitwise operators 
    System.out.println("bitwise operators ");
    System.out.println("bitwise AND a&b ="+(a&b));
    System.out.println("bitwise OR a|b = "+(a|b));
    System.out.println("bitwise NOT ~x"+(~x)); // not taking boolean values 
    System.out.println("                            ");

    //relational operators
    System.out.println("relational operators");
    System.out.println("greater than x>y = "+(x>y));
    System.out.println("less than x<y = "+(x<y));
    System.out.println("Less than or equal to x<=y"+(x<=y));
    System.out.println("Greater than or equal to x>=y"+(x>=y));
    System.out.println("Equal to x==y = "+(x==y));
    System.out.println("Not equal to x!=y = "+(x!=y));
    System.out.println("                            ");
    // assignment operators
    System.out.println("assignment operators");
    System.out.println("Simple assignment x=y = "+(x=y));
    System.out.println("Addition assignment x+=y = "+(x+=y));
    System.out.println("Subtraction assignment x-=y = "+(x-=y));
    System.out.println("Multiplication assignment x*=y = "+(x*=y));
    System.out.println("Division assignment x/=y = "+(x/=y));
    System.out.println("Modulus assignment x%=y = "+(x%=y));
    System.out.println("                            ");
    // ternary operator
    System.out.println("ternary operator");
    System.out.println("x>y ? x : y = "+(x>y ? x : y));
    System.out.println("                            ");









    
    }
    
    
}
