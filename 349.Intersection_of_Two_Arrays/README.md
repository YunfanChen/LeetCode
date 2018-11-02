# 349.Intersection_of_Two_Arrays
Given two arrays, write a function to compute their intersection.

# Example :
```
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]

```



# My Solution :
```
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();
        for(int i = 0; i<Math.max(nums1.length,nums2.length);i++){
            if(i<nums1.length){
                h1.add(nums1[i]);
            }
            if(i<nums2.length){
                h2.add(nums2[i]);
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i<h2.size(); i++){
            for(int num : h2){
                if(h1.contains(num)&&!res.contains(num)) res.add(num);
            }
        }
        int[] result = new int[res.size()];
        for(int i = 0; i<res.size();i++){
            result[i] = res.get(i);
        }
        return result;
    }
}

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> inter = new HashSet<>();
        for(int i =0; i<nums1.length; i++){
            set.add(nums1[i]);
        }
        for(int i = 0; i<nums2.length; i++){
            if(set.contains(nums2[i])) inter.add(nums2[i]);
        }
        int[] res = new int[inter.size()];
        int index = 0;
        for(int num : inter){
            res[index++]=num;
        }
        return res;
    }
}

```
