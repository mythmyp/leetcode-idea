/**
English description is not available for the problem. Please switch to Chinese.<div><div>Related Topics</div><div><li>哈希表</li><li>数学</li><li>动态规划</li><li>堆（优先队列）</li></div></div><br><div><li>👍 340</li><li>👎 0</li></div>
*/
package com.myp.leetcode.editor.cn;
import com.myp.leetcode.editor.cn.commonclass.*;
import java.util.*;

public class ChouShuLcof{
    public static void main(String[] args) {
        Solution solution = new ChouShuLcof().new Solution();
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        int p2 = 1, p3 = 1, p5 = 1;
        for (int i = 2; i <= n; ++i) {
            int num2 = dp[p2] * 2, num3 = dp[p3] * 3, num5 = dp[p5] * 5;
            dp[i] = Math.min(Math.min(num2, num3), num5);
            if (dp[i] == num2) p2++;
            if (dp[i] == num3) p3++;
            if (dp[i] == num5) p5++;
        }
        return dp[n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}

