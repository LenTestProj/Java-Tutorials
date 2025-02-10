public class Arithmetic {
    public static void main(String args[]){
        int num1 = 7;
        int num2 = 5;    
        int sum=num1+num2;
        int diff = num1-num2;
        int prod=num1*num2;
        float div=num1/num2;
        int remainder=num1%num2;
        System.out.printf("The operations like sum, diff, mul, div and remainder of the two numbers %d and %d is %d, %d,%d,%f and %d",num1,num2, sum,diff,prod,div,remainder);
    }   
}
