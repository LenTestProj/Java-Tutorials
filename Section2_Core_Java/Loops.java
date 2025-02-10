public class Loops {
    public static void main(String args[]){
        //while loop
        int i=1;
        while(i<=5){
            int j=1;
            System.out.println("The value of i in while loop is "+i);
            while(j<=5){
                System.out.println("The value of j in while loop is: "+j);
                j++;
            }
            System.out.print("\n");
            i++;
        }
        System.out.println("Bye while loop");


        //Do-while loop
        System.out.println("-------DO WHILE LOOP ---------------");
        int a=1;
        do{
            System.out.println("The value of a in do-while loop is: "+a);
            a++;
        }while(a<=4);

        //For loop
        System.out.println("-------FOR LOOP ---------------\n");
        for(int y=1;y<=7;y++){
            System.out.println("Day "+y);
            for(int z=9;z<18;z++){
                System.out.println(z+" - "+(z+1));
            }
            System.out.println();
        }

    } 
}
