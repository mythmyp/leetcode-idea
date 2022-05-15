/**
English description is not available for the problem. Please switch to Chinese.<div><div>Related Topics</div><div><li>数组</li><li>分治</li><li>动态规划</li></div></div><br><div><li>👍 527</li><li>👎 0</li></div>
*/
package com.myp.leetcode.editor.cn;
import com.myp.leetcode.editor.cn.commonclass.*;
import java.util.*;

public class LianXuZiShuZuDeZuiDaHeLcof{
    public static void main(String[] args) {
        Solution solution = new LianXuZiShuZuDeZuiDaHeLcof().new Solution();
           
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxSubArray(int[] nums) {
        int dp = nums[0], ret = dp;
        for (int i = 0; i < nums.length; i++) {
            dp = Math.max(dp + nums[i], nums[i]);
            ret = Math.max(ret, dp);
        }
        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}

