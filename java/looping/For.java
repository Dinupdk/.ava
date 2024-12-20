import java.util.ArrayList;
import java.util.List;

public class For {
    public static void main(String[] args) {
        // for(int i=0;i<15;i++){
        //     System.out.println(i);
        // }
        // create array
        int[] arr = {1, 2, 3, 4, 5,
            6, 7, 8, 9, 10,
            11, 12, 13, 14, 15};
            //length of arr

           //sum of array in loop
           int sum = 0;
           for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            }
            int avg=sum/arr.length;
            System.out.println("Sum of array is: " + sum);
            System.out.println("avg : "+avg);
            List<String> list = new ArrayList<>();
            list.add("Hii");

        //here, write different operations in List
      
        // Displaying the List
        System.out.println("List elements: " + list);

    }
    
}
//list in java
/*
 

 */
