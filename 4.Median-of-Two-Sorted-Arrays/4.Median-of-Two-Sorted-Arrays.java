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