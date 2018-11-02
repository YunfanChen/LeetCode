class Solution {
    public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int index = 1;
        for(int i = 1; i<nums.length; i++){
            if(nums[i]!=nums[index-1]) nums[index++]=nums[i];
        }
        return index;
    }
}