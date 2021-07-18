### Brute Force

 1. Take each pair of adjacent elements.
 2. While second element is lesser than or equal to the first element.
 3. Increase the second element and the counter by one.
 4. Move to next pair.
 5. Repeat steps 2,3,4 till the last pair is processed.
 6. Return counter.

        
    int ops = 0;  
    for (int i = 1; i < nums.length; i++) {  
        while(nums[i] <= nums[i-1]){
             nums[i]++;
             ops++;
        }  
    }  
  
    return ops;
        
### Optimised

 1. Take each pair of adjacent elements.
 2. If second element is lesser than or equal to the first element.
 3. Increase the counter by the difference between first element and the second element and then increase one more as the second element needs to be greater than the first element.
 4. Overwrite the second element with next higher number to first element.
 5. Move to next pair.
 6. Repeat steps 2,3,4 till the last pair is processed.
 7. Return counter.


    int ops = 0;  
    for (int i = 1; i < nums.length; i++) {  
        if(nums[i] <= nums[i-1]){  
            ops += nums[i-1] - nums[i] + 1;  
            nums[i] = nums[i-1]+1;  
        }  
    }  
  
    return ops;