###Bruteforce, Recursive
1. Init a maxArea to 0;
2. Start at the extreme ends of the array as to maximize the distance between the two towers.
3. Find the area formed by the towers and store the maximum between that and maxArea in maxArea.
4. If the left tower is smaller move to the start pointer to right, else move end pointer to left.
5. Repeat steps 3,4 till the start pointer is less than the end pointer.
6. Return maxArea.