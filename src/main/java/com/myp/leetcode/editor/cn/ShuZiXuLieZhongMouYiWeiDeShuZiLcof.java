/**
English description is not available for the problem. Please switch to Chinese.<div><div>Related Topics</div><div><li>数学</li><li>二分查找</li></div></div><br><div><li>👍 246</li><li>👎 0</li></div>
*/
package com.myp.leetcode.editor.cn;
import com.myp.leetcode.editor.cn.commonclass.*;
import java.util.*;

public class ShuZiXuLieZhongMouYiWeiDeShuZiLcof{
    public static void main(String[] args) {
        Solution solution = new ShuZiXuLieZhongMouYiWeiDeShuZiLcof().new Solution();
        int t = solution.findNthDigit(10000);
        System.out.println(t);
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findNthDigit(int n) {
        int index = 0;
        long ret = 0L, _ret = 0L;
        for (int i = 0; i < 11; i++) {
            _ret = ret;
            ret += (long) (i * 9 * Math.pow(10, i - 1));
            if (n == ret) return (int) (Math.pow(10, i) - 1);
            if (n < ret) {
                index = i;
                break;
            }
        }

        int temp = (int) (n - _ret);
        int num = temp / index, res = temp % index;

        if (res == 0) return (int) (Math.pow(10, index - 1) + num - 1) % 10;
        int realNum = (int) (Math.pow(10, index - 1) + num);
        while (index - res > 0) {
            realNum /= 10;
            res++;
        }

        return realNum % 10;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}

