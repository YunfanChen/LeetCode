class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        for(int i=0;i<nums.length-2;i++){
            if(i==0||nums[i]!=nums[i-1]){
            int hd = i+1, tl = nums.length-1, sum = 0-nums[i];
            while(hd<tl){
                if(nums[hd]+nums[tl]==sum){
                    l.add(Arrays.asList(nums[i],nums[hd],nums[tl]));
                    while(hd<tl&&nums[hd]==nums[hd+1]) hd++;
                    while(hd<tl&&nums[tl]==nums[tl-1]) tl--;
                    hd++; tl--;
                }
                else{
                    if(nums[hd]+nums[tl]<sum) hd++;
                    else tl--;
                }
            }
            }
        }
        return l;
    }
}