package Exceptions;
public class TryCatch {
    public static void main(String args[]){
        int i=0;
        int j=0;
        try {
            j=18/i;
        } catch (Exception e) {
            System.out.println("The Error Occured is: "+e.getLocalizedMessage());
        }
        finally{
            System.out.println(j);
            System.out.println("bye");
        }
    }
} 
