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
        top = newNode;
        height = 1;
    }

    public int getHeight() {
        return height;
    }

    public int getTop() {
        return top.value;
    }
    public void push(int value){ //Similar to prepending an item in LL
        Node node = new Node(value);
        if(top==null)  top = node;
        else {
            node.next = top;
            top = node;
        }
        ++height;
    }
    public Node pop(){
        if(top==null) return null;
        Node temp = top;
        top = top.next;
        temp.next = null;
        --height;
        return temp;
    }
    public void printStack(){
        Node temp = top;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
