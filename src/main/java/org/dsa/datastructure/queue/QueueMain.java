package org.dsa.datastructure.queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue queue = new Queue(75);
        queue.enQueue(65);
        queue.enQueue(37);
        queue.enQueue(23);
        queue.enQueue(44);
        queue.printQueue();
        System.out.println();
        System.out.println(queue.getFront().value+" "+queue.getRear().value+" "+queue.getLength()+" ");
        queue.deQueue();
        queue.deQueue();
        queue.printQueue();
        System.out.println();
        System.out.println(queue.getFront().value+" "+queue.getRear().value+" "+queue.getLength()+" ");
    }
}
