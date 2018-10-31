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
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null) return new ArrayList<String>();
        List<String> res = new ArrayList<>();
        String temp = "";
        dfs(root,res,temp);
        return res;
    }
    public void dfs(TreeNode root, List<String> res, String temp){
        if(root==null){
            res.add(temp.substring(0,temp.length()-2));
            return;
        }
        temp = temp + root.val + "->";
        if(root.left==null&&root.right!=null) dfs(root.right,res,temp);
        else if(root.right==null&&root.left!=null) dfs(root.left,res,temp);
        else if(root.right==null&&root.left==null) dfs(null,res,temp);
        else{
            dfs(root.right,res,temp);
            dfs(root.left,res,temp);
        }
    }
}