/**
English description is not available for the problem. Please switch to Chinese.<div><div>Related Topics</div><div><li>树状数组</li><li>线段树</li><li>数组</li><li>二分查找</li><li>分治</li><li>有序集合</li><li>归并排序</li></div></div><br><div><li>👍 730</li><li>👎 0</li></div>
*/
package com.myp.leetcode.editor.cn;
import com.myp.leetcode.editor.cn.commonclass.*;
import java.util.*;

public class ShuZuZhongDeNiXuDuiLcof{
    public static void main(String[] args) {
        Solution solution = new ShuZuZhongDeNiXuDuiLcof().new Solution();
           
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int ans;
    int[] aux;
    public int reversePairs(int[] nums) {
        if (nums.length < 2) return 0;
        mergeSort(nums, 0, nums.length - 1);
        return ans;
    }

    void mergeSort(int[] nums, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }
    void merge(int[] nums, int left, int mid, int right) {
        int i = left, j = mid + 1;
        for (int k = left; k <= right; ++k) aux[k] = nums[k];
        for (int k = left; k <= right; ++k) {
            if (i > mid) nums[k] = aux[j++];
            else if (j > right) nums[k] = aux[i++];
            else if (aux[j] < aux[i]) {
                nums[k] = aux[j++];
                ans += (mid - i + 1);
            }
            else nums[k] = aux[i++];
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}

