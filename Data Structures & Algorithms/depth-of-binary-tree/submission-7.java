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
    public int maxDepth(TreeNode root) {
        // check the null root condition
        if(root == null) return 0;
        // variables
        int depth = 0;
        int length = 0;
        // queue to keep track of current level
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            length = queue.size();
            // run the this loop till the all elements in curr queue is covered
            for(int i = 0 ;i < length;i++){
                // poping the node
                TreeNode node = queue.poll();

                // checking 
                if(node.left!= null) queue.offer(node.left);
                if(node.right!= null) queue.offer(node.right);
            
            
            }
            depth++;
        }
        return depth;

    }
}
