package org.dsa.datastructure.hashtable;

public class HashMain {
    public static void main(String[] args) {
        HashTable ht = new HashTable();
        ht.put("Hello",92);
        ht.put("World",37);
        System.out.println(ht.get("World"));

    }
}
