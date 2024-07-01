package org.dsa.datastructure.heap;

import java.util.ArrayList;
import java.util.List;

public class MinHeap {

  private List<Integer> minHeap;

  public MinHeap(){
    this.minHeap = new ArrayList<>();
  }
  public List<Integer> getMinHeap(){
    return new ArrayList<>(minHeap);
  }

  private int leftChild(int index){
   return 2*index +1;
  }
  private int rightChild(int index){
    return 2*index + 2;
  }
  private int parent(int index){
    return (index-1)/2;
  }
  private void swap(int index1, int index2){
    int temp = minHeap.get(index1);
    minHeap.set(index1,minHeap.get(index2));
    minHeap.set(index2, temp);
  }
  public void insertMinHeap(int value) {
    minHeap.add(value);
    int currentIndex = minHeap.size() - 1;
    while (currentIndex > 0 && minHeap.get(currentIndex) < minHeap.get(parent(currentIndex))) {
      swap(currentIndex, parent(currentIndex));
      currentIndex = parent(currentIndex);
    }
  }

  public Integer remove(){
    if(minHeap.size()==0) return null;
    if(minHeap.size()==1) return minHeap.remove(0);
    int minValue = minHeap.get(0);
    minHeap.set(0,minHeap.get(minHeap.size()-1));
    sinkDown(0);
    return  minValue;
  }

  public void sinkDown(int index){
    int minIndex = index;
    while(true){
    int rightChild = rightChild(index);
    int leftChild = leftChild(index);
    if(leftChild < minHeap.size() && minHeap.get(leftChild) < minHeap.get(minIndex)){
      minIndex = leftChild;
    }
      if(rightChild < minHeap.size() && minHeap.get(rightChild) < minHeap.get(minIndex)){
       minIndex = rightChild;
      }
      if(minIndex!=index){
        swap(index,minIndex);
        index = minIndex;
      }
      else return;
  }
  }
  }

