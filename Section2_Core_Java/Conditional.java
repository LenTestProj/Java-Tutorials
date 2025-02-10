public class Conditional {
    public static void main(String args[]){
        //Basic If else
        int x=20;
        if(x>10 || x<=20){
            System.out.println(("hello"));
        }
        else{
            System.out.println("Bye");
        }

        //Nested If-Else
        int a=8;
        int b=10;
        int c=12;
        if(a>b && a>c){
            System.out.println(a+" x is the largest");
        }
        else if(b>a && b>c){
            System.out.println(b+ " is the largest");
        }
        else{
            System.out.println(c+ " is the largest");
        }

        System.out.println();

        //Ternanry Operator
        int n=5;
        String res="";
        res = n%2==0?"Even":"Odd";
        System.out.println(n+" is an "+res+" number");
        System.out.println();

        //Switch Statement
        int value=5;
        switch(value){
            case (1):
                System.out.println("MONDAY");
                break;
            case (2):
                System.out.println("TUESDAY");
                break;
            case (3):
                System.out.println("WEDNESDAY");
                break;
            case (4):
                System.out.println("THURSDAY");
                break;
            case (5):
                System.out.println("FRIDAY");
                break;
            case (6):
                System.out.println("SATURDAY");
                break;  
            default:
                System.out.println("SUNDAY");    
        }
    }    
}
