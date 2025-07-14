class Calculator{
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }

    public int add(int n1, int n2){
        return n1+n2;
    }
     
}

public class Method_Overloading{
    public static void main(String args[]){
        Calculator cal = new Calculator();
        int sumThree = cal.add(2,3, 4); 
        int sumTwo = cal.add(2,3);
        System.out.println("THe sum of two numbers is "+sumTwo+" and the sum of threen numbers is: "+sumThree);   
    }
}

