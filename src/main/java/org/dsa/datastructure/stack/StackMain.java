package org.dsa.datastructure.stack;

public class StackMain {
    public static void main(String[] args) {
        Stack myStack = new Stack(78);
        myStack.push(20);
        myStack.push(89);
     //   System.out.println(myStack.pop());
        myStack.push(37);
        myStack.push(32);
    //    System.out.println(myStack.getTop());
        myStack.printStack();
    }
}
