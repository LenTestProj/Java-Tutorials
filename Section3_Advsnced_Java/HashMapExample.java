import java.util.HashMap;
// import java.util.Hashtable;
import java.util.Map;

public class HashMapExample {
    public static void main(String args[]){
        // Map<String, Integer> students1 = new Hashtable<>();
        Map<String, Integer> students = new HashMap<>(); //OBJECTS
        students.put("Navin", 56);
        students.put("Harsh", 23);
        students.put("Sushil", 67);
        students.put("Kiran", 92);
        students.put("Harsh", 45);

        System.out.println(students);//print all values

        System.out.println(students.get("Navin"));//print particlar value fo a particular key

        System.out.println(students.keySet());

        System.out.println("print all values");

        for(String key : students.keySet()){
            System.out.println(key+ ":" +students.get(key));
        }

    }
} 

