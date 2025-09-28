
enum Status{
    Running, Failed, Pending, Success
}

public class Enum2 {
    public static void main(String args[]){
        Status s = Status.Success;
        System.out.println(s.getClass());
        switch (s) {
            case Running:
                System.out.println("Running");
                break;
            case Failed:
                System.out.println("Failed");
                break;
            case Pending:
                System.out.println("Pending");
                break;
            case Success:
                System.out.println("Success");
                break;            
            default:
                System.out.println("Done");
                break;
        }
    }
}
