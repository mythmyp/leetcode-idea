/**
<p>Given an array <code>nums</code> of integers, return the <strong>length</strong> of the longest arithmetic subsequence in <code>nums</code>.</p>

<p>Recall that a <em>subsequence</em> of an array <code>nums</code> is a list <code>nums[i<sub>1</sub>], nums[i<sub>2</sub>], ..., nums[i<sub>k</sub>]</code> with <code>0 &lt;= i<sub>1</sub> &lt; i<sub>2</sub> &lt; ... &lt; i<sub>k</sub> &lt;= nums.length - 1</code>, and that a sequence <code>seq</code> is <em>arithmetic</em> if <code>seq[i+1] - seq[i]</code> are all the same value (for <code>0 &lt;= i &lt; seq.length - 1</code>).</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [3,6,9,12]
<strong>Output:</strong> 4
<strong>Explanation: </strong>
The whole array is an arithmetic sequence with steps of length = 3.
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [9,4,7,2,10]
<strong>Output:</strong> 3
<strong>Explanation: </strong>
The longest arithmetic subsequence is [4,7,10].
</pre>

<p><strong>Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [20,1,15,3,10,5,8]
<strong>Output:</strong> 4
<strong>Explanation: </strong>
The longest arithmetic subsequence is [20,15,10,5].
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>2 &lt;= nums.length &lt;= 1000</code></li>
	<li><code>0 &lt;= nums[i] &lt;= 500</code></li>
</ul>
<div><div>Related Topics</div><div><li>数组</li><li>哈希表</li><li>二分查找</li><li>动态规划</li></div></div><br><div><li>👍 188</li><li>👎 0</li></div>
*/
package com.myp.leetcode.editor.cn;
import com.myp.leetcode.editor.cn.commonclass.*;
import java.util.*;

public class LongestArithmeticSubsequence{
    public static void main(String[] args) {
        Solution solution = new LongestArithmeticSubsequence().new Solution();
           
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestArithSeqLength(int[] nums) {
        int n = nums.length;
        if (n < 3) return 2;

        int[][] dp = new int[n][1001];
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; ++j) {
                int d = nums[i] - nums[j] + 500;
                dp[i][d] = Math.max(dp[i][d], dp[j][d] + 1);
                res = Math.max(res, dp[i][d]);
            }
        }
        return res + 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}

