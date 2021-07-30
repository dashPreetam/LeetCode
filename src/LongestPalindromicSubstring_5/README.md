### Bruteforce, Iterative+Recursive
1. Extract each letter from the string to be used as root.
2. Grow on both sides and check for palindrome:
    1. Using the current character as root,
    2. Without using the current character as root
    3. Using the current character and the next character as the root.
3. Store the maximum length palindrome from above three steps and compare with the already global maximun.
4. Repeat the above steps for all characters
5. Return the global max.
