/**
<p>Given an NxM matrix of positive and negative integers, write code to find the submatrix with the largest possible sum.</p>

<p>Return an array&nbsp;<code>[r1, c1, r2, c2]</code>, where&nbsp;<code>r1</code>, <code>c1</code> are the row number and the column number of the submatrix&#39;s upper left corner respectively, and&nbsp;<code>r2</code>, <code>c2</code> are the row number of and the column number of lower right corner. If there are more than one answers, return any one of them.</p>

<p><b>Note:&nbsp;</b>This problem is slightly different from the original one in the book.</p>

<p><strong>Example:</strong></p>

<pre>
<strong>Input:
</strong><code>[
&nbsp;  [-1,<strong>0</strong>],
&nbsp;  [0,-1]
]</code>
<strong>Output: </strong>[0,1,0,1]</pre>

<p><strong>Note: </strong></p>

<ul>
	<li><code>1 &lt;= matrix.length, matrix[0].length &lt;= 200</code></li>
</ul>
<div><div>Related Topics</div><div><li>数组</li><li>动态规划</li><li>矩阵</li><li>前缀和</li></div></div><br><div><li>👍 144</li><li>👎 0</li></div>
*/
package com.myp.leetcode.editor.cn;
import com.myp.leetcode.editor.cn.commonclass.*;
import java.util.*;

public class MaxSubmatrixLcci{
    public static void main(String[] args) {
        Solution solution = new MaxSubmatrixLcci().new Solution();
           
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] getMaxMatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        if (m == 1 && n == 1) return new int[]{0, 0, 0, 0};
        return new int[0];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}

