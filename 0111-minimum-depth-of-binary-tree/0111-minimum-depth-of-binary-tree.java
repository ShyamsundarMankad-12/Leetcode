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
//  Min deapth must reach to leaf node 
class Solution {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        // if root is leaf 
        if(root.left==null && root.right==null) return 1;
        // if left child is null
        if(root.left==null) return minDepth(root.right) +1;

        // if left right is null
        if(root.right==null) return minDepth(root.left) +1;
        
        int ld = minDepth(root.left);
        int rd = minDepth(root.right);
        return Math.min(ld,rd) + 1;
    }
}