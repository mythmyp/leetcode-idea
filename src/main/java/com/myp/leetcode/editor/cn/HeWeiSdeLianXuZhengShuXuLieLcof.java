/**
<p>English description is not available for the problem. Please switch to Chinese.</p>
<div><div>Related Topics</div><div><li>数学</li><li>双指针</li><li>枚举</li></div></div><br><div><li>👍 435</li><li>👎 0</li></div>
*/
package com.myp.leetcode.editor.cn;
import com.myp.leetcode.editor.cn.commonclass.*;
import java.util.*;

public class HeWeiSdeLianXuZhengShuXuLieLcof{
    public static void main(String[] args) {
        Solution solution = new HeWeiSdeLianXuZhengShuXuLieLcof().new Solution();
           
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] findContinuousSequence(int target) {
        List<int[]> ret = new ArrayList<int[]>();
        for (int left = 1, right = 2; left < right;) {
            int sum = (left + right) * (right - left + 1) / 2;
            if (sum == target) {
                int[] res = new int[right - left + 1];
                for (int i = left; i <= right; i++) res[i-left] = i;
                ret.add(res);
                left++;
            }
            else if (sum < target) right++;
            else left++;
        }
        return ret.toArray(new int[ret.size()][]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
