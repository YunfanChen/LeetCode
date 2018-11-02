class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int[] odd = new int[A.length/2];
        int[] even = new int[A.length/2];
        int evenCount = 0, oddCount = 0;
        for(int i = 0; i<A.length; i++){
            if(A[i] % 2 == 0) 
                even[evenCount++] = A[i];
            else odd[oddCount++] = A[i];
        }
        oddCount = 0;
        evenCount = 0;
        for(int i = 0; i<A.length; i+=2){
            A[i] = even[evenCount++];
            A[i+1] = odd[oddCount++];
        }
        return A;
    }
}