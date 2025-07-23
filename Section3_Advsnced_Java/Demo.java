class A{
    public void show(){
        System.out.println("In A Show");
    }
}

public class Demo {
    public static void main(String args[]){
        A obj = new A(){
            public void show(){
                System.out.println("In New Show");
            }
        };
        obj.show();
        // obj.display();
    }
}
