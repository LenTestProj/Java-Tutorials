
public class ExampleFunctionalInterface {
    public static void main(String args[]){
        A obj =  new A(){
            public void show(){
                System.out.println("In show");
            } 
        }; 
        obj.show();
    }
}

@FunctionalInterface //annotations which will make sure it is only Single abstract interface
interface A{
    void show();
}

// class B implements A{
//     public void show(){
//         System.out.println("In Show");    
//     }
// }
