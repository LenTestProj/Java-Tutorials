import other.*;

class D extends A{
    public void abc(){
        System.out.println(marks);
    }
}

public class Packages{
    public static void main(String args[]){
        A obj = new A();
        System.out.println(obj.marks);

        C obj1 = new C();
        System.out.println(obj1.marks);
    }
}

