class Human{
    private int age=11;
    private String name="hales";
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

public class ThisKeyword{
    public static void main(String args[]){
        Human obj = new Human();
        obj.setAge(15);
        obj.setName("James");
        System.out.println("The name is: "+obj.getName()+" and the age is: "+obj.getAge());
    }
}

