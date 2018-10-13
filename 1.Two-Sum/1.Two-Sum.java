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