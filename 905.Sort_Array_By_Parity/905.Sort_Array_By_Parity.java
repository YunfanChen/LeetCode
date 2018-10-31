class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] res = new int[A.length];
        int index = 0, tail = A.length-1;
        for(int i = 0; i<A.length; i++){
            if(A[i]%2==0) res[index++]=A[i];
            else res[tail--] = A[i]; 
        }
        return res;
    }
}