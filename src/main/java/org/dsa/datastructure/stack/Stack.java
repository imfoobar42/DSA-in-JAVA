package org.dsa.datastructure.stack;

//Implement Stack
public class Stack {
    private  Node top;
    private int height;

    class Node{

        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    public Stack(int value){
        Node newNode = new Node(value);
        height = 1;
    }

    public int getHeight() {
        return height;
    }

    public int getTop() {
        return top.value;
    }
    public void push(int value){
        Node node = new Node(value);
        if(top==null)  top = node;
        else {
            node.next = top;
            top = node;
        }
        ++height;
    }
    public int pop(){
        if(top==null) return 0;
        Node temp = top;
        top = top.next;
        --height;
        return temp.value;
    }
}
