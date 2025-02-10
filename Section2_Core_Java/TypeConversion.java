public class TypeConversion {
    public static void main(String args[]){
        byte b = 127;
        int a = b;

        System.out.println("The value of a is "+a);

        int a1 = 356;
        byte k = (byte)a1;

        System.out.println("The value of k is "+k);
        //The output is 100. It takes the remainder when you convert integeer to a byte

        float f=5.6f;
        int t=(int)f;
        System.out.println("The value for t is: "+t);


        //TYPE Promotions
        byte val1 = 10;
        byte val2 = 30;
        int result = val1*val2;
        System.out.printf("The result of %d and %d is %d \n",val1,val2,result);


        //data types
        // int num1 = 9;
        // byte by = 127;
        // short sh = 558;
        // long l = 5854l;

        // float f = 5.8f;
        // double d = 5.8;

        // char c = 'k';

        // boolean b = true;

        // int num1 = 3;
        // int num2 = 5;
        // int result = num1+num2;
        // System.out.println("The sum of two numbers "+num1+" and "+num2+" is "+result);
    }   
}
