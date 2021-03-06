# 77.Combinations
Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
 
# Example :
```
Input: n = 4, k = 2
Output:
[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]
```

# My Solution :
```
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        if(k<0 || k>n) return new ArrayList<List<Integer>>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        dfs(result,temp,n,k,1);
        return result;
    }
    public void dfs(List<List<Integer>> result,List<Integer> temp, int n, int k, int m){
        if(k == 0){
            result.add(new ArrayList<Integer>(temp));
            return;
        }
        for(int i=m; i<=n; i++){
            temp.add(i);
            dfs(result,temp,n,k-1,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
```
