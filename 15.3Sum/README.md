# 15.3Sum
Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
```
For example, given array S = [-1, 0, 1, 2, -1, -4],
A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
```
## My Solution
```
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
```
## Solution 2:
```
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
```
