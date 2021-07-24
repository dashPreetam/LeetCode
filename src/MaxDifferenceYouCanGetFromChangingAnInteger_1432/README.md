### Brute force, Iterative
1. If number is less than 10, the answer is always 8

1. Find the Maximum possible number from the given number
   1. Initialize a bestPossible to the current number
   1. Replace all occurrences of each digit one by one with 9
   1. If the new number formed by replacing the digit is greater than the bestPossible, update the bestPossible to the new number.
   1. Return bestPossible.

1. Find the Minimum possible number from the given number
   1. Initialize a bestPossible to the current number
   1. Replace all occurrences of each digit one by one with 0, except the first digit.
   1. First digit should be replaced with 1 as there cannot be leading 0s.
   1. If the new number formed by replacing the digit is smaller than the bestPossible, update the bestPossible to the new number.
   1. Return bestPossible. 
   
1. Return the difference between maximum possible and minimum possible