import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String args[]){  
        Comparator<Integer> com = new Comparator<Integer>() {
           public int compare(Integer i, Integer j){
                if(i%10 > j%10){
                    return 1; //swap the numbers
                }
                else{
                    return -1; //do not swap the numbers
                }
           } 
        };

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);
        
        //default sorting
        Collections.sort(nums,com);

        System.out.println(nums);
    }
} 
