package org.dsa.datastructure.hashtable;

public class HashTable {
    private int size = 7;
    private Node[] dataMap;

    class Node {

        //Node is made of key and Value
        String key;
        int value;
        Node next;
        Node(String key, int value){
            this.key    =  key;
            this.value  =   value;
        }
    }
        public HashTable(){
            dataMap = new Node[size];
        }
    private int hash(String key) {
        int hash = 0;
        int prime = 31;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash * prime + key.charAt(i)) % size;
        }
        return hash;
    }

    public void put(String key, int value) {
        int index = hash(key);
            Node newNode = new Node(key,value);
            if(dataMap[index]==null){
                dataMap[index] = newNode;
            }
            else {
                Node temp = dataMap[index];
                while(temp.next!=null){
                    temp = temp.next ;
                }
                temp.next = newNode;
            }
        }
        public int get(String key){
        int index = hash(key);
        Node temp = dataMap[index];
        while (temp!=null){
            if (temp.key == key) return temp.value;
             temp = temp.next;
        }
        return  0;

        }
    }
