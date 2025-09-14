
public class Annotations {
    public static void main(String args[]){
        B obj = new B();
        obj.showTheDateWhichBelongsToTisClass();
    }
}

class A{
    public void showTheDateWhichBelongsToTisClass(){
        System.out.println("In A show");
    }
}
class B extends A{
    @Override
    public void showTheDateWhichBelongsToTisClass(){
        System.out.println("In B Show");
    }
}

