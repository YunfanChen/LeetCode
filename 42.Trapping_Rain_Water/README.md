# 42.Trapping_Rain_Water
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

# Example :
```
Input: [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
```
# My Solution
```
class Solution {
    public int trap(int[] height) {
        int a = 0,b = height.length-1;
        int result = 0;
        int leftmax = 0, rightmax = 0;
        while(a<=b){
            leftmax = Math.max(leftmax,height[a]);
            rightmax = Math.max(rightmax,height[b]);
            if(leftmax<rightmax){
                result += leftmax-height[a];
                a++;
            }
            else{
                result += rightmax-height[b];
                b--;
            }
        }
        return result;
    }
}}
}
```
