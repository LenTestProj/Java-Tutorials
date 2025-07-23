abstract class Car{
    public abstract void drive();
    public abstract void fly();

    public void playMusic(){
        System.out.println("Play music");
    }
}

abstract class WagonR extends Car{
    public void drive(){
        System.out.println("Driving...");
    }
}

class UpdateWagonR extends WagonR{ //concrete class

    public void fly() {
       System.out.println("Flying...");
    }
    
}

public class AbstractClass {
    public static void main(String args[]){
        //you cannot create instance of abstract class
        Car obj = new UpdateWagonR();//cannot create Object of abstract class
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}

