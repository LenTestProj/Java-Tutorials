public class LinkedListMain{
    public static void main(String[] args){
        LinkedList nums = new LinkedList();
        nums.add(5);
        nums.add(9);

        nums.add(6); //add to the start of the linkedlist
        
        nums.addFirst(7);
        // System.out.println(nums.get(2));

        // nums.peek();

        nums.printValues();

        nums.delete(7);

        nums.printValues();
    }
}

