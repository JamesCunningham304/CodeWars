// Given an array of integers, find the one that appears an odd number of times.

// There will always be only one integer that appears an odd number of times.



import java.util.*;
public class FindOdd {
  public static int findIt(int[] a) {
    List<Integer> intList = new ArrayList<Integer>(a.length);
    for (int i : a)
      {
    intList.add(i);
  }
    for(int i = 0; i < a.length;i++){
      if(Collections.frequency(intList, a[i]) % 2 == 1){
      return a[i];
    }
    
   }
  return -1;
  }
}