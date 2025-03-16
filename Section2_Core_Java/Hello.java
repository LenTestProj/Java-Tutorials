public class Hello{
    public static void main(String args[]){
        int num = 7;
        // Integer num1 = new Integer(num); //BOXING

        Integer num1 = num;
        int num2 = num1.intValue();

        int num3 = num1; //auto unboxing
        System.out.println(num2);
        System.out.println(num3);

        String str = "12";
        int num4 = Integer.parseInt(str);
        System.out.println(num4*2);
    }
}

