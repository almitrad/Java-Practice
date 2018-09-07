/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }

 Invert a binary tree.

Example:

Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9
Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1

 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        
       if (root == null){
           return null;
       }
        
        TreeNode temp = root.left; 
        
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        
        return root; 
    }
}