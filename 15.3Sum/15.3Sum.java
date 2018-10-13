class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        HashSet<List<Integer>> h = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j = i+1; j<nums.length;j++){
                for(int k=j+1; k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> l2 = new ArrayList<Integer>();
                        l2.add(nums[i]);
                        l2.add(nums[j]);
                        l2.add(nums[k]);
                        if(!h.contains(l2)){
                            l.add(l2);
                            h.add(l2);
                        } 
                    }
                }
            }
        }
        return l;
    }
}