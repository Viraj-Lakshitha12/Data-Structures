package lk.ijse.gdse.queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);

        System.out.println("deQueue : "+queue.deQueue());
        System.out.println("deQueue : "+queue.deQueue());

        System.out.println("peek : "+queue.peek());

        queue.printQueue();

        System.out.println("Size : "+queue.size());
    }

}
