public class TryMultipleCatch {
    public static void main(String args[]){
        int i=2;
        int j=0;
        int nums[] = new int[5];
        String str = null;

        try {
            j=18/i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        } catch (ArithmeticException e) {
            System.out.println("The Arithmetic Error Occured is: "+e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The Array Index Out of Bounds Error Occured is: "+e.getMessage());
        }
        catch(Exception e){
            System.out.println("The Error occured is: "+e.getMessage());
        }
        System.out.println(j);
        System.out.println("bye");
    }
} 
