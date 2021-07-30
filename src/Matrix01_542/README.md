### Bruteforce, Iterative

1. Initialize a result matrix with maximum integer value.
2. Visit each cell.
3. If the current cell is a 0 in the original matrix, set the current cell of the result to 0 too.
4. Fill the surrounding cells of 0 with 1.   
5. If it's not a 0, the find the minimum from the surrounding and set it to the minimum plus 1.
6. Now visit all the cells again and if the cell is not 0 then find minimum from its surrounding.
7. If the current value of the cell is not equal to minimum plus 1, then update it and repeat above step.
8. When all the cell values are unchanged after visiting each cell, return the result matrix.