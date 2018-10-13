# 4.Median-of-Two-Sorted-Arrays
There are two sorted arrays nums1 and nums2 of size m and n respectively.
Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
## Example 1
```
nums1 = [1, 3]
nums2 = [2]
The median is 2.0
```
## Example 2
```
nums1 = [1, 2]
nums2 = [3, 4]
The median is (2 + 3)/2 = 2.5
```
## My Solution
```
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        double[] set = new double[n+m];
        int index = 0, i = 0, j = 0;
        while(i < n && j < m){
            set[index++] = (nums1[i]<nums2[j]) ? nums1[i++] : nums2[j++];
        }
        while(i < n){
            set[index++] = nums1[i++];
        }
        while(j < m){
            set[index++] = nums2[j++];
        }
        if(index % 2 == 1) return set[index/2];
        else return (set[(index/2)-1]+set[index/2])/2;
    }
}
```
It means combine two sets of numbers in order and then when can define the Median.
## What I Got
- This grammar is very useful
```
set[index++] = (nums1[i]<nums2[j]) ? nums1[i++] : nums2[j++];
```
It not only make a choice about wheather number we should define, but also increase the index of the set.
- Before we solve some problems, we should first think about the basic concept and something about math or logic.
- This is a good problem, I get more than that.
