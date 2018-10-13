# 11.Container-With-Most-Water
Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.  
Note: You may not slant the container and n is at least 2.
## My Solution
```
class Solution {
    public int maxArea(int[] height) {    
        int s = 0,w = 0,w1 = 0,w2 = 0,h = 0;
        for(int i = 0;i<height.length;i++){
            for(int j = 0; j<height.length;j++){
                h=(i-j>=0)?(i-j):(j-i);
                w1=(height[i]>=0)?height[i]:((-1)*height[i]);
                w2=(height[j]>=0)?height[j]:((-1)*height[j]);
                w=(w1>w2)?w2:w1;
                s=((w*h)>s)?(w*h):s;
            }
        }
        return s;
    }
}
```
## Another Solution
```
class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length-1,area = 0;
        while(i<j){
            if(height[i]<height[j]) area = Math.max(area,(j-i)*height[i++]);
            else area = Math.max(area,(j-i)*height[j--]);
        }
        return area;
    }
}
```
## What I Got
- The first solution is to find all possible solutions and return a max value, it will exceed the time limit. 
- Then I noticed, the (i,ai) is in regular order, the height of the two point is determined by their index in the array.
- So, I set two indexs (j&i), one from 0 to j, another from height.length-1 to i, the height is decreasing, I just need to campare ai and aj and choose a smaller one then change it(i++ or j--).
