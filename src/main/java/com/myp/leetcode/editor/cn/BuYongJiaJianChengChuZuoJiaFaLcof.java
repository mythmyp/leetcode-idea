/**
English description is not available for the problem. Please switch to Chinese.<div><div>Related Topics</div><div><li>位运算</li><li>数学</li></div></div><br><div><li>👍 311</li><li>👎 0</li></div>
*/
package com.myp.leetcode.editor.cn;
import com.myp.leetcode.editor.cn.commonclass.*;
import java.util.*;

public class BuYongJiaJianChengChuZuoJiaFaLcof{
    public static void main(String[] args) {
        Solution solution = new BuYongJiaJianChengChuZuoJiaFaLcof().new Solution();
        int a = 10, b = 27;
        System.out.println(solution.add1(a, b));
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int add(int a, int b) {
        if (b == 0) return a;
        return add(a ^ b, (a & b) << 1);
    }
    public int add1(int a, int b) {
        return (a ^ b + ((a & b) << 1));
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}

