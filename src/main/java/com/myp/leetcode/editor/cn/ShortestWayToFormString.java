/**
<p>A <strong>subsequence</strong> of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., <code>&quot;ace&quot;</code> is a subsequence of <code>&quot;<u>a</u>b<u>c</u>d<u>e</u>&quot;</code> while <code>&quot;aec&quot;</code> is not).</p>

<p>Given two strings <code>source</code> and <code>target</code>, return <em>the minimum number of <strong>subsequences</strong> of </em><code>source</code><em> such that their concatenation equals </em><code>target</code>. If the task is impossible, return <code>-1</code>.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> source = &quot;abc&quot;, target = &quot;abcbc&quot;
<strong>Output:</strong> 2
<strong>Explanation:</strong> The target &quot;abcbc&quot; can be formed by &quot;abc&quot; and &quot;bc&quot;, which are subsequences of source &quot;abc&quot;.
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> source = &quot;abc&quot;, target = &quot;acdbc&quot;
<strong>Output:</strong> -1
<strong>Explanation:</strong> The target string cannot be constructed from the subsequences of source string due to the character &quot;d&quot; in target string.
</pre>

<p><strong>Example 3:</strong></p>

<pre>
<strong>Input:</strong> source = &quot;xyz&quot;, target = &quot;xzyxz&quot;
<strong>Output:</strong> 3
<strong>Explanation:</strong> The target string can be constructed as follows &quot;xz&quot; + &quot;y&quot; + &quot;xz&quot;.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= source.length, target.length &lt;= 1000</code></li>
	<li><code>source</code> and <code>target</code> consist of lowercase English letters.</li>
</ul>
<div><div>Related Topics</div><div><li>贪心</li><li>字符串</li><li>动态规划</li></div></div><br><div><li>👍 84</li><li>👎 0</li></div>
*/
package com.myp.leetcode.editor.cn;
import com.myp.leetcode.editor.cn.commonclass.*;
import java.util.*;

public class ShortestWayToFormString{
    public static void main(String[] args) {
        Solution solution = new ShortestWayToFormString().new Solution();
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int shortestWay(String source, String target) {
        int n = source.length();
        int j = 0, count = 0;
        while (j < target.length()) {
            int prev = j;
            for (int i = 0; i < n; i++) {
                if (j < target.length() && source.charAt(i) == target.charAt(j)) j++;
            }
            if (prev == j) return -1;
            count++;
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
