class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i =m; i<n+m;i++){
            nums1[i]=nums2[i-m];
        }
        for(int i=m+n;i<nums1.length;i++){
            if(nums1[i]==0){
                nums1[i]=Integer.MAX_VALUE;
            }
        }
        Arrays.sort(nums1);
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]==Integer.MAX_VALUE){
                nums1[i]=0;
            }
        }
        
    }
}