### Optimised

 1. If size of array is 1 then it cannot be divided further so return false.
 2. Store frequency of each element in a map.
 3. Find Hcf of all frequencies.
 4. If hcf is one, elements cannot be divided into groups so return false.
 5. If hcf is more than one, then elements can be divided into groups of size k where k is the hcf.