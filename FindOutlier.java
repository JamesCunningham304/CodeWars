// You are given an array (which will have a length of at least 3, but could be very large) containing integers. 
// The array is either entirely comprised of odd integers or
// entirely comprised of even integers except for a single integer N. 
// Write a method that takes the array as an argument and returns this "outlier" N.


import java.lang.Math;
public class FindOutlier{
  static int find(int[] integers){
    if(Math.abs(integers[0]) % 2 == 0 && Math.abs(integers[1]) % 2 == 0 ){
      for(int i = 0; i < integers.length;i++){
      if(Math.abs(integers[i]) % 2 == 1){
        return integers[i];
      }
  }
    }
     if(Math.abs(integers[0]) % 2 == 1 && Math.abs(integers[1]) % 2 == 1 ){
      for(int i = 0; i < integers.length;i++){
      if(Math.abs(integers[i]) % 2 == 0){
        return integers[i];
      }
  }
    }
    if((Math.abs(integers[1]) % 2 == 0 && Math.abs(integers[2]) % 2 == 1) || 
       (Math.abs(integers[1]) % 2 == 1 && Math.abs(integers[2]) % 2 == 0)){
      return integers[1];
    } else {
      return integers[0];
    }
      