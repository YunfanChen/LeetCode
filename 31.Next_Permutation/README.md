# 31.Next_Permutation
Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

The replacement must be in-place and use only constant extra memory.

Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.


# Example :
```
1,2,3 → 1,3,2
3,2,1 → 1,2,3
1,1,5 → 1,5,1

```



# My Solution :
```
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums==null || nums.length<=1) return;
        int i = nums.length-1;
        for(;i>0;i--){
            if(nums[i]>nums[i-1]) break;
        }
        if(i!=0) swap(nums,i-1);
        reverse(nums,i);
    }
    public void swap(int[] nums, int i){
        for(int j = nums.length-1; j>i; j--){
            if(nums[j]>nums[i]){
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                break;
            }
        }
    }
    public void reverse(int[] nums, int i){
        int head = i;
        int tail = nums.length-1;
        while(head<tail){
            int t = nums[head];
            nums[head] = nums[tail];
            nums[tail] = t;
            head++;
            tail--;
        }
    }
}

```
