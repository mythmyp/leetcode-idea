/**
<p>English description is not available for the problem. Please switch to Chinese.</p>
<div><div>Related Topics</div><div><li>队列</li><li>滑动窗口</li><li>单调队列</li><li>堆（优先队列）</li></div></div><br><div><li>👍 435</li><li>👎 0</li></div>
*/
package com.myp.leetcode.editor.cn;
import com.myp.leetcode.editor.cn.commonclass.*;
import java.util.*;

public class HuaDongChuangKouDeZuiDaZhiLcof{
    public static void main(String[] args) {
        Solution solution = new HuaDongChuangKouDeZuiDaZhiLcof().new Solution();
           
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k == 0) return new int[0];

        Deque<Integer> queue = new LinkedList<>();
        int[] res = new int[n-k+1];
        // 未形成窗口
        for (int i = 0; i < k; i++) {
            while (!queue.isEmpty() && queue.peekLast() < nums[i]) {
                queue.removeLast();
            }
            queue.addLast(nums[i]);
        }
        res[0] = queue.peekFirst();
        // 形成窗口
        for (int i = k; i < n; i++) {
            if (queue.peekFirst() == nums[i-k]) queue.removeFirst();
            while (!queue.isEmpty() && queue.peekLast() < nums[i]) {
                queue.removeLast();
            }
            queue.addLast(nums[i]);
            res[i-k+1] = queue.peekFirst();
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}

