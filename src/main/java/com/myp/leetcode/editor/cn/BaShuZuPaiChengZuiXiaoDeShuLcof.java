/**
English description is not available for the problem. Please switch to Chinese.<div><div>Related Topics</div><div><li>贪心</li><li>字符串</li><li>排序</li></div></div><br><div><li>👍 449</li><li>👎 0</li></div>
*/
package com.myp.leetcode.editor.cn;
import com.myp.leetcode.editor.cn.commonclass.*;
import java.util.*;

public class BaShuZuPaiChengZuiXiaoDeShuLcof{
    public static void main(String[] args) {
        Solution solution = new BaShuZuPaiChengZuiXiaoDeShuLcof().new Solution();
        int[] nums = {3,30,34,5,9};
        System.out.println(solution.minNumber(nums));
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs, (o1, o2) -> (o1 + o2).compareTo(o2 + o1));
//        StringBuilder res = new StringBuilder();
        String res = new String();
        for (String s : strs) res += s;
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}

