### Brute force, Recursive
1. Declare a counter and initialize to 0.
2. Create a helper method for the recursion that takes in the current node, and the values encountered till now in the path from root to current node.
2. Call the helper method with empty path and the root node.
3. If the current node is null then return.
4. If the current node is not null, then check if in the path there is a greater value than the current node value.
5. If no greater value is present then increase the counter value.
6. Create a copy of the path till now to avoid overwriting the original path.
7. Add the current node value to the path.
8. Call the helper method with new path and left child.
9. Call the helper method with new path and right child.
9. Return the count.