class Mobile{
    String brand;
    int price;
    String network;
    static String name;

    static{
        name="Phone";
        System.out.println("In staitc block"); //Static block will call only once
    }

    public Mobile(){
        brand="";
        price=200;
        System.out.println("In Constructor");
        // name="Phone";
    }

    public void show(){
        System.out.println(brand+", "+price+", "+name);
    }
}

public class StaticBlock{
    public static void main(String args[]) throws ClassNotFoundException{
        Class.forName("Mobile");

        //Static variables
        // Mobile obj1 = new Mobile(); 
        // obj1.brand = "Apple";
        // obj1.price=1500;
        // Mobile.name="Smartphone";
        
        // Mobile obj2 = new Mobile();

        //Class loader gets called first then the objects are created
    }
}


