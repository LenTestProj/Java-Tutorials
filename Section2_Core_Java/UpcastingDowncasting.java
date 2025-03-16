class A{
    public void show1(){
        System.out.println("In A Show");
    }
}

class B extends A{
    public void show2(){
        System.out.println("In B Show");
    }
}

public class UpcastingDowncasting{
    public static void main(String args[]){
        // double d = 4.5;
        // int i=(int)d; //type casting

        // System.out.println(i);
        
        //UPCASTING
        A obj = (A) new B();
        obj.show1();

        //DOWNCASTING
        B obj1 = (B) obj;
        obj1.show2();
        // obj.show2();
    }
}

