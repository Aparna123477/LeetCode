/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null ) return false;
        targetSum-=root.val;
        if(root.right ==null && root.left== null) {
            if(targetSum==0){
                return true;
            }
            return false;
        } 
        
             boolean r=hasPathSum(root.right,targetSum);
             boolean l=hasPathSum(root.left,targetSum);

        
        return (r||l);
        
    }
}