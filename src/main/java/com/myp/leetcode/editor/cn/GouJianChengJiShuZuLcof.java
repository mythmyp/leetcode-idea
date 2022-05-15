/**
English description is not available for the problem. Please switch to Chinese.<div><div>Related Topics</div><div><li>数组</li><li>前缀和</li></div></div><br><div><li>👍 228</li><li>👎 0</li></div>
*/
package com.myp.leetcode.editor.cn;
import com.myp.leetcode.editor.cn.commonclass.*;
import java.util.*;

public class GouJianChengJiShuZuLcof{
    public static void main(String[] args) {
        Solution solution = new GouJianChengJiShuZuLcof().new Solution();
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = solution.constructArr(a);
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] constructArr(int[] a) {
        int len = a.length;
        if(len == 0) return new int[0];
        int[] b = new int[len];
        b[0] = 1;
        int tmp = 1;
        for(int i = 1; i < len; i++) {
            b[i] = b[i - 1] * a[i - 1];
        }
        for(int i = len - 2; i >= 0; i--) {
            tmp *= a[i + 1];
            b[i] *= tmp;
        }
        return b;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}

