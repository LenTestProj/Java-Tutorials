

final class Calc{
    //final methods cannot be overriden
    final public void show(){
        System.out.println(("In Calc Show"));
    }

    public void add(int a, int b){
       System.out.println(a+b);  
    }
}

//final class cannot be inherited
class AdvClass extends Calc{
    public void show(){
        System.out.println(("In AdvCalc Show"));
    }
}

public class FinalKeyword{
    public static void main(String args[]){
        Calc obj = new Calc();
        obj.show();
        obj.add(4,5);
    }
}

