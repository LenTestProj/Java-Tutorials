
public class Arrays{
    public static void main(String args[]){
        int nums1[] = {3,7,2,4};
        nums1[1] = 6;
        
        int nums[] = new int[4];
        nums[0]=4;
        nums[1]=8;
        nums[2]=3;
        nums[3]=9;
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);   
        }
    }
}

