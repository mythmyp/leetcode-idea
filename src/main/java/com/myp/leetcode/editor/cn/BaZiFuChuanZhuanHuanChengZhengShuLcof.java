/**
English description is not available for the problem. Please switch to Chinese.<div><div>Related Topics</div><div><li>字符串</li></div></div><br><div><li>👍 162</li><li>👎 0</li></div>
*/
package com.myp.leetcode.editor.cn;
import com.myp.leetcode.editor.cn.commonclass.*;
import java.util.*;

public class BaZiFuChuanZhuanHuanChengZhengShuLcof{
    public static void main(String[] args) {
        Solution solution = new BaZiFuChuanZhuanHuanChengZhengShuLcof().new Solution();
           
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int strToInt(String str) {
        char[] c = str.trim().toCharArray();
        if (c.length == 0) return 0;
        int res = 0, bound = Integer.MAX_VALUE / 10;
        int i = 1, sign = 1;

        if (c[0] == '-') sign = -1;
        else if (c[0] != '+') i = 0;
        for (int j = i; j < c.length; j++) {
            if (c[j] < '0' || c[j] > '9') break;
            if (res > bound || (res == bound && c[j] > '7')) {
                return sign == 1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            res = res * 10 + (c[j] - '0');
        }
        return sign * res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}

