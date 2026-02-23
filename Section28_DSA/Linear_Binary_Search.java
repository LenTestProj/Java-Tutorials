public class Linear_Binary_Search {
    public static void main(String[] args){
        // int nums[] = {1,2,3,5,7,9,10,11,13};
        int nums[] = new int[16];
        int target = 13;

        // int result1 = linearSearch(nums, target);
        int result2 = binarySearch(nums,target,0,nums.length-1);
    
        if(result2 != -1){
             System.out.println("Element found at result:  "+result2);
        }
        else{
             System.out.println("Element not found");
        }
    }

    public static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for(int i=0;i<nums.length;i++){
            steps++;
            if(nums[i] == target){
                System.out.println("The steps taken by linear: "+steps);
                return i;
            }
        }
        System.out.println("The steps taken by linear: "+steps);
        return -1;
    }   

    public static int binarySearch(int[] nums, int target, int left, int right) {
        //5,7,9,11,13
     
        if(left  <= right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                left = mid+1;
            }
            else{
                right=mid-1;
            }
            return binarySearch(nums, target, left, right);
        }
        return -1;
    }
    
    public static int binarySearchNonRecursive(int[] nums, int target) {
        //5,7,9,11,13
        int steps=0;
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            steps++;
            int mid = (left+right)/2;
            if(nums[mid] == target){
                System.out.println("The steps taken by Binary: "+steps);
                return mid;
            }
            else if(nums[mid] < target){
                left = mid+1;
            }
            else{
                right = mid -1;
            }
        }
        System.out.println("The steps taken by Binary: "+steps);
        return -1;
    }
}

