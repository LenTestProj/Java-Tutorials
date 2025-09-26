public class LambdaExpression2 {
    // public static void main(String args[]){
    //     A obj =  new A(){
    //         public int add(int i,int j){
    //             return i+j;
    //         } 
    //     };
    //     System.out.println("The sum of 5 and 4 is "+obj.add(5,4));
    // }
    public static void main(String args[]){
        A obj =  (i, j)-> i+j; 
        System.out.println("The sum of 5 and 4 is "+obj.add(5,4));
    }
} 

@FunctionalInterface //annotations which will make sure it is only Single abstract interface
interface A{
    int add(int i, int j);
}

// class B implements A{
//     public void show(){
//         System.out.println("In Show");    
//     }
// }
