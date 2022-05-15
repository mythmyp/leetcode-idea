/**
<p>English description is not available for the problem. Please switch to Chinese.</p>
<div><div>Related Topics</div><div><li>树</li><li>深度优先搜索</li><li>二叉搜索树</li><li>二叉树</li></div></div><br><div><li>👍 228</li><li>👎 0</li></div>
*/
package com.myp.leetcode.editor.cn;
import com.myp.leetcode.editor.cn.commonclass.*;
import sun.reflect.generics.tree.Tree;

import java.util.*;

public class ErChaSouSuoShuDeZuiJinGongGongZuXianLcof{
    public static void main(String[] args) {
        Solution solution = new ErChaSouSuoShuDeZuiJinGongGongZuXianLcof().new Solution();
           
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (root.val < p.val && root.val < q.val) root = root.right;
            else if (root.val > p.val && root.val > q.val) root = root.left;
            else break;
        }
        return root;
    }

    public TreeNode recur(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val < p.val && root.val < q.val) {
            return recur(root.right, p, q);
        }
        if (root.val > p.val && root.val > q.val) {
            return recur(root.left, p, q);
        }
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}

