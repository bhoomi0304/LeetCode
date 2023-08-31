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
    
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> lis = new ArrayList<>();
        dfs(root, lis, "");
        for(int i = 0; i < lis.size(); i++)
            lis.set(i, lis.get(i).substring(2));
        return lis;
    }
    public void dfs(TreeNode node, List<String> lis, String s){
        if(node == null) return;
        if(node.left == null && node.right == null)
            lis.add(s + "->" + node.val);
        s += "->" + node.val;
        dfs(node.left, lis, s);
        dfs(node.right, lis, s);
        
    }
}