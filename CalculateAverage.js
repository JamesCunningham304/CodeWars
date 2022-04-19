// Write a function which calculates the average of the numbers in a given list.

function find_average(array) {
   
    if(array.length === 0){ //Check if array is empty
      return 0;//If it is empty return 0
    }
    return array.reduce(function(pv,cv){//If array is not empty return the average by calculating the sum with reduce
      return pv + cv;
    })/(array.length)// Then divide by how many numbers in the array
  }