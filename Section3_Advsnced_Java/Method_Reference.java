import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Method_Reference {
    public static void main(String args[]){ 
        List<String> names = Arrays.asList("Navin","Harsh","John");
        
        List<String> vNames = names.stream().map(String::toUpperCase).toList();

        List<String> uNames = names.stream().map(name->name.toUpperCase()).collect((Collectors.toList()));

        // System.out.println(uNames);

        //tell java to print each element
        uNames.forEach(System.out::println);
    }
} 


