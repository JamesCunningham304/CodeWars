import java.util.*;
import java.lang.Math;

public class AreSame {
	
	public static boolean comp(int[] a, int[] b) {
    if(a == null){
      return false;
    }
    if(b == null){
      return false;
    }
      if(a.length == 0 && b.length != 0){
        return false;
      }
      if(a.length == 0 && b.length == 0){
        return true;
      }
      if(a.length != b.length){
        return false;
      }
        int[] sortedA = new int[a.length];
        int[] sortedB = new int[b.length];
        for(int i = 0; i < a.length;i++){
            sortedA[i] = Math.abs(a[i]);
        }
        for(int i = 0; i < b.length;i++){
            sortedB[i] = Math.abs(b[i]);
        }
      Arrays.sort(sortedA);
      Arrays.sort(sortedB);
      int counter = 0;
      for(int i = 0; i < a.length; i++){
        if(sortedB[i] == sortedA[i]*sortedA[i]){
          counter++;
        } 
      }
    if(counter == sortedA.length){
      return true;
    }
      
    
    
    return false;
  }
}
