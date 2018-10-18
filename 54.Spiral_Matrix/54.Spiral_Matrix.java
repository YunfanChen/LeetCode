class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        if(matrix==null||matrix.length==0) return result;
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0,right = n-1;
        int up = 0,down = m-1;
        while(result.size()<m*n){
            for(int i=left; i<=right && result.size()<m*n; i++){
                result.add(matrix[up][i]);
            }
            for(int j=up+1; j<=down && result.size()<m*n; j++){
                result.add(matrix[j][right]);
            }
            for(int i=right-1; i>=left && result.size()<m*n; i--){
                result.add(matrix[down][i]);
            }
            for(int j=down-1; j>=up+1 && result.size()<m*n; j--){
                result.add(matrix[j][left]);
            }
            left++; right--; up++; down--;
        }
        return result;
    }
}