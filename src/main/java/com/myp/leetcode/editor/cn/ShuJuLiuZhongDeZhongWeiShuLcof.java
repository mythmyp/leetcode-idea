/**
English description is not available for the problem. Please switch to Chinese.<div><div>Related Topics</div><div><li>设计</li><li>双指针</li><li>数据流</li><li>排序</li><li>堆（优先队列）</li></div></div><br><div><li>👍 313</li><li>👎 0</li></div>
*/
package com.myp.leetcode.editor.cn;
import com.myp.leetcode.editor.cn.commonclass.*;
import java.util.*;

public class ShuJuLiuZhongDeZhongWeiShuLcof{
    public static void main(String[] args) {
        MedianFinder solution = new ShuJuLiuZhongDeZhongWeiShuLcof().new MedianFinder();
           
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
class MedianFinder {

    /** initialize your data structure here. */
    PriorityQueue<Integer> A, B;
    public MedianFinder() {
        this.A = new PriorityQueue<>((o1, o2) -> (o2 - o1));
        this.B = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if (A.size() == B.size()) {
            A.add(num);
            B.add(A.poll());
        }
        else {
            B.add(num);
            A.add(B.poll());
        }
    }
    
    public double findMedian() {
        return A.size() == B.size() ? (A.peek() + B.peek()) / 2.0 : B.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
//leetcode submit region end(Prohibit modification and deletion)

}

