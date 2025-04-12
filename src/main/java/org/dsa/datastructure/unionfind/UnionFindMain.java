
// Implement UnionFind
// UnionFind is a data structure that keeps track of elements which are split into one or more disjoint sets.
// It supports union and find operations.
// The union operation merges two sets into a single set.
// The find operation determines which set a particular element is in.
// This can be useful for determining if two elements are in the same set.
public class UnionFindMain {
  public static void main(String[] args) {
    UnionFind uf = new UnionFind(10);
        uf.union(1, 2);
        uf.union(2, 5);
        uf.union(5, 6);
        uf.union(6, 7);
        uf.union(3, 8);
        uf.union(8, 9);
        System.out.println(uf.connected(1, 5)); // true
        System.out.println(uf.connected(5, 7)); // true
        System.out.println(uf.connected(4, 9)); // false
        // 1-2-5-6-7 3-8-9-4
        uf.union(9, 4);
        System.out.println(uf.connected(4, 9)); // true
    }
  }
  
