/**
<p>English description is not available for the problem. Please switch to Chinese.</p><div><div>Related Topics</div><div><li>树</li><li>深度优先搜索</li><li>二叉树</li></div></div><br><div><li>👍 275</li><li>👎 0</li></div>
*/
package com.myp.leetcode.editor.cn;
import com.myp.leetcode.editor.cn.commonclass.*;
import java.util.*;

public class PingHengErChaShuLcof{
    public static void main(String[] args) {
        Solution solution = new PingHengErChaShuLcof().new Solution();
           
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
    // 自底向上的递归
    public boolean isBalanced(TreeNode root) {
        return dfs(root) >= 0;
    }
    int dfs(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = dfs(root.left);
        int rightHeight = dfs(root.right);
        if (leftHeight == - 1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        else return Math.max(leftHeight, rightHeight) + 1;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}

