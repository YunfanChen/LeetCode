class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int length = A[0].length;
        for(int i = 0; i < length; i++){
            int[] buffer = new int[length];
            System.arraycopy(A[i], 0, buffer, 0, length);
            for(int j = 0; j < length; j++){
                A[i][j] = buffer[length-j-1];
                A[i][j] = 1 - A[i][j];
            }
        }
        return A;
    }
}