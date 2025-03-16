class M{
    public void show(){
        System.out.println("In M show");
    }
}

class N extends M{
    public void show(){
        System.out.println("In N show");
    }
    public void hide(){
        System.out.println("In N hide");
    }
}

class O extends M{
    public void show(){
        System.out.println("In O show");
    }
}


    

public class DynamicPolymorphism{
    public static void main(String args[]){
        M obj = new M();
        obj.show();

        obj = new N();
        obj.show();

        obj = new O();
        obj.show();
        
    }
}

