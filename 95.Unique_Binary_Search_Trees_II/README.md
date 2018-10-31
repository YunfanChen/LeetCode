# 95.Unique_Binary_Search_Trees_II
Given an integer n, generate all structurally unique BST's (binary search trees) that store values 1 ... n.


# Example :
```
Input: 3
Output:
[
  [1,null,3,2],
  [3,2,null,1],
  [3,1,null,null,2],
  [2,1,3],
  [1,null,2,null,3]
]
Explanation:
The above output corresponds to the 5 unique BST's shown below:

   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3
```

# My Solution :
```
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<TreeNode> generateTrees(int n) {
        if(n<=0) return new ArrayList<TreeNode>();
        return genTrees(1,n);
    }
    public List<TreeNode> genTrees(int start, int end){
        List<TreeNode> res = new ArrayList<>();
        if(start>end){
            res.add(null);
            return res;
        }
        if(start == end){
            res.add(new TreeNode(start));
            return res;
        }
        List<TreeNode> left,right;
        for(int i=start; i<=end; i++){
            left = genTrees(start,i-1);
            right = genTrees(i+1,end);
            for(TreeNode lNode : left){
                for(TreeNode rNode : right){
                    TreeNode root = new TreeNode(i);
                    root.left=lNode;
                    root.right=rNode;
                    res.add(root);
                }
            }
        }
        return res;
    }
}
```
