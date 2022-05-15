/**
<p>English description is not available for the problem. Please switch to Chinese.</p>
<div><div>Related Topics</div><div><li>位运算</li><li>数组</li></div></div><br><div><li>👍 632</li><li>👎 0</li></div>
*/
package com.myp.leetcode.editor.cn;
import com.myp.leetcode.editor.cn.commonclass.*;
import java.util.*;

public class ShuZuZhongShuZiChuXianDeCiShuLcof{
    public static void main(String[] args) {
        Solution solution = new ShuZuZhongShuZiChuXianDeCiShuLcof().new Solution();
        int[] dp = new int[]{1,2,3};
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] singleNumbers(int[] nums) {
        int x = 0, y = 0, n = 0, m = 1;
        for(int num : nums)               // 1. 遍历异或
            n ^= num;
        while((n & m) == 0)               // 2. 循环左移，计算 m
            m <<= 1;
        for(int num: nums) {              // 3. 遍历 nums 分组
            if((num & m) != 0) x ^= num;  // 4. 当 num & m != 0
            else y ^= num;                // 4. 当 num & m == 0
        }
        return new int[] {x, y};          // 5. 返回出现一次的数字
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
