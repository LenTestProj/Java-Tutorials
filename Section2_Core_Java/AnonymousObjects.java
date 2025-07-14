class A{
    public A(){
        System.out.println("Object created");
    }

    public void show(){
        System.out.println("In A Show");
    }
}

public class AnonymousObjects{
    public static void main(String args[]){
        //A a = new A() //referrence For Object
        new A(); //Object creation
    }
}

