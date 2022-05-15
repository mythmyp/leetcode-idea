/**
English description is not available for the problem. Please switch to Chinese.<div><div>Related Topics</div><div><li>哈希表</li><li>字符串</li><li>滑动窗口</li></div></div><br><div><li>👍 423</li><li>👎 0</li></div>
*/
package com.myp.leetcode.editor.cn;
import com.myp.leetcode.editor.cn.commonclass.*;
import java.util.*;

public class ZuiChangBuHanZhongFuZiFuDeZiZiFuChuanLcof{
    public static void main(String[] args) {
        Solution solution = new ZuiChangBuHanZhongFuZiFuDeZiZiFuChuanLcof().new Solution();
           
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hashmap = new HashMap<>();
        int res = 0, dp = 0;
        for (int j = 0; j < s.length(); j++) {
            int i = hashmap.getOrDefault(s.charAt(j), -1);
            hashmap.put(s.charAt(j), j);
            dp = dp < j - i ? dp + 1 : j - i;
            res = Math.max(res, dp);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}

