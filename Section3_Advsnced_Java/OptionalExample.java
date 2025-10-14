import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExample {
    public static void main(String args[]){ 
        List<String> names = Arrays.asList("Navin","Laxmi","John","Kishore");
    //     Optional<String> name = names.stream().filter(str->str.contains("z")).findFirst().orElse("Not Found");
    //     System.out.println(name.orElse("Not Found"));
    // }
        String name = names.stream().filter(str->str.contains("z")).findFirst().orElse("Not Found");
        System.out.println(name);
    }
} 


