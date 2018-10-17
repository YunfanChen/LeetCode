# 407.Trapping_Rain_Water_II
Given an m x n matrix of positive integers representing the height of each unit cell in a 2D elevation map, compute the volume of water it is able to trap after raining.
# Note :    
Both m and n are less than 110. The height of each unit cell is greater than 0 and is less than 20,000.
# Example :
```
Given the following 3x6 height map:
[
  [1,4,3,1,3,2],
  [3,2,1,3,2,4],
  [2,3,3,2,3,1]
]

Return 4.
```
# My Solution
```
class Solution {
    public class cell{
        int m;
        int n;
        int height;
        public cell(int m, int n, int height){
            this.m=m;
            this.n=n;
            this.height=height;
        }
    }
    public int trapRainWater(int[][] heightMap) {
        if(heightMap==null||heightMap.length==0||heightMap[0].length==0){
            return 0;
        }
        int result=0;
        PriorityQueue<cell> pq = new PriorityQueue<cell>(1,(a,b)->(a.height-b.height));
        int m = heightMap.length;
        int n = heightMap[0].length;
        boolean[][] visited = new boolean[m][n];
        for(int i = 0; i<m; i++){
            visited[i][0]=true;
            visited[i][n-1]=true;
            pq.offer(new cell(i,0,heightMap[i][0]));
            pq.offer(new cell(i,n-1,heightMap[i][n-1]));
        }
        for(int i = 0; i<n; i++){
            visited[0][i]=true;
            visited[m-1][i]=true;
            pq.offer(new cell(0,i,heightMap[0][i]));
            pq.offer(new cell(m-1,i,heightMap[m-1][i]));
        }
        int[][] dir = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        while(!pq.isEmpty()){
            cell cell = pq.poll();
            for(int[] d : dir){
                int row = cell.m + d[0];
                int col = cell.n + d[1];
                if(row>0&&col>0&&row<m-1&&col<n-1&&visited[row][col]!=true){
                    visited[row][col]=true;
                    result += Math.max(0,cell.height-heightMap[row][col]);
                    pq.offer(new cell(row,col,Math.max(cell.height,heightMap[row][col])));
                }
            }
        }
        return result;
    }
}
```
