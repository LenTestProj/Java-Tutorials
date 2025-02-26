class Calculator{
    public int add(){
        System.out.println("In add");
        return 0;
    }
}

public class Hello{
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("Navin");
        System.out.println(sb.capacity());
        sb.append(" Naik");
        sb.deleteCharAt(2);
        System.out.println(sb);
    }
}

