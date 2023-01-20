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
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
        return false;
        else{
        return isSymmetric(root.left,root.right);
        }
    }

    private boolean isSymmetric(TreeNode R1, TreeNode R2)
    {
        if(R1==null && R2==null)
            return true;
        if(R1==null || R2==null)
           return false;
        else{
            if(R1.val!=R2.val)
                return false;
            boolean left = isSymmetric(R1.left,R2.right);
            if(!left)
              return left;
            boolean right = isSymmetric(R1.right,R2.left);
            return right;
        }
    }
}
