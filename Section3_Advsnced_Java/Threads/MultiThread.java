package Threads;

public class MultiThread {
    public static void main(String args[]){
       A obj1 = new A();
       B obj2 = new B();

       //priority is from range 1-10. 5 is default
    //    System.out.println(obj1.getPriority());
    //    System.out.println(obj2.getPriority());

        //set priority //this only suggests to gove max priority. The scheduler wont give directly the highest priority
        // obj2.setPriority(Thread.MAX_PRIORITY);

       obj1.start(); //firs tewxecutes this then the next line
       obj2.start();
    }
} 

class A extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

