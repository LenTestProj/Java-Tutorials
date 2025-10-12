import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lists {
    public static void main(String args[]){
        List<Integer> nums = new ArrayList<Integer>() ;
        nums.add(6); 
        nums.add(5); 
        nums.add(8); 
        nums.add(2);  
        nums.add(6);

        System.out.println(nums.get(2));
        // for(int n:nums){
        //     System.out.println(n);
        // }

        System.out.println("The index for the element 2 is "+nums.indexOf(2));

        for(int i=0;i<nums.size();i++){
            System.out.println("The element at position "+i+" is "+nums.get(i));
        }

        //prints all the values
        System.out.println(nums);
    }
} 

