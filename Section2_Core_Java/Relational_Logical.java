public class Relational_Logical {
    public static void main(String args[]){
        int x=6;
        int y=6;
        boolean result = x>=y;
        System.out.println(result);   
        
        int a=4;
        int b=3;
        boolean result1= a<b;
        System.out.println(result1);

        int e=5;
        int f=5;
        boolean notEqual = e!=f;
        boolean equal = e==f;
        System.out.println("Not equal value is: "+notEqual);
        System.out.println("Equal is "+equal);

        double c=3.56;
        double d=2.45;
        boolean doubleCheck = a>b || a<c;
        System.out.println("The result of double Equal is: "+doubleCheck);

    }
}
