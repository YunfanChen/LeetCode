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