/**
<p>English description is not available for the problem. Please switch to Chinese.</p><div><div>Related Topics</div><div><li>双指针</li><li>字符串</li></div></div><br><div><li>👍 206</li><li>👎 0</li></div>
*/
package com.myp.leetcode.editor.cn;
import com.myp.leetcode.editor.cn.commonclass.*;
import java.util.*;

public class FanZhuanDanCiShunXuLcof{
    public static void main(String[] args) {
        Solution solution = new FanZhuanDanCiShunXuLcof().new Solution();
           
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseWords(String s) {
        s = s.trim(); // 删除首尾空格
        int j = s.length() - 1, i = j;
        StringBuilder res = new StringBuilder();
        while(i >= 0) {
            while(i >= 0 && s.charAt(i) != ' ') i--; // 搜索首个空格
            res.append(s.substring(i + 1, j + 1) + " "); // 添加单词
            while(i >= 0 && s.charAt(i) == ' ') i--; // 跳过单词间空格
            j = i; // j 指向下个单词的尾字符
        }
        return res.toString().trim(); // 转化为字符串并返回
    }
}

//leetcode submit region end(Prohibit modification and deletion)

}

