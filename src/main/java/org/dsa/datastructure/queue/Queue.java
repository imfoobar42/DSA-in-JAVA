package org.dsa.datastructure.queue;

public class Queue {
   private Node front;
    private Node rear;
    private  int length;

    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    public  Queue(int value){
        Node newNode = new Node(value);
        front = newNode;
        rear = newNode;
        ++length;
    }

    public int getLength() {
        return length;
    }

    public Node getFront() {
        return front;
    }

    public Node getRear() {
        return rear;
    }

    //insert , delete
    public void enQueue(int value){ //insertion at Rear
        Node tempNode = new Node(value);
        if(length==0){
            front = tempNode;
            rear = tempNode;
        }
        else {
            rear.next = tempNode;
            rear = tempNode;
        }
        ++length;
    }
    public Node deQueue(){   //Deletion at front
        //(front==rear) can create confusion -> for only 1 element and no element
        if (length==0) return null;
        Node temp = front;
        if(length==1){ //Edge case when only 1 value present
            front = null;
            rear = null;
        }else{
            front = front.next;
            temp.next = null;
        }
        --length;
        return  temp;
    }

    public void printQueue(){
        Node temp = front;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
    }
}

