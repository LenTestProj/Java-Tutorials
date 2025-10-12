import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
// import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableExample {
    public static void main(String args[]){  
        Comparator<Student> com = ( i, j) -> i.age > j.age?1:-1;

        List<Student> studs = new ArrayList<Student>();
        studs.add(new Student(21,"Navin"));
        studs.add(new Student(12,"John"));
        studs.add(new Student(18,"Parul"));
        studs.add(new Student(20,"Kiran"));
        
        // Collections.sort(studs,com);
        Collections.sort(studs);

        for(Student s:studs){
            System.out.println(s);
        }
    }
} 

class Student implements Comparable<Student>{
    int age;
    String name;
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public int compareTo(Student that) {
        if(this.age > that.age){
            return 1;
        }
        else{
            return -1;
        }
    }
}