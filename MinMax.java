// Story
// Ben has a very simple idea to make some profit: he buys something and sells it again. Of course, 
// this wouldn't give him any profit at all if he was simply to buy and sell it at the same price. Instead, he's going to buy it 
// for the lowest possible price and sell it at the highest.

// Task
// Write a function that returns both the minimum and maximum number of the given list/array.

import java.util.*;
class MinMax {
    public static int[] minMax(int[] arr) {
        Arrays.sort(arr);
        int [] array2 = new int [2];
        array2[0] = arr[0];
        array2[1] = arr[arr.length-1];
        return array2;
    }
}