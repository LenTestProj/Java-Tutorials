enum Status{
    Running, Failed, Pending, Success
}


public class Enum {
    public static void main(String args[]){
        Status s = Status.Running;
        Status[] values = Status.values();

        System.out.println(s);

        for(Status sval:values){
            System.out.println(sval+":"+sval.ordinal());
        }
        
    }
}
