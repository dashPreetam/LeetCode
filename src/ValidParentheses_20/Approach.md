### Optimised

 1. If the length of the string is less than 2. it is invalid, return false
 2. Create an empty stack
 3. Loop for each character in the string
 4. If the current character is an opening parentheses, push it to the stack
 5. If it is a closing parentheses, pop the stack
 6. If the stack is empty then the string is invalid as a closing parentheses cannot be present at the beginning of the string.
 7. If the top character and the current character form a pair, move to the next character and continue steps 4,5,6
 8. If the stack is empty at the end of the loop, then return true.
 9. Else return false as single opening parentheses are not valid without their matching closing parentheses