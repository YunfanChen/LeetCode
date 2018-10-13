# 1.Two-Sum
  Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
##Example:
```
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
```
## My Solution
```
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j;
        for(i=0;i<nums.length;i++){
            int n = target - nums[i];
            for(j=i+1;j<nums.length;j++){
                if(nums[j]==n) {
                    return new int[] {i,j};
                }
            }
        } 
        throw new IllegalArgumentException("no solution");
    }
}
```
## What I Got
- When I have a return in "for" or "if", I still need a return in the end. In this case, I used an Exception (IllegalArgumentException) for the "no solution" result.
- return an array can use 
```
return new int[] {i,j};
```
