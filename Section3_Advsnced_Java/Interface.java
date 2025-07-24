interface A{
    //default methods are public
    int age=14;  //variables by default final and static
    String area="Medium";
    
    void show();
    void config();
}
interface X{
    void run();
}

interface Y extends X{

}

//implement only implements methods not variables
class B implements A,Y{
    public void show(){
        System.out.println("In Show");
    }
    public void config(){
        System.out.println("In Config");   
    }
    public void run(){
        System.out.println("In Run");
    }
}

public class Interface {
    public static void main(String args[]){
        A obj;
        obj = new B();
        obj.show();
        obj.config();
        
        X obj1 = new B();
        obj1.run();
        System.out.println(A.area);
    }
}
