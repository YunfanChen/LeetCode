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