class Human{
    private int age=11;
    private String name="hales";

    public Human(){
        age=12;
        name="Jim";
        System.out.println("In Constructor");
    }

    public Human(int a, String n){
        age=a;  
        name=n; 
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

   
}

public class Constructors{
    public static void main(String args[]){
        Human obj = new Human();//default constructor
        // obj.setAge(15);
        // obj.setName("James");
        System.out.println("The name is: "+obj.getName()+" and the age is: "+obj.getAge());

        Human obj1 = new Human(18,"James"); //parametrized constructor
        // obj.setAge(15);
        // obj.setName("James");
        System.out.println("The name is: "+obj1.getName()+" and the age is: "+obj1.getAge());
    }
}


