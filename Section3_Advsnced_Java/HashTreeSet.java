// import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashTreeSet {
    public static void main(String args[]){
        // Set<Integer> nums = new HashSet<Integer>() ; //does not take duplicate values but sorts them in a different order not a sorted order

        Set<Integer> nums = new TreeSet<Integer>() ; //sthis sort sorts the elemets in ascending order
        nums.add(62); 
        nums.add(54); 
        nums.add(82); 
        nums.add(21);  

        Iterator<Integer> values = nums.iterator();

        while(values.hasNext()){
            System.out.println(values.next());
        }



        // System.out.println(values.next());

        // for(int n:nums){
        //     System.out.println(n);
        // }
    }
} 

