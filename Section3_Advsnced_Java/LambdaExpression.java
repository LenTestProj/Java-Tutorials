public class LambdaExpression {
    public static void main(String args[]){
        A obj =  i -> System.out.println("The value of i is "+i); 
        obj.show(5);
    }
} 

@FunctionalInterface //annotations which will make sure it is only Single abstract interface
interface A{
    void show(int i);
}

// class B implements A{
//     public void show(){
//         System.out.println("In Show");    
//     }
// }
