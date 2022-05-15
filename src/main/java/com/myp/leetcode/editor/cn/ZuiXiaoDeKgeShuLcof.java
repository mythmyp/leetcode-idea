/**
/**
English description is not available for the problem. Please switch to Chinese.<div><div>Related Topics</div><div><li>数组</li><li>分治</li><li>快速选择</li><li>排序</li><li>堆（优先队列）</li></div></div><br><div><li>👍 429</li><li>👎 0</li></div>
*/
package com.myp.leetcode.editor.cn;
import com.myp.leetcode.editor.cn.commonclass.*;
import java.util.*;

public class ZuiXiaoDeKgeShuLcof{
    public static void main(String[] args) {
        Solution solution = new ZuiXiaoDeKgeShuLcof().new Solution();
           
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        // 堆排序，java 默认是小根堆，需要改写
//        public int[] getLeastNumbers(int[] arr, int k) {
//            if (arr.length * k == 0) return new int[0];
//            PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
//                @Override
//                public int compare(Integer o1, Integer o2) {
//                    return o2 - o1;
//                }
//            });
//            for (int i = 0; i < k; i++) queue.offer(arr[i]);
//            for (int i = k; i < arr.length; ++i) {
//                if (queue.peek() > arr[i]) {
//                    queue.poll();
//                    queue.offer(arr[i]);
//                }
//            }
//            int[] ret = new int[k];
//            for (int i = 0; i < k; ++i) ret[i] = queue.poll();
//
//            return ret;
//        }
        // 快速排序
        public int[] getLeastNumbers(int[] arr, int k) {
            if (arr.length * k == 0) return new int[0];
            return quickSearch(arr, 0, arr.length - 1, k - 1);
        }
        int[] quickSearch(int[] nums, int left, int right, int k) {
            int j = partition(nums, left, right);
            if (j == k) return Arrays.copyOf(nums, j + 1);
            return j > k ? quickSearch(nums, left, j - 1, k) : quickSearch(nums, j + 1, right, k);
        }

        int partition(int[] nums, int left, int right) {
            int pivot = nums[left];
            int i = left, j = right + 1;
            while (true) {
                while (++i <= right && nums[i] < pivot);
                while (--j >= left && nums[j] > pivot);
                if (i >= j) break;

                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
            nums[left] = nums[j];
            nums[j] = pivot;
            return j;
        }
}
//leetcode submit region end(Prohibit modification and deletion)

}

