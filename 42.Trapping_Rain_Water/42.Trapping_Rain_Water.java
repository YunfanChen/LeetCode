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
}