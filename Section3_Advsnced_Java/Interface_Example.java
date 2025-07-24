interface Computer{
    void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Code, compile and run faster");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Code, compile and run");
    }    
}

class Developer{
    public void devApp(Computer lap){
        System.out.println("Coding...");
        lap.code();
    }
}

public class Interface_Example {
    public static void main(String args[]){
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer navin = new Developer();
        navin.devApp(desk);
    }
}
