package org.dsa.leetcode.greedy;

import java.util.HashMap;
import java.util.Map;

public class LargestPermutation {
  public int[] solve(int[] A, int B) {
    int i = 0;
    int maxIndex = A.length;
    Map<Integer, Integer> indexMap = new HashMap<>();

    // Create a map to store the index of each element
    for (int j = 0; j < A.length; j++) {
      indexMap.put(A[j], j);
    }

    // Process the array
    while (B > 0 && i < A.length) {
      // Find the largest remaining element
      int largest = maxIndex;
      while (largest > 0 && !indexMap.containsKey(largest)) {
        largest--;
      }

      int j = indexMap.get(largest);

      if (i == j) {
        // If the current element is already in its correct position
        i++;
        maxIndex--;
        continue;
      } else {
        // Perform the swap
        B--;
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;

        // Update the indices in the map
        indexMap.put(A[i], i);
        indexMap.put(A[j], j);
      }

      i++;
      maxIndex--;
    }

    return A;
  }

  public static void main(String[] args) {
    LargestPermutation solution = new LargestPermutation();
    int[] A = {3, 2, 1};
    int B = 2;
    int[] result = solution.solve(A, B);
    for (int num : result) {
      System.out.print(num + " ");
    }
  }
}

