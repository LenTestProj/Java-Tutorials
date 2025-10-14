import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String args[]){ 
        List<String> names = Arrays.asList("Navin","Harsh","John");
        
        List<Student> students = new ArrayList<>();

        for(String name:names){
            students.add(new Student(name));
        }

        List<Student> students1 = names.stream().map(name->new Student(name)).collect(Collectors.toList());

        List<Student> students2 = names.stream().map(Student::new).collect(Collectors.toList());

        System.out.println(students);

        System.out.println(students1);
    
        System.out.println(students2);
    }
} 

class Student{
    private String name;
    private int age;
    public Student(){

    }
    
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    public Student(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

