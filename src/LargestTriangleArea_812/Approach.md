### Brute force, Iterative
1. Declare a global max variable and initialize to minimum value of double.
1. Run three loops from 0th point to nth point in the array of points.
1. Above step will generate all possible subsets of size 3.
1. For each subset, calculate the area of the triangle formed by the points.
1. If the area is greater than the global max then update the global max.
1. Return the global max.