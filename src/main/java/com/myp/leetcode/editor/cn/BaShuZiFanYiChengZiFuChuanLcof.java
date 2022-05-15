/**
English description is not available for the problem. Please switch to Chinese.<div><div>Related Topics</div><div><li>字符串</li><li>动态规划</li></div></div><br><div><li>👍 428</li><li>👎 0</li></div>
*/
package com.myp.leetcode.editor.cn;
import com.myp.leetcode.editor.cn.commonclass.*;
import java.util.*;

public class BaShuZiFanYiChengZiFuChuanLcof{
    public static void main(String[] args) {
        Solution solution = new BaShuZiFanYiChengZiFuChuanLcof().new Solution();
        int num = 18822;
        System.out.println(solution.translateNum(num));

    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int translateNum(int num) {
        String s = String.valueOf(num);
        if (s.length() <= 1) return 1;
        int[] dp = new int[s.length()];
        dp[0] = 1;
        if (s.charAt(0) == '1' || (s.charAt(0) == '2' && s.charAt(1) < '6')) dp[1] = 2;
        else dp[1] = 1;
        for (int i = 2; i < s.length(); ++i) {
            if (s.charAt(i-1) == '1' || (s.charAt(i-1) == '2' && s.charAt(i) < '6')) {
                dp[i] = dp[i-1] + dp[i-2];
            }
            else dp[i] = dp[i-1];
        }
        return dp[s.length() - 1];
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}

