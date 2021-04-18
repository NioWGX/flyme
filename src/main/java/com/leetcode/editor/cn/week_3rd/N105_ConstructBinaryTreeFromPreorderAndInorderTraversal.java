package com.leetcode.editor.cn.week_3rd;

//根据一棵树的前序遍历与中序遍历构造二叉树。 
//
// 注意: 
//你可以假设树中没有重复的元素。 
//
// 例如，给出 
//
// 前序遍历 preorder = [3,9,20,15,7]
//中序遍历 inorder = [9,3,15,20,7] 
//
// 返回如下的二叉树： 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7 
// Related Topics 树 深度优先搜索 数组 
// 👍 984 👎 0


//leetcode submit region begin(Prohibit modification and deletion)


import java.util.HashMap;
import java.util.Map;

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
public class N105_ConstructBinaryTreeFromPreorderAndInorderTraversal {

    Map<Integer, Integer> inorder_idx_map;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        inorder_idx_map = new HashMap<>();
        for (int i = 0; i<  inorder.length; ++i){
            inorder_idx_map.put(inorder[i], i);
        }
        return buildTreeHelper(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    private TreeNode buildTreeHelper(int[] preorder, int p_start, int p_end, int[] inorder, int i_start, int i_end) {
        if (p_start == p_end) {
            return null;
        }

        int root_val = preorder[p_start];
        TreeNode root = new TreeNode(root_val);
        int i_root_index = inorder_idx_map.get(root_val);
        int leftNum = i_root_index - i_start;

        root.left = buildTreeHelper(preorder, p_start + 1, p_start + leftNum + 1, inorder, i_start, i_root_index);
        root.right = buildTreeHelper(preorder, p_start + leftNum + 1, p_end, inorder, i_root_index + 1, i_end);
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
