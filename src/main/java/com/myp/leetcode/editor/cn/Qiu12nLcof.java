/**
<p>English description is not available for the problem. Please switch to Chinese.</p>
<div><div>Related Topics</div><div><li>位运算</li><li>递归</li><li>脑筋急转弯</li></div></div><br><div><li>👍 495</li><li>👎 0</li></div>
*/
package com.myp.leetcode.editor.cn;
import com.myp.leetcode.editor.cn.commonclass.*;
import java.util.*;

public class Qiu12nLcof{
    public static void main(String[] args) {
        Solution solution = new Qiu12nLcof().new Solution();
           
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int sumNums(int n) {
        boolean flag = n > 0 && (n += sumNums(n - 1)) > 0;
        return n;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}

