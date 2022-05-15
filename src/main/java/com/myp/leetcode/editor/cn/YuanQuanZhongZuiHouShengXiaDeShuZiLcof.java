/**
<p>English description is not available for the problem. Please switch to Chinese.</p>
<div><div>Related Topics</div><div><li>递归</li><li>数学</li></div></div><br><div><li>👍 607</li><li>👎 0</li></div>
*/
package com.myp.leetcode.editor.cn;
import com.myp.leetcode.editor.cn.commonclass.*;
import java.util.*;

public class YuanQuanZhongZuiHouShengXiaDeShuZiLcof{
    public static void main(String[] args) {
        Solution solution = new YuanQuanZhongZuiHouShengXiaDeShuZiLcof().new Solution();
           
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lastRemaining(int n, int m) {
        int ans = 0;
        for (int i = 2; i <= n; ++i) {
            ans = (ans + m) % i;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}

