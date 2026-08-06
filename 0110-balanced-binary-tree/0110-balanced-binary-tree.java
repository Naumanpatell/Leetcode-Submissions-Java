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
    boolean isBalanced = true;
    public boolean isBalanced(TreeNode root) {
        dfs(root);
        return isBalanced;
    }
    public int dfs(TreeNode node) {
            if (node == null) {
                return 0;
            }

            int left_height = dfs(node.left);
            int right_height = dfs(node.right);

            if (Math.abs(left_height - right_height) > 1) {
                isBalanced = false;
            }

            return 1 + Math.max(left_height, right_height);
        }
}