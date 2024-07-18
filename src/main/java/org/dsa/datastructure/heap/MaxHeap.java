package org.dsa.datastructure.heap;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("SequencedCollectionMethodCanBeUsed")
public class MaxHeap {
  private List<Integer> heap;

  public MaxHeap(){
    this.heap = new ArrayList<>();
  }
  public List<Integer> getHeap(){
    return  new ArrayList<>(heap);
  }
  //pvt methods - parent, lchild, rchild
  private int getParentIndex(int childIndex){
    return (childIndex-1)/2;
  }
  private int getLeftChild(int parentIndex){
    return 2*parentIndex+1;
  }

  private int getRightChild(int parentIndex){
    return 2*parentIndex+2;
  }
  private void swap(int index1, int index2){
    int temp = heap.get(index2);
   heap.set(index2, heap.get(index1));
   heap.set(index1, temp);
  }
  public void insert(int value){
    heap.add(value);
    //need to compare with its parent
    int current = heap.size()-1;
   while(current>0 && heap.get(current) > heap.get(getParentIndex(current))){
      swap(current,getParentIndex(current));
      current = getParentIndex(current);
    }
  }
  public Integer remove(){
    if(heap.size()==0) return null;
    if(heap.size()==1) return heap.remove(0);
    int max = heap.get(0);
    heap.set(0,heap.remove(heap.size()-1));
    sinkDown(0);
    return max;
  }

  private void sinkDown(int index) {
    int maxIndex = index;
    while(true){
      int leftIndex = getLeftChild(index);
      int rightIndex = getRightChild(index);
      //assign maxIndex to maxValue
      if(leftIndex<heap.size() && heap.get(leftIndex)> heap.get(maxIndex)){
        maxIndex = leftIndex;
      }
      if (rightIndex< heap.size() && heap.get(rightIndex)> heap.get(maxIndex)){
        maxIndex = rightIndex;
      }
      if(maxIndex!=index){
        swap(index,maxIndex);
        index = maxIndex;
      }else return;
    }

  }


}