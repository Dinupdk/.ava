public class Elooping {
    public static void main(String[] args) {
    
       int sum = 0;  
       //for looping 
       System.out.println("for loop");
       for(int j = 1; j<=10; j++) {  
       sum = sum + j;  
       }  
       System.out.println("The sum of first 10 natural numbers is " + sum); 
          //for each loop
          System.out.println("for each loop");
        String[] names =  {"Java","C","C++","Python","JavaScript"};
        for(String name : names) {
            System.out.println(name);
        }
        //nested loop
        System.out.println("nested for loop");
        for(int x=1;x<=3;x++){
            for(int y=1;y<=3;y++){
                System.out.println("x = " + x + " y = " + y);
                }
        }

        //while 
        System.out.println("while loop");
        int i = 0;    
        System.out.println("Printing the list of first 10 even numbers \n");    
        while(i<=10) {    
            System.out.println(i);    
            i = i + 2;    
        }  

        // do-while
        System.out.println("do-while loop");
        int k = 0;    
        System.out.println("Printing the list of first 10 even numbers \n");    
        do {    
            System.out.println(k);    
            k = k + 2;    
        }while(k<=20);    

        // break statement 
       
        System.out.println("Break Statement");
        for(int l = 1; l<=10; l++) {
            if(l == 5) {
                break;
            }
            System.out.println(l);
        }
                // continue statement
                System.out.println("Continue Statement");
        for(int m = 1; m<=10; m++) {
            if(m == 5) {
                continue;
            }
            System.out.println(m);
        }
       
       
        for(int c=1;c<=5;c++){  
            for(int d=1;d<=c;d++){  
                    System.out.print("* ");  
            }  
            System.out.println();//new line  
            }  







    }
 
}
