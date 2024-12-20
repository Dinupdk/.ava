public class Strings {
    public static void main(String[] args) {
        System.out.println("Strings");
        String a ="Hello world";
        String b = "    Hello world    ";
        System.out.println("Length of String"+": " +a.length());
        System.out.println("Lower case : "+a.toLowerCase());
        System.out.println("Upper case : "+a.toUpperCase());
        
        System.out.println("Strip : "+b.strip());
        System.out.println("Replace : "+ a.replace("H", "z"));
        System.out.println("Replace : "+ a.replace("world", "java"));
        String c="Apple,Orange,Banana";
        System.out.println("Split : "+c.split(","));
        System.out.print("Split : "+c.split(","));
        String[] d;
        d=c.split(",");
        System.out.println(d[1]);
        System.out.println("Word start with Hello : "+a.startsWith("Hello"));
        System.out.println("Word end with world : "+a.endsWith("world"));
        System.out.println("No.of 'l' in string : "+ a.codePointCount(0, 6));
        

        String str = "Hello, World!";
        char letter = 'l';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        System.out.println("The letter '" + letter + "' appears " + count + " times in the string.");
        System.out.println("Find index of 'H': "+a.indexOf("H"));
        String s1 ="12345";  //"12345m"==>false
        //find string or not
        System.out.println("Is string numeric : "+s1.matches("[0-9]+"));
        //System.out.println("is string or not : "+s1.stripLeading());
        //find alpha or not
        System.out.println("Is string alpha : "+s1.matches("[a-zA-Z]+"));

   
        
        
    }
    
    
}



