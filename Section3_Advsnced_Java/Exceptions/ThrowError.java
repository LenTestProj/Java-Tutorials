public class ThrowError {
    public static void main(String args[]){
        int i=20;
        int j=0;

        try { 
            j=18/i;
            if(j==0){
                throw new ArithmeticException("zero cannot be printed");
            }
        } catch (ArithmeticException e) {
           j=18/1; 
           System.out.println("Thats the default output "+e.getMessage());
        }
        catch(Exception e){
            System.out.println("The Error occured is: "+e.getMessage());
        }
        System.out.println(j);
        System.out.println("bye");
    }
} 
