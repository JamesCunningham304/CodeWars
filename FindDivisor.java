// Count the number of divisors of a positive integer n.

// Random tests go up to n = 500000.

public class FindDivisor {

    public long numberOfDivisors(int n) {
      long numberOfDivisors = 0; // to count the number of divisors
      
      for(int i = 1; i <= n;i++){
        if(n % i == 0){ // calculate number of divisors
          numberOfDivisors++;
        }
      }
      return numberOfDivisors;
    }
  
  }