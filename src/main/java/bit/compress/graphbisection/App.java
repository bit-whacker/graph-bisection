package bit.compress.graphbisection;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App {
  
    public static void main( String[] args ) {
      
      int[] D = {1, 2, 3, 4};
      
      Map<Integer, Integer[]> adjacencyList = new HashMap<Integer, Integer[]>();
      adjacencyList.put(1, new Integer[]{2, 3});
      adjacencyList.put(2, new Integer[]{1, 3});
      adjacencyList.put(3, new Integer[]{1, 2, 4});
      adjacencyList.put(4, new Integer[]{3});
      
      
      System.out.println("Before Reordering");
      printD(D);
      
      new GraphReordering(D, adjacencyList);
      
      System.out.println("After Reordering");
      printD(D);
    }
    
    private static void printD(int[] D){
      for(int v : D){
        System.out.print( v + "\t");
      }
      System.out.println();
    }
}
