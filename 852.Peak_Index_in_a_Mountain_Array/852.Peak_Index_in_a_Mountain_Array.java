class Solution {
    public int peakIndexInMountainArray(int[] A) {
        for(int i = 0; i<A.length; i++){
            if(A[i]<A[i+1]) continue;
            return i;
        }
        return 0;
    }
}