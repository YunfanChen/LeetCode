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
    public boolean isValidBST(TreeNode root) {
        return isValid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean isValid(TreeNode root,Long min, Long max){
        if(root==null) return true;
        else if(root.val>min && root.val<max){
            return isValid(root.left,min,Long.valueOf(root.val))&&isValid(root.right,Long.valueOf(root.val),max);
        }
        return false;
    }
}