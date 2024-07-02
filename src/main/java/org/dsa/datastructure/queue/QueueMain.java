package org.dsa.datastructure.queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue queue = new Queue(75);
        queue.insert(65);
        queue.insert(37);
        queue.insert(23);
        queue.insert(44);
        queue.printQueue();
        System.out.println();
        System.out.println(queue.getFront().value+" "+queue.getRear().value+" "+queue.getLength()+" ");
        queue.delete();
        queue.delete();
        queue.printQueue();
        System.out.println();
        System.out.println(queue.getFront().value+" "+queue.getRear().value+" "+queue.getLength()+" ");
    }
}
