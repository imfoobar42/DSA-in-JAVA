package org.dsa.datastructure.graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    protected HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    public  HashMap<String, ArrayList<String>> getAdjList() {
        return adjList;
    }
    public void printGraph(){
        System.out.println(adjList);
    }
    //addVertex - remove Vertex
    //addEdge - removeEdge
    public void addVertex(String vertex){
        if(adjList.get(vertex)==null){
            adjList.put(vertex, new ArrayList<String>());
        }
    }
    public boolean addEdge(String vertex1, String vertex2){
       if(adjList.get(vertex1)!=null && adjList.get(vertex2)!=null){
        adjList.get(vertex1).add(vertex2);
        adjList.get(vertex2).add(vertex1);
       return true;
       }
        return false;
    }
    public boolean removeEdge(String vertex1, String vertex2) {
    if(adjList.get(vertex1)!=null && adjList.get(vertex2)!=null){
        adjList.get(vertex1).remove(vertex2);
        adjList.get(vertex2).remove(vertex1);
        return true;
    }
        return false;
    }
    public boolean removeVertex(String vertex) {
        if (adjList.get(vertex) == null) return  true; //if Vertex already not present
        for (String otherVertex : adjList.get(vertex)) { //Iterating over the vertices one at a time
                adjList.get(otherVertex).remove(vertex);
            }
        adjList.remove(vertex); //removing the vertex finally
          return false;
    }

    public static void main(String[] args) {
        Graph myGraph = new Graph();
        myGraph.addVertex("A");
        myGraph.addVertex("Z");
        myGraph.addVertex("B");
       // myGraph.printGraph();
        myGraph.addEdge("B","Z");
        myGraph.addEdge("A","Z");
        myGraph.addEdge("B","A");
        myGraph.printGraph();
    }

}
