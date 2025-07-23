class A{
    int age;

    public void show(){
        System.out.println("In Show");
    }

    class B{
        public void config(){
            System.out.println("In config");
        }     
    }
    static class C{
        public void config(){
            System.out.println("Inside static class");
        }
    }
}


public class InnerClass {
    public static void main(String args[]){
       A obj = new A();
       obj.show();

       A.B obj1 = obj.new B();
       obj1.config();

       //static inner class
       A.C obj2 = new A.C();
       obj2.config();
    }
}

