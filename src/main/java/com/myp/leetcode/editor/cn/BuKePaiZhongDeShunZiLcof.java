/**
English description is not available for the problem. Please switch to Chinese.<div><div>Related Topics</div><div><li>ζ°η»</li><li>ζεΊ</li></div></div><br><div><li>π 238</li><li>π 0</li></div>
*/
package com.myp.leetcode.editor.cn;
import com.myp.leetcode.editor.cn.commonclass.*;
import java.util.*;

public class BuKePaiZhongDeShunZiLcof{
    public static void main(String[] args) {
        Solution solution = new BuKePaiZhongDeShunZiLcof().new Solution();
           
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isStraight(int[] nums) {
        int min = 14, max = 0;
        HashSet<Integer> hashset = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) continue;
            if (hashset.contains(nums[i])) return false;
            hashset.add(nums[i]);
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        return max - min < 5;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}

