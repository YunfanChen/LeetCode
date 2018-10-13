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