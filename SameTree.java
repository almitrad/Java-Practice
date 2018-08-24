/*
Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

Example 1:

Input:     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true
Example 2:

Input:     1         1
          /           \
         2             2

        [1,2],     [1,null,2]

Output: false
Example 3:

Input:     1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

Output: false

 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        List<Integer>pValue = new ArrayList<>();
        List<Integer>qValue = new ArrayList<>();
        
        helper1(p, pValue);
        helper2(q, qValue);
        
        if (pValue.size() != qValue.size()){
            return false;
        }
        else{
            for (int i = 0; i < pValue.size(); i++){
                if (pValue.get(i) != qValue.get(i)){
                    return false;
                }
            }
        }
        return true;
        
    }
    
    public void helper1(TreeNode root, List<Integer>pValue){
        if (root != null){
            helper1(root.left, pValue);
            pValue.add(root.val);
            helper1(root.right, pValue);
        }
    }
    
    public void helper2(TreeNode root, List<Integer>qValue){
        if (root!= null){
            helper2(root.left, qValue);
            qValue.add(root.val);
            helper2(root.right, qValue);
        }
    }
}