class A{
    public A(){
        System.out.println("In A");
    }
    public A(int n){
        System.out.println("In A int");
    }
}

class B extends A{
    public B(){
        // super(5);
        super();
        System.out.println("In B");
    }
    public B(int n){
        this(); //will call teh constructor of the same class
        // super(5);
        System.out.println("In B int");
    }
}



public class Super{
    public static void main(String args[]){
       B obj = new B(5);
    }
}


