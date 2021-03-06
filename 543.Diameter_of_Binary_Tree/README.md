# 543.Diameter_of_Binary_Tree
Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
# Example :
```
          1
         / \
        2   3
       / \     
      4   5   
      ```
Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
# My Solution
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
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        depth(root);
        return max;
    }
    public int depth(TreeNode root){
        if(root==null) return 0;
        int left = depth(root.left);
        int right = depth(root.right);
        max = Math.max(max,left+right);
        return Math.max(left,right)+1;
    }
}
```
