# 560.Subarray_Sum_Equals_K
Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.

# Example :
```
Input:nums = [1,1,1], k = 2
Output: 2

```



# My Solution :
```
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i = 0; i<nums.length;i++){
            int res = nums[i]; //内部声明res
            if(res==k) count++;
            for(int j = i+1; j<nums.length; j++){ //不能用else
                res+=nums[j];
                if(res==k){
                    count++;
                }
            }
        }
        return count;
    }
}

```
