/**
<p>Given an array of integers <code>nums</code>, sort the array in ascending order.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>
<pre><strong>Input:</strong> nums = [5,2,3,1]
<strong>Output:</strong> [1,2,3,5]
</pre><p><strong>Example 2:</strong></p>
<pre><strong>Input:</strong> nums = [5,1,1,2,0,0]
<strong>Output:</strong> [0,0,1,1,2,5]
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 5 * 10<sup>4</sup></code></li>
	<li><code>-5 * 10<sup>4</sup> &lt;= nums[i] &lt;= 5 * 10<sup>4</sup></code></li>
</ul>
<div><div>Related Topics</div><div><li>数组</li><li>分治</li><li>桶排序</li><li>计数排序</li><li>基数排序</li><li>排序</li><li>堆（优先队列）</li><li>归并排序</li></div></div><br><div><li>👍 557</li><li>👎 0</li></div>
*/
package com.myp.leetcode.editor.cn;
import com.myp.leetcode.editor.cn.commonclass.*;
import java.util.*;

public class SortAnArray{
    public static void main(String[] args) {
        Solution solution = new SortAnArray().new Solution();
        int[] nums = {5, 2, 3, 1};
        nums = solution.sortArray(nums);
        for (int num : nums) System.out.print(num + " ");
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortArray(int[] nums) {
        if (nums.length <= 1) return nums;
        return quickSort(nums, 0, nums.length - 1);
    }

    int[] quickSort(int[] nums, int left, int right) {
        if (left >= right) return nums;
        int random = new Random().nextInt(right - left + 1) + left;
        swap(nums, left, random);
        int pivot = nums[left];
        int i = left, j = right;
        while (i < j) {
            while (i < j && nums[j] >= nums[left]) j--;
            while (i < j && nums[i] <= nums[left]) i++;
            if (i < j) swap(nums, i, j);
        }
        swap(nums, left, i);
        quickSort(nums, left, i - 1);
        quickSort(nums, i + 1, right);

        return nums;
    }
//    int[] quickSort(int[] nums, int startIdx, int endIdx) {
//        if (startIdx >= endIdx) {
//            return nums;
//        }
//
//        int i = startIdx, j = endIdx;
//        while (i < j) {
//            while (i < j && nums[j] > nums[startIdx]) {
//                j--;
//            }
//            while (i < j && nums[i] <= nums[startIdx]) {
//                i++;
//            }
//            swap(nums, i, j);
//        }
//        swap(nums, startIdx, i);
//        quickSort(nums, startIdx, i - 1);
//        quickSort(nums, i + 1, endIdx);
//
//        return nums;
//    }

    void swap(int[] nums, int a, int b) {
        int temp = nums[b];
        nums[b] = nums[a];
        nums[a] = temp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}

