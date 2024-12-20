public class For {
    public static void main(String[] args) {
        
String a = "A#b#C "; 
String[] b = a.split("#"); 

for( int i = 0; i < b.length; i++)
{
System.out.println(b[i]);
}
System.out.println(b);
    
}
}
