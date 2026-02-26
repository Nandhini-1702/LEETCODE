// Last updated: 26/02/2026, 09:49:40
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<Integer> inorderTraversal(TreeNode root) {
18         List<Integer> ans = new ArrayList<>();
19
20        if(root == null) return ans;
21
22        inorder(root, ans);
23
24        return ans;
25
26    }
27    private void inorder(TreeNode root, List<Integer> ans){
28        if(root != null){        
29            inorder(root.left, ans);
30            ans.add(root.val);
31            inorder(root.right, ans);
32        }
33    }
34}