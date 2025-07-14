class Human{
    private int age=11;
    private String name="hales";

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
}

public class GetSetPrivateVariables{
    public static void main(String args[]){
        Human obj = new Human();
        System.out.println("The name is: "+obj.getName()+" and the age is: "+obj.getAge());
    }
}


