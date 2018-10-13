# 53.Maximum_Subarray
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
# Example
```
Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
```
# My Solution
```
class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        int result = nums[0];
        dp[0]=nums[0];
        for(int i=1; i<nums.length; i++){
            dp[i]=nums[i] + (dp[i-1]>0? dp[i-1]:0);
            result = Math.max(result,dp[i]);
        }
        return result;
    }
}
```
