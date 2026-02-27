public class QueueMain {
    public static void main(String[] args){
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(5);
        queue.enqueue(99);

        System.out.println(queue.dequeue());
        queue.enqueue(12);
        queue.enqueue(32);
        // queue.show();

        System.out.println("Peek "+queue.peek());

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}

