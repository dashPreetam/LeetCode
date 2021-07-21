### Brute Force, Recursive, Optimised

1. Create a recursive function that accepts a string (s), count of opening brackets (o) and count of closing brackets (c) and the value of n.
2. If the value of opening bracket and closing bracket is equal to n then print the string and return.
3. If the count of opening bracket is greater than count of closing bracket then call the function recursively with the following parameters String s + “}”, count of opening bracket o, count of closing bracket c + 1, and n.
4. If the count of opening bracket is less than n then call the function recursively with the following parameters String s + “{“, count of opening bracket o + 1, count of closing bracket c, and n.