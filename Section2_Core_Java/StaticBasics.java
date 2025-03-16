class Mobile{
    String brand;
    int price;
    String network;
    static String name;

    public void show(){
        System.out.println(brand+", "+price+", "+name);
    }

    public static void show1(){
        System.out.println("In static method");
        //System.out.println(brand+", "+price+", "+name); You cannot use a non-static variable as a static variable
    }

    public static void show2(Mobile obj1){
        System.out.println("In static method");
        System.out.println(obj1.brand+", "+obj1.price+", "+name); 
    }
}

public class StaticBasics{
    public static void main(String args[]){
        //Static variables
        Mobile obj1 = new Mobile(); 
        obj1.brand = "Apple";
        obj1.price=1500;
        // obj1.name="Smartphone";
        
        Mobile obj2 = new Mobile(); 
        obj2.brand = "Samsung";
        obj2.price=1600;
        // obj2.name="Smartphone";

        Mobile.name="phones";

        obj1.show();
        obj2.show(); 
        
        Mobile.show1();

        Mobile.show2(obj1);
    }
}

