/**
<p>A permutation <code>perm</code> of <code>n + 1</code> integers of all the integers in the range <code>[0, n]</code> can be represented as a string <code>s</code> of length <code>n</code> where:</p>

<ul>
	<li><code>s[i] == &#39;I&#39;</code> if <code>perm[i] &lt; perm[i + 1]</code>, and</li>
	<li><code>s[i] == &#39;D&#39;</code> if <code>perm[i] &gt; perm[i + 1]</code>.</li>
</ul>

<p>Given a string <code>s</code>, reconstruct the permutation <code>perm</code> and return it. If there are multiple valid permutations perm, return <strong>any of them</strong>.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>
<pre><strong>Input:</strong> s = "IDID"
<strong>Output:</strong> [0,4,1,3,2]
</pre><p><strong>Example 2:</strong></p>
<pre><strong>Input:</strong> s = "III"
<strong>Output:</strong> [0,1,2,3]
</pre><p><strong>Example 3:</strong></p>
<pre><strong>Input:</strong> s = "DDI"
<strong>Output:</strong> [3,2,0,1]
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 10<sup>5</sup></code></li>
	<li><code>s[i]</code> is either <code>&#39;I&#39;</code> or <code>&#39;D&#39;</code>.</li>
</ul>
<div><div>Related Topics</div><div><li>贪心</li><li>数组</li><li>数学</li><li>双指针</li><li>字符串</li></div></div><br><div><li>👍 288</li><li>👎 0</li></div>
*/
package com.myp.leetcode.editor.cn;
import com.myp.leetcode.editor.cn.commonclass.*;
import java.util.*;

public class DiStringMatch{
    public static void main(String[] args) {
        Solution solution = new DiStringMatch().new Solution();
           
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] ret = new int[n+1];
        int left = 0, right = n;
        for (int i = 0; i < n; i++) ret[i] = s.charAt(i) == 'D' ? right-- : left++;
        ret[n] = left;
        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}

