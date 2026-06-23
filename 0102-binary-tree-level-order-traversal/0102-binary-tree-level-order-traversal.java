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
    public List<List<Integer>> levelOrder(TreeNode root) {
       
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> queue=new LinkedList();
        
            queue.add(root);
            while(!queue.isEmpty()){
                int size=queue.size();
                List<Integer> l=new ArrayList<>();
                while(size-->0){
                    TreeNode f=queue.poll();
                    l.add(f.val);

                    if(f.left!=null) queue.add(f.left);
                    if(f.right!=null) queue.add(f.right);
                }
                ans.add(l);
            }
            return ans;
    }
}