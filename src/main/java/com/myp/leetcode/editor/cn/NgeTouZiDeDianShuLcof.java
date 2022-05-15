/**
English description is not available for the problem. Please switch to Chinese.<div><div>Related Topics</div><div><li>数学</li><li>动态规划</li><li>概率与统计</li></div></div><br><div><li>👍 419</li><li>👎 0</li></div>
*/
package com.myp.leetcode.editor.cn;
import com.myp.leetcode.editor.cn.commonclass.*;
import java.util.*;

public class NgeTouZiDeDianShuLcof{
    public static void main(String[] args) {
        Solution solution = new NgeTouZiDeDianShuLcof().new Solution();
           
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double[] dicesProbability(int n) {
        int[][] dp = new int[n+1][6*n+1];
        for (int i = 1; i <= 6; i++) dp[1][i] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= 6*i; ++j) {
                for (int k = 1; k <= 6; k++) {
                    if (k < j) dp[i][j] += dp[i-1][j-k];
                    else break;
                }
            }
        }
        double[] ret = new double[5*n+1];
        double count = Math.pow(6, n);
        for (int i = n; i <= 6*n; ++i) ret[i-n] = dp[n][i] / count;
        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}

